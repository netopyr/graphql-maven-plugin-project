package com.graphql_java_generator.client.domain.allGraphQLCases;

import java.util.List;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import com.graphql_java_generator.annotation.GraphQLInputParameters;
import com.graphql_java_generator.annotation.GraphQLNonScalar;
import com.graphql_java_generator.annotation.GraphQLScalar;

import java.util.Date;

/**
 * @author generated by graphql-java-generator
 * @see <a href="https://github.com/graphql-java-generator/graphql-java-generator">https://github.com/graphql-java-generator/graphql-java-generator</a>
 */
public interface Commented  {

	@GraphQLScalar(graphQLTypeName = "Int", javaClass = Integer.class)
	public void setNbComments(Integer nbComments);

	@GraphQLScalar(graphQLTypeName = "Int", javaClass = Integer.class)
	public Integer getNbComments();

	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	public void setComments(List<String> comments);

	@JsonDeserialize(contentAs = String.class)
	@GraphQLScalar(graphQLTypeName = "String", javaClass = String.class)
	public List<String> getComments();
}
