package com.graphql_java_generator.plugin.language;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.graphql_java_generator.plugin.language.impl.InterfaceType;
import com.graphql_java_generator.plugin.language.impl.ObjectType;
import com.graphql_java_generator.plugin.test.helper.PluginConfigurationTestHelper;

class InterfaceTypeTest {

	String packageName = "a.package.name";
	String packageName2 = "a.package.name";
	PluginConfigurationTestHelper pluginConfiguration = new PluginConfigurationTestHelper(this);

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetConcreteClassSimpleName() {
		// Preparation
		ObjectType o = new ObjectType(packageName2, pluginConfiguration);
		o.setName("AClassName");

		InterfaceType i = new InterfaceType(packageName, pluginConfiguration);

		// Verification
		assertEquals(null, i.getConcreteClassSimpleName(), "");
	}

}
