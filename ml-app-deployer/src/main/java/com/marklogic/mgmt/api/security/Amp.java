/*
 * Copyright (c) 2023 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.mgmt.api.security;

import com.marklogic.mgmt.api.API;
import com.marklogic.mgmt.api.Resource;
import com.marklogic.mgmt.resource.ResourceManager;
import com.marklogic.mgmt.resource.security.AmpManager;

import jakarta.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "amp-properties")
@XmlAccessorType(XmlAccessType.FIELD)
public class Amp extends Resource {

	@XmlElement(name = "local-name")
	private String localName;

	private String namespace;

	@XmlElement(name = "document-uri")
	private String documentUri;

	@XmlElement(name = "modules-database")
	private String modulesDatabase;

	@XmlElementWrapper(name = "roles")
	private List<String> role;

	public Amp() {
		super();
	}

	public Amp(API api, String localName) {
		super(api);
		this.localName = localName;
	}

	@Override
	protected ResourceManager getResourceManager() {
		return new AmpManager(getClient());
	}

	@Override
	protected String getResourceId() {
		return localName;
	}

	@Override
	public String[] getResourceUrlParams() {
		return new String[]{"namespace", namespace, "document-uri", documentUri, "modules-database", modulesDatabase};
	}

	public void addRole(String r) {
		if (role == null) {
			role = new ArrayList<>();
		}
		role.add(r);
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getDocumentUri() {
		return documentUri;
	}

	public void setDocumentUri(String documentUri) {
		this.documentUri = documentUri;
	}

	public String getModulesDatabase() {
		return modulesDatabase;
	}

	public void setModulesDatabase(String modulesDatabase) {
		this.modulesDatabase = modulesDatabase;
	}

	public List<String> getRole() {
		return role;
	}

	public void setRole(List<String> role) {
		this.role = role;
	}
}
