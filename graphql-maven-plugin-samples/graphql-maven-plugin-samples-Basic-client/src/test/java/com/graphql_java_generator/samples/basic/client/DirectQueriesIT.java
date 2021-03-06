package com.graphql_java_generator.samples.basic.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.generated.graphql.Query;
import com.graphql_java_generator.client.response.GraphQLRequestExecutionException;
import com.graphql_java_generator.client.response.GraphQLRequestPreparationException;

/**
 * As it is suffixed by "IT", this is an integration test. Thus, it allows us to start the GraphQL StatWars server, see
 * the pom.xml file for details.
 * 
 * @author etienne-sf
 */
class DirectQueriesIT {

	Query query;

	@BeforeEach
	void setUp() throws Exception {
		query = new Query("http://localhost:8180/graphql");
	}

	@Test
	void test_hello() throws GraphQLRequestPreparationException, GraphQLRequestExecutionException {
		assertEquals("Hello World", query.hello("", "World"));
	}

	@Test
	void test_error() {
		GraphQLRequestExecutionException e = assertThrows(GraphQLRequestExecutionException.class,
				() -> query.error(""));
		assertTrue(e.getMessage().contains("This is an expected error"));
	}

}
