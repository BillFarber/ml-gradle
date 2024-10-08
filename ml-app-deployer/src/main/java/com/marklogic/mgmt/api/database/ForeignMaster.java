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
package com.marklogic.mgmt.api.database;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ForeignMaster {

	@XmlElement(name = "foreign-cluster-name")
	private String foreignClusterName;

	@XmlElement(name = "foreign-database-name")
	private String foreignDatabaseName;

	@XmlElement(name = "connect-forests-by-name")
	private Boolean connectForestsByName;

	public String getForeignClusterName() {
		return foreignClusterName;
	}

	public void setForeignClusterName(String foreignClusterName) {
		this.foreignClusterName = foreignClusterName;
	}

	public String getForeignDatabaseName() {
		return foreignDatabaseName;
	}

	public void setForeignDatabaseName(String foreignDatabaseName) {
		this.foreignDatabaseName = foreignDatabaseName;
	}

	public Boolean getConnectForestsByName() {
		return connectForestsByName;
	}

	public void setConnectForestsByName(Boolean connectForestsByName) {
		this.connectForestsByName = connectForestsByName;
	}
}
