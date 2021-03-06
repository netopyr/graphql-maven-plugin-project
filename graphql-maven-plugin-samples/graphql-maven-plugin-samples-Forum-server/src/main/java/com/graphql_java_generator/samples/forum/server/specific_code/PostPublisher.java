/**
 * 
 */
package com.graphql_java_generator.samples.forum.server.specific_code;

import org.reactivestreams.Publisher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.graphql_java_generator.samples.forum.server.Post;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;

/**
 * This class is responsible for Publishing new Posts. This allows to send the notifications, when an application
 * subscribed to the <I>subscribeToNewPost</I> subscription.
 * 
 * @author etienne-sf
 */
@Component
public class PostPublisher {

	/** The logger for this instance */
	protected Logger logger = LoggerFactory.getLogger(this.getClass());

	PublishSubject<Post> subject = PublishSubject.create();

	public PostPublisher() {
		// in debug mode, we'll log each new entry in this subject, to check that the subject properly received the
		// events, and that the subscribers to receive them
		if (logger.isDebugEnabled()) {
			subject.subscribe(new Observer<Post>() {

				@Override
				public void onSubscribe(Disposable d) {
					logger.debug("[Debug subscriber] onSubscribe");
				}

				@Override
				public void onNext(Post t) {
					logger.debug("[Debug subscriber] onNext: " + t);
				}

				@Override
				public void onError(Throwable e) {
					logger.debug("[Debug subscriber] onError: " + e);
				}

				@Override
				public void onComplete() {
					logger.debug("[Debug subscriber] onComplete");
				}
			});
		}
	}

	/**
	 * Let's emit this new {@link Post}
	 * 
	 * @param post
	 */
	void onNext(Post post) {
		logger.debug("Emitting suscription notification for {}", post);
		subject.onNext(post);
	}

	/**
	 * Let's get a new publisher, for the GraphQL subscription that just occurred
	 * 
	 * @return
	 */
	Publisher<Post> getPublisher(String boardName) {
		logger.debug("Executing Suscription for {}", boardName);
		return subject.toFlowable(BackpressureStrategy.BUFFER);
	}

}
