/**
 * 
 */
package com.graphql_java_generator.samples.server;

import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.graphql_java_generator.samples.server.jpa.DroidRepository;
import com.graphql_java_generator.samples.server.jpa.HumanRepository;

import graphql.schema.DataFetchingEnvironment;
import io.reactivex.subjects.Subject;

/**
 * @author etienne-sf
 */
@Component
public class DataFetchersDelegateMutationTypeImpl implements DataFetchersDelegateMutationType {

	@Resource
	HumanRepository humanRepository;
	@Resource
	DroidRepository droidRepository;
	@Resource
	CharacterHelper characterHelper;

	/**
	 * This {@link Subject} will be notified for each Human or Droid creation. This is the basis for the
	 * <I>newCharacter</I> subscription
	 */
	@Resource
	CharacterPublisher characterPublisher;

	@Override
	public Human createHuman(DataFetchingEnvironment dataFetchingEnvironment, String name, String homePlanet) {
		Human human = new Human();
		human.setName(name);
		human.setHomePlanet(homePlanet);
		humanRepository.save(human);

		characterPublisher.onNext(human);

		return human;
	}

	@Override
	public Character addFriend(DataFetchingEnvironment dataFetchingEnvironment, String idCharacter, String idFriend) {
		// What kind of character is it?
		Character c = characterHelper.findById(UUID.fromString(idCharacter));

		if (c == null) {
			throw new RuntimeException(idCharacter + " is not an id of a an existing character");
		} else if (c instanceof Human) {
			humanRepository.addFriend(UUID.fromString(idCharacter), UUID.fromString(idFriend));
		} else if (c instanceof Droid) {
			droidRepository.addFriend(UUID.fromString(idCharacter), UUID.fromString(idFriend));
		} else {
			throw new RuntimeException(
					idCharacter + " is a character of an unknown type (" + c.getClass().getName() + ")");
		}

		// Then we return the new friend
		return characterHelper.findById(UUID.fromString(idCharacter));
	}

}
