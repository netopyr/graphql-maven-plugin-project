package com.graphql_java_generator.plugin.test.helper;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.graphql_java_generator.plugin.CustomScalarDefinition;
import com.graphql_java_generator.plugin.Logger;
import com.graphql_java_generator.plugin.Packaging;
import com.graphql_java_generator.plugin.PluginConfiguration;
import com.graphql_java_generator.plugin.PluginMode;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author etienne-sf
 */
@Getter
@Setter
public class PluginConfigurationTestHelper implements PluginConfiguration {

	// All getters are generated thanks to Lombok, see the '@Getter' class annotation
	final Logger log;

	public boolean copyRuntimeSources = false; // This will speed build time up (less classes to compile, and allow
	// to load several generated source folders in the IDE.
	public List<CustomScalarDefinition> customScalars = new ArrayList<>();
	public boolean generateJPAAnnotation = true;
	public PluginMode mode = null;
	public String packageName = null;
	public Packaging packaging = null;
	public File schemaFileFolder = null;
	public String schemaFilePattern = null;
	public File schemaPersonalizationFile = null;
	public boolean separateUtilityClasses = false;
	public String sourceEncoding = null;
	public File targetClassFolder = null;
	public File targetSourceFolder = null;
	public Map<String, String> templates = new HashMap<String, String>();

	/**
	 * @param caller
	 *            Used to retrieve the appropriate Log4j logger
	 */
	public PluginConfigurationTestHelper(Object caller) {
		log = new Slf4jLogger(caller);
	}

}
