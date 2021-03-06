/*
 * Copyright (c) 2018, hiwepy (https://github.com/hiwepy).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package ro.fortsoft.pf4j.spring.boot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import ro.fortsoft.pf4j.RuntimeMode;

/**
 * 
 */
@ConfigurationProperties(prefix = Pf4jProperties.PREFIX)
public class Pf4jProperties {

	public static final String PREFIX = "pf4j";

	/** Enable Pf4j. */
	private boolean enabled = false;
	/** Whether to automatically inject dependent objects */
	private boolean autowire = true;
	/** Whether to register the object to the spring context */
	private boolean injectable = true;
	/** Whether always returns a singleton instance. */
	private boolean singleton = true;
	/** Extended Plugin Class Directory **/
	private List<String> classesDirectories = new ArrayList<String>();
	/** Extended Plugin Jar Directory **/
	private List<String> libDirectories = new ArrayList<String>();
	/**
	 * The runtime mode. Must currently be either DEVELOPMENT or DEPLOYMENT.
	 */
	private RuntimeMode runtimeMode = RuntimeMode.DEPLOYMENT;
	/**
	 * Plugin root directory: default “plugins”; when non-jar mode plugin, the value
	 * should be an absolute directory address
	 **/
	private String pluginsRoot = "plugins";
	/** Plugin address: absolute address **/
	private List<String> plugins = new ArrayList<String>();
	/** Whether the plugin is a JAR package **/
	private boolean jarPackages = true;
	/* The system version used for comparisons to the plugin requires attribute. */
	private String systemVersion = "0.0.0";
	/** Whether to automatically update the plugin **/
	private boolean autoUpdate = false;
	/** The delay of plugin automatic update check, default：10000 milliseconds **/
	private long delay = 10000;
	/** The period of plugin automatic update check, default：10 seconds **/
	private long period = 1000 * 60 * 10;
	/** Local Repos Path , i.e : repositories.json**/
	protected String reposJsonPath;
	/** Remote Repos Path **/
	protected List<Pf4jUpdateProperties> repos = new ArrayList<Pf4jUpdateProperties>();
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	public boolean isAutowire() {
		return autowire;
	}

	public void setAutowire(boolean autowire) {
		this.autowire = autowire;
	}

	public boolean isInjectable() {
		return injectable;
	}

	public void setInjectable(boolean injectable) {
		this.injectable = injectable;
	}

	public boolean isSingleton() {
		return singleton;
	}

	public void setSingleton(boolean singleton) {
		this.singleton = singleton;
	}

	public List<String> getClassesDirectories() {
		return classesDirectories;
	}

	public void setClassesDirectories(List<String> classesDirectories) {
		this.classesDirectories = classesDirectories;
	}

	public List<String> getLibDirectories() {
		return libDirectories;
	}

	public void setLibDirectories(List<String> libDirectories) {
		this.libDirectories = libDirectories;
	}

	public RuntimeMode getRuntimeMode() {
		return runtimeMode;
	}

	public void setRuntimeMode(RuntimeMode runtimeMode) {
		this.runtimeMode = runtimeMode;
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}

	public String getPluginsRoot() {
		return pluginsRoot;
	}

	public void setPluginsRoot(String pluginsRoot) {
		this.pluginsRoot = pluginsRoot;
	}

	public List<String> getPlugins() {
		return plugins;
	}

	public void setPlugins(List<String> plugins) {
		this.plugins = plugins;
	}

	public boolean isJarPackages() {
		return jarPackages;
	}

	public void setJarPackages(boolean jarPackages) {
		this.jarPackages = jarPackages;
	}

	public boolean isAutoUpdate() {
		return autoUpdate;
	}

	public void setAutoUpdate(boolean autoUpdate) {
		this.autoUpdate = autoUpdate;
	}
	
	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public long getPeriod() {
		return period;
	}

	public void setPeriod(long period) {
		this.period = period;
	}

	public String getReposJsonPath() {
		return reposJsonPath;
	}

	public void setReposJsonPath(String reposJsonPath) {
		this.reposJsonPath = reposJsonPath;
	}

	public List<Pf4jUpdateProperties> getRepos() {
		return repos;
	}

	public void setRepos(List<Pf4jUpdateProperties> repos) {
		this.repos = repos;
	}
	
}
