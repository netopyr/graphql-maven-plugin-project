package com.graphql_java_generator.plugin.compilation_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.graphql_java_generator.plugin.test.helper.PluginConfigurationTestHelper;

import graphql.mavenplugin_notscannedbyspring.Shopify_Server_SpringConfiguration;

@Disabled // Generates a stack overflow in the Java Compiler! :(
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { Shopify_Server_SpringConfiguration.class })
@Tag("shopify")
class ShopifyServerTest extends AbstractIntegrationTest {

	// Everything is in the AbstractIntegrationTest class.

	// The only aim of this class, is to have its own Spring Configuration

	@BeforeEach
	public void setUp() {
		((PluginConfigurationTestHelper) pluginConfiguration).separateUtilityClasses = true;
		graphqlTestHelper.checkSchemaStringProvider("shopify.graphqls");
	}

}
