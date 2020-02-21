package com.graphql_java_generator.client.domain.allGraphQLCases;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLQuery;
import com.graphql_java_generator.client.GraphqlClientUtils;
import com.graphql_java_generator.client.QueryExecutor;
import com.graphql_java_generator.client.QueryExecutorImpl;
import com.graphql_java_generator.client.request.Builder;
import com.graphql_java_generator.client.request.InputParameter;
import com.graphql_java_generator.client.request.ObjectResponse;
import com.graphql_java_generator.exception.GraphQLRequestExecutionException;
import com.graphql_java_generator.exception.GraphQLRequestPreparationException;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public class TheSubscriptionType {

	/** Logger for this class */
	private static Logger logger = LogManager.getLogger();

	final GraphqlClientUtils graphqlClientUtils = new GraphqlClientUtils();

	final QueryExecutor executor;

	/**
	 * This constructor expects the URI of the GraphQL server. This constructor works only for http servers, not for
	 * https ones.<BR/>
	 * For example: http://my.server.com/graphql
	 * 
	 * @param graphqlEndpoint
	 *            the http URI for the GraphQL endpoint
	 */
	public TheSubscriptionType(String graphqlEndpoint) {
		this.executor = new QueryExecutorImpl(graphqlEndpoint);
		new CustomScalarRegistryInitializer().initCustomScalarRegistry();
	}

	/**
	 * This constructor expects the URI of the GraphQL server. This constructor works only for https servers, not for
	 * http ones.<BR/>
	 * For example: https://my.server.com/graphql<BR/><BR/>
	 * {@link SSLContext} and {@link HostnameVerifier} are regular Java stuff. You'll find lots of documentation on the web. 
	 * The StarWars sample is based on the <A HREF="http://www.thinkcode.se/blog/2019/01/27/a-jersey-client-supporting-https">http://www.thinkcode.se/blog/2019/01/27/a-jersey-client-supporting-https</A> blog.
	 * But this sample implements a noHostVerification, which of course, is the simplest but the safest way to go.
	 * 
	 * @param graphqlEndpoint
	 *            the https URI for the GraphQL endpoint
	 * @param sslContext
	 * @param hostnameVerifier
	 */
	public TheSubscriptionType(String graphqlEndpoint, SSLContext sslContext, HostnameVerifier hostnameVerifier) {
		this.executor = new QueryExecutorImpl(graphqlEndpoint, sslContext, hostnameVerifier);
	}
	
	/**
	 * This method is expected by the graphql-java framework. It will be called when this query is called. It offers a
	 * logging of the call (if in debug mode), or of the call and its parameters (if in trace mode).<BR/>
	 * This method takes care of writting the query name, and the parameter(s) for the query. The given queryResponseDef
	 * describes the format of the response of the server response, that is the expected fields of the {@link Human}
	 * GraphQL type. It can be something like "{ id name }", if you want these fields of this type. Please take a look at
	 * the StarWars, Forum and other samples for more complex queries.<BR/>
	 * This method is valid for queries/mutations/subscriptions which don't have bind variables, as there is no 
	 * <I>parameters</I> argument to pass the list of values.
	 * 
	 * @param queryResponseDef
	 *            The response definition of the query, in the native GraphQL format (see here above)
	 * @param episode Parameter for the subscribeNewHumanForEpisode field of TheSubscriptionType, as defined in the GraphQL schema
	 * @throws IOException
	 * @throws GraphQLRequestPreparationException
	 *             When an error occurs during the request preparation, typically when building the
	 *             {@link ObjectResponse}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	@GraphQLNonScalar(graphQLTypeName = "Human", javaClass = Human.class)
	@GraphQLQuery
	public Human subscribeNewHumanForEpisode(String queryResponseDef, Episode episode)
			throws GraphQLRequestExecutionException, GraphQLRequestPreparationException {
		logger.debug("Executing of query 'subscribeNewHumanForEpisode' in query mode: {} ", queryResponseDef);
		ObjectResponse objectResponse = getSubscribeNewHumanForEpisodeResponseBuilder().withQueryResponseDef(queryResponseDef).build();
		return subscribeNewHumanForEpisodeWithBindValues(objectResponse, episode, null);
	}

	/**
	 * This method is expected by the graphql-java framework. It will be called when this query is called. It offers a
	 * logging of the call (if in debug mode), or of the call and its parameters (if in trace mode).<BR/>
	 * This method takes care of writting the query name, and the parameter(s) for the query. The given queryResponseDef
	 * describes the format of the response of the server response, that is the expected fields of the {@link Human}
	 * GraphQL type. It can be something like "{ id name }", if you want these fields of this type. Please take a look at
	 * the StarWars, Forum and other samples for more complex queries.
	 * 
	 * @param queryResponseDef
	 *            The response definition of the query, in the native GraphQL format (see here above)
	 * @param episode Parameter for the subscribeNewHumanForEpisode field of TheSubscriptionType, as defined in the GraphQL schema
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws IOException
	 * @throws GraphQLRequestPreparationException
	 *             When an error occurs during the request preparation, typically when building the
	 *             {@link ObjectResponse}
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	@GraphQLNonScalar(graphQLTypeName = "Human", javaClass = Human.class)
	@GraphQLQuery
	public Human subscribeNewHumanForEpisodeWithBindValues(String queryResponseDef, Episode episode, Map<String, Object> parameters)
			throws GraphQLRequestExecutionException, GraphQLRequestPreparationException {
		logger.debug("Executing of query 'subscribeNewHumanForEpisode' in query mode: {} ", queryResponseDef);
		ObjectResponse objectResponse = getSubscribeNewHumanForEpisodeResponseBuilder().withQueryResponseDef(queryResponseDef).build();
		return subscribeNewHumanForEpisode(objectResponse, episode, parameters);
	}


	/**
	 * This method is expected by the graphql-java framework. It will be called when this query is called. It offers a
	 * logging of the call (if in debug mode), or of the call and its parameters (if in trace mode).<BR/>
	 * This method is valid for queries/mutations/subscriptions which don't have bind variables, as there is no 
	 * <I>parameters</I> argument to pass the list of values.  
	 * 
	 * @param objectResponse
	 *            The definition of the response format, that describes what the GraphQL server is expected to return
	 * @param episode Parameter for the subscribeNewHumanForEpisode field of TheSubscriptionType, as defined in the GraphQL schema
	 * @throws IOException
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	@GraphQLNonScalar(graphQLTypeName = "Human", javaClass = Human.class)
	@GraphQLQuery
	public Human subscribeNewHumanForEpisode(ObjectResponse objectResponse, Episode episode)
			throws GraphQLRequestExecutionException  {
		return subscribeNewHumanForEpisodeWithBindValues(objectResponse, episode, null);
	}

	/**
	 * This method is expected by the graphql-java framework. It will be called when this query is called. It offers a
	 * logging of the call (if in debug mode), or of the call and its parameters (if in trace mode).
	 * 
	 * @param objectResponse
	 *            The definition of the response format, that describes what the GraphQL server is expected to return
	 * @param episode Parameter for the subscribeNewHumanForEpisode field of TheSubscriptionType, as defined in the GraphQL schema
	 * @param parameters
	 *            The list of values, for the bind variables defined in the query. If there is no bind variable in the
	 *            defined Query, this argument may be null or an empty {@link Map}
	 * @throws IOException
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	@GraphQLNonScalar(graphQLTypeName = "Human", javaClass = Human.class)
	@GraphQLQuery
	public Human subscribeNewHumanForEpisodeWithBindValues(ObjectResponse objectResponse, Episode episode, Map<String, Object> parameters)
			throws GraphQLRequestExecutionException  {
		if (logger.isTraceEnabled()) {
			logger.trace("Executing of subscription 'subscribeNewHumanForEpisode' with parameters: {} ", episode);
		} else if (logger.isDebugEnabled()) {
			logger.debug("Executing of subscription 'subscribeNewHumanForEpisode'");
		}
	
		// Given values for the BindVariables
		parameters = (parameters != null) ? parameters : new HashMap<>();
		parameters.put("theSubscriptionTypeSubscribeNewHumanForEpisodeEpisode", episode);

		if (!Human.class.equals(objectResponse.getFieldClass())) {
			throw new GraphQLRequestExecutionException("The ObjectResponse parameter should be an instance of "
					+ Human.class + ", but is an instance of " + objectResponse.getClass().getName());
		}

		TheSubscriptionTypeSubscribeNewHumanForEpisode ret = executor.execute("subscription", objectResponse, parameters, TheSubscriptionTypeSubscribeNewHumanForEpisode.class);
		
		return ret.subscribeNewHumanForEpisode;
	}

	/**
	 * This method is expected by the graphql-java framework. It will be called when this query is called. It offers a
	 * logging of the call (if in debug mode), or of the call and its parameters (if in trace mode).
	 * 
	 * @param objectResponse
	 *            The definition of the response format, that describes what the GraphQL server is expected to return
	 * @param episode Parameter for the subscribeNewHumanForEpisode field of TheSubscriptionType, as defined in the GraphQL schema
	 * @param paramsAndValues
	 *            This parameter contains all the name and values for the Bind Variables defined in the objectResponse
	 *            parameter, that must be sent to the server. Optional parameter may not have a value. They will be
	 *            ignored and not sent to the server. Mandatory parameter must be provided in this argument.<BR/>
	 *            This parameter contains an even number of parameters: it must be a series of name and values :
	 *            (paramName1, paramValue1, paramName2, paramValue2...)
	 * @throws IOException
	 * @throws GraphQLRequestExecutionException
	 *             When an error occurs during the request execution, typically a network error, an error from the
	 *             GraphQL server or if the server response can't be parsed
	 */
	@GraphQLNonScalar(graphQLTypeName = "Human", javaClass = Human.class)
	@GraphQLQuery
	public Human subscribeNewHumanForEpisode(ObjectResponse objectResponse, Episode episode, Object... paramsAndValues)
			throws GraphQLRequestExecutionException  {
		if (logger.isTraceEnabled()) {
			StringBuffer sb = new StringBuffer();
			sb.append("Executing of query 'subscribeNewHumanForEpisode' with bind variables: ");
			boolean addComma = false;
			for (Object o : paramsAndValues) {
				if (o != null) {
					sb.append(o.toString());
					if (addComma)
						sb.append(", ");
					addComma = true;
				}
			}
			logger.trace(sb.toString());
		} else if (logger.isDebugEnabled()) {
			logger.debug("Executing of query 'subscribeNewHumanForEpisode' (with bind variables)");
		}

		if (!Human.class.equals(objectResponse.getFieldClass())) {
			throw new GraphQLRequestExecutionException("The ObjectResponse parameter should be an instance of "
					+ Human.class + ", but is an instance of " + objectResponse.getClass().getName());
		}

		Map<String, Object> bindVariableValues = graphqlClientUtils.generatesBindVariableValuesMap(paramsAndValues);
		bindVariableValues.put("theSubscriptionTypeSubscribeNewHumanForEpisodeEpisode", episode);
		
		TheSubscriptionTypeSubscribeNewHumanForEpisode ret = executor.execute("subscription", objectResponse, bindVariableValues, TheSubscriptionTypeSubscribeNewHumanForEpisode.class);
		
		return ret.subscribeNewHumanForEpisode;
	}

	/**
	 * Get the {@link ObjectResponse.Builder} for the Human, as expected by the subscribeNewHumanForEpisode query.
	 * 
	 * @return
	 * @throws GraphQLRequestPreparationException
	 */
	public Builder getSubscribeNewHumanForEpisodeResponseBuilder() throws GraphQLRequestPreparationException {
		Builder builder = new Builder(getClass(), "subscribeNewHumanForEpisode");
		builder.withInputParameter(InputParameter.newBindParameter("episode","theSubscriptionTypeSubscribeNewHumanForEpisodeEpisode", false, null));
		return builder;
	}
	
}
