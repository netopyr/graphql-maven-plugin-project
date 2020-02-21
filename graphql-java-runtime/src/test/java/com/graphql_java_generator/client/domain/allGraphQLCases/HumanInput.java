package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLInputType;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
@GraphQLInputType
public class HumanInput  {

	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String name;


	@GraphQLNonScalar(graphQLTypeName = "CharacterInput", javaClass = CharacterInput.class)
	CharacterInput bestFriend;


	@JsonDeserialize(contentAs = CharacterInput.class)
	@GraphQLNonScalar(graphQLTypeName = "CharacterInput", javaClass = CharacterInput.class)
	List<CharacterInput> friends;


	@GraphQLScalar(graphQLTypeName = "Int", javaClass = Integer.class)
	Integer nbComments;


	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	List<String> comments;


	@JsonDeserialize(contentAs = Episode.class)
	@GraphQLScalar(graphQLTypeName = "Episode", javaClass = Episode.class)
	List<Episode> appearsIn;


	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	String homePlanet;



	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBestFriend(CharacterInput bestFriend) {
		this.bestFriend = bestFriend;
	}

	public CharacterInput getBestFriend() {
		return bestFriend;
	}

	public void setFriends(List<CharacterInput> friends) {
		this.friends = friends;
	}

	public List<CharacterInput> getFriends() {
		return friends;
	}

	public void setNbComments(Integer nbComments) {
		this.nbComments = nbComments;
	}

	public Integer getNbComments() {
		return nbComments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public List<String> getComments() {
		return comments;
	}

	public void setAppearsIn(List<Episode> appearsIn) {
		this.appearsIn = appearsIn;
	}

	public List<Episode> getAppearsIn() {
		return appearsIn;
	}

	public void setHomePlanet(String homePlanet) {
		this.homePlanet = homePlanet;
	}

	public String getHomePlanet() {
		return homePlanet;
	}

    public String toString() {
        return "HumanInput {"
				+ "name: " + name
				+ ", "
				+ "bestFriend: " + bestFriend
				+ ", "
				+ "friends: " + friends
				+ ", "
				+ "nbComments: " + nbComments
				+ ", "
				+ "comments: " + comments
				+ ", "
				+ "appearsIn: " + appearsIn
				+ ", "
				+ "homePlanet: " + homePlanet
        		+ "}";
    }
}
