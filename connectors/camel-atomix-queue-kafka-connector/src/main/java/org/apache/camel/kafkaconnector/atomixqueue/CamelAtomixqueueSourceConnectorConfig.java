/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.kafkaconnector.atomixqueue;

import java.util.Map;
import javax.annotation.Generated;
import org.apache.camel.kafkaconnector.CamelSourceConnectorConfig;
import org.apache.kafka.common.config.ConfigDef;

@Generated("This class has been generated by camel-kafka-connector-generator-maven-plugin, remove this annotation to prevent it from being generated.")
public class CamelAtomixqueueSourceConnectorConfig
        extends
            CamelSourceConnectorConfig {

    public static final String CAMEL_SOURCE_ATOMIXQUEUE_PATH_RESOURCE_NAME_CONF = "camel.source.path.resourceName";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_PATH_RESOURCE_NAME_DOC = "The distributed resource name";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_PATH_RESOURCE_NAME_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_ATOMIX_CONF = "camel.source.endpoint.atomix";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_ATOMIX_DOC = "The Atomix instance to use";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_ATOMIX_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_CONFIGURATION_URI_CONF = "camel.source.endpoint.configurationUri";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_CONFIGURATION_URI_DOC = "The Atomix configuration uri.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_ACTION_CONF = "camel.source.endpoint.defaultAction";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_ACTION_DOC = "The default action. One of: [ADD] [OFFER] [PEEK] [POLL] [CLEAR] [CONTAINS] [IS_EMPTY] [REMOVE] [SIZE]";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_ACTION_DEFAULT = "ADD";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_NODES_CONF = "camel.source.endpoint.nodes";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_NODES_DOC = "The address of the nodes composing the cluster.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_NODES_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESULT_HEADER_CONF = "camel.source.endpoint.resultHeader";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESULT_HEADER_DOC = "The header that wil carry the result.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESULT_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_TRANSPORT_CLASS_NAME_CONF = "camel.source.endpoint.transportClassName";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_TRANSPORT_CLASS_NAME_DOC = "The class name (fqn) of the Atomix transport";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_TRANSPORT_CLASS_NAME_DEFAULT = "io.atomix.catalyst.transport.netty.NettyTransport";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF = "camel.source.endpoint.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCEPTION_HANDLER_CONF = "camel.source.endpoint.exceptionHandler";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCEPTION_HANDLER_DOC = "To let the consumer use a custom ExceptionHandler. Notice if the option bridgeErrorHandler is enabled then this option is not in use. By default the consumer will deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCHANGE_PATTERN_CONF = "camel.source.endpoint.exchangePattern";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCHANGE_PATTERN_DOC = "Sets the exchange pattern when the consumer creates an exchange. One of: [InOnly] [InOut] [InOptionalOut]";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF = "camel.source.endpoint.basicPropertyBinding";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC = "Whether the endpoint should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_CONFIG_CONF = "camel.source.endpoint.defaultResourceConfig";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DOC = "The cluster wide default resource configuration.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_CONF = "camel.source.endpoint.defaultResourceOptions";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DOC = "The local default resource options.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EPHEMERAL_CONF = "camel.source.endpoint.ephemeral";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EPHEMERAL_DOC = "Sets if the local member should join groups as PersistentMember or not. If set to ephemeral the local member will receive an auto generated ID thus the local one is ignored.";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EPHEMERAL_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_READ_CONSISTENCY_CONF = "camel.source.endpoint.readConsistency";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_READ_CONSISTENCY_DOC = "The read consistency level. One of: [ATOMIC] [ATOMIC_LEASE] [SEQUENTIAL] [LOCAL]";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_READ_CONSISTENCY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_CONFIGS_CONF = "camel.source.endpoint.resourceConfigs";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_CONFIGS_DOC = "Cluster wide resources configuration.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_CONFIGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_OPTIONS_CONF = "camel.source.endpoint.resourceOptions";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_OPTIONS_DOC = "Local resources configurations";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_SYNCHRONOUS_CONF = "camel.source.endpoint.synchronous";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_SYNCHRONOUS_DOC = "Sets whether synchronous processing should be strictly used, or Camel is allowed to use asynchronous processing (if supported).";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_ATOMIX_CONF = "camel.component.atomix-queue.atomix";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_ATOMIX_DOC = "The Atomix instance to use";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_ATOMIX_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_CONF = "camel.component.atomix-queue.configuration";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_DOC = "The shared component configuration";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_URI_CONF = "camel.component.atomix-queue.configurationUri";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_URI_DOC = "The path to the AtomixClient configuration";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_URI_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_ACTION_CONF = "camel.component.atomix-queue.defaultAction";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_ACTION_DOC = "The default action. One of: [ADD] [OFFER] [PEEK] [POLL] [CLEAR] [CONTAINS] [IS_EMPTY] [REMOVE] [SIZE]";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_ACTION_DEFAULT = "ADD";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_NODES_CONF = "camel.component.atomix-queue.nodes";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_NODES_DOC = "The nodes the AtomixClient should connect to";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_NODES_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESULT_HEADER_CONF = "camel.component.atomix-queue.resultHeader";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESULT_HEADER_DOC = "The header that wil carry the result.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESULT_HEADER_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_TRANSPORT_CLASS_NAME_CONF = "camel.component.atomix-queue.transportClassName";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_TRANSPORT_CLASS_NAME_DOC = "The class name (fqn) of the Atomix transport";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_TRANSPORT_CLASS_NAME_DEFAULT = "io.atomix.catalyst.transport.netty.NettyTransport";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF = "camel.component.atomix-queue.bridgeErrorHandler";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC = "Allows for bridging the consumer to the Camel routing Error Handler, which mean any exceptions occurred while the consumer is trying to pickup incoming messages, or the likes, will now be processed as a message and handled by the routing Error Handler. By default the consumer will use the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that will be logged at WARN or ERROR level and ignored.";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_CONF = "camel.component.atomix-queue.basicPropertyBinding";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DOC = "Whether the component should use basic property binding (Camel 2.x) or the newer property binding with additional capabilities";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_CONFIG_CONF = "camel.component.atomix-queue.defaultResourceConfig";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_CONFIG_DOC = "The cluster wide default resource configuration.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_CONFIG_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_OPTIONS_CONF = "camel.component.atomix-queue.defaultResourceOptions";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DOC = "The local default resource options.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_EPHEMERAL_CONF = "camel.component.atomix-queue.ephemeral";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_EPHEMERAL_DOC = "Sets if the local member should join groups as PersistentMember or not. If set to ephemeral the local member will receive an auto generated ID thus the local one is ignored.";
    public static final Boolean CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_EPHEMERAL_DEFAULT = false;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_READ_CONSISTENCY_CONF = "camel.component.atomix-queue.readConsistency";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_READ_CONSISTENCY_DOC = "The read consistency level. One of: [ATOMIC] [ATOMIC_LEASE] [SEQUENTIAL] [LOCAL]";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_READ_CONSISTENCY_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_CONFIGS_CONF = "camel.component.atomix-queue.resourceConfigs";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_CONFIGS_DOC = "Cluster wide resources configuration.";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_CONFIGS_DEFAULT = null;
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_OPTIONS_CONF = "camel.component.atomix-queue.resourceOptions";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_OPTIONS_DOC = "Local resources configurations";
    public static final String CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_OPTIONS_DEFAULT = null;

    public CamelAtomixqueueSourceConnectorConfig(
            ConfigDef config,
            Map<String, String> parsedConfig) {
        super(config, parsedConfig);
    }

    public CamelAtomixqueueSourceConnectorConfig(
            Map<String, String> parsedConfig) {
        this(conf(), parsedConfig);
    }

    public static ConfigDef conf() {
        ConfigDef conf = new ConfigDef(CamelSourceConnectorConfig.conf());
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_PATH_RESOURCE_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_PATH_RESOURCE_NAME_DEFAULT, ConfigDef.Importance.HIGH, CAMEL_SOURCE_ATOMIXQUEUE_PATH_RESOURCE_NAME_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_ATOMIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_ATOMIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_ATOMIX_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_ACTION_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_NODES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_NODES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_NODES_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESULT_HEADER_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_TRANSPORT_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_TRANSPORT_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_TRANSPORT_CLASS_NAME_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCEPTION_HANDLER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCEPTION_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCEPTION_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCHANGE_PATTERN_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCHANGE_PATTERN_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EXCHANGE_PATTERN_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_CONFIG_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_DEFAULT_RESOURCE_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EPHEMERAL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EPHEMERAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_EPHEMERAL_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_READ_CONSISTENCY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_READ_CONSISTENCY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_READ_CONSISTENCY_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_CONFIGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_CONFIGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_CONFIGS_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_RESOURCE_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_SYNCHRONOUS_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_SYNCHRONOUS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_ENDPOINT_SYNCHRONOUS_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_ATOMIX_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_ATOMIX_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_ATOMIX_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_URI_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_URI_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_CONFIGURATION_URI_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_ACTION_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_ACTION_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_ACTION_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_NODES_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_NODES_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_NODES_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESULT_HEADER_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESULT_HEADER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESULT_HEADER_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_TRANSPORT_CLASS_NAME_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_TRANSPORT_CLASS_NAME_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_TRANSPORT_CLASS_NAME_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BRIDGE_ERROR_HANDLER_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_BASIC_PROPERTY_BINDING_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_CONFIG_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_CONFIG_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_CONFIG_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_DEFAULT_RESOURCE_OPTIONS_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_EPHEMERAL_CONF, ConfigDef.Type.BOOLEAN, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_EPHEMERAL_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_EPHEMERAL_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_READ_CONSISTENCY_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_READ_CONSISTENCY_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_READ_CONSISTENCY_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_CONFIGS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_CONFIGS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_CONFIGS_DOC);
        conf.define(CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_OPTIONS_CONF, ConfigDef.Type.STRING, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_OPTIONS_DEFAULT, ConfigDef.Importance.MEDIUM, CAMEL_SOURCE_ATOMIXQUEUE_COMPONENT_RESOURCE_OPTIONS_DOC);
        return conf;
    }
}