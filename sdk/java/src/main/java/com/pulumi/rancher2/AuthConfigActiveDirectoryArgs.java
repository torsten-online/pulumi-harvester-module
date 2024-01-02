// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigActiveDirectoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigActiveDirectoryArgs Empty = new AuthConfigActiveDirectoryArgs();

    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Import(name="accessMode")
    private @Nullable Output<String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Optional<Output<String>> accessMode() {
        return Optional.ofNullable(this.accessMode);
    }

    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
     * 
     */
    @Import(name="allowedPrincipalIds")
    private @Nullable Output<List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
     * 
     */
    public Optional<Output<List<String>>> allowedPrincipalIds() {
        return Optional.ofNullable(this.allowedPrincipalIds);
    }

    /**
     * Annotations of the resource (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * CA certificate for TLS if selfsigned (string)
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return CA certificate for TLS if selfsigned (string)
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * ActiveDirectory connection timeout. Default `5000` (int)
     * 
     */
    @Import(name="connectionTimeout")
    private @Nullable Output<Integer> connectionTimeout;

    /**
     * @return ActiveDirectory connection timeout. Default `5000` (int)
     * 
     */
    public Optional<Output<Integer>> connectionTimeout() {
        return Optional.ofNullable(this.connectionTimeout);
    }

    /**
     * ActiveDirectory defult login domain (string)
     * 
     */
    @Import(name="defaultLoginDomain")
    private @Nullable Output<String> defaultLoginDomain;

    /**
     * @return ActiveDirectory defult login domain (string)
     * 
     */
    public Optional<Output<String>> defaultLoginDomain() {
        return Optional.ofNullable(this.defaultLoginDomain);
    }

    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Group DN attribute. Default `distinguishedName` (string)
     * 
     */
    @Import(name="groupDnAttribute")
    private @Nullable Output<String> groupDnAttribute;

    /**
     * @return Group DN attribute. Default `distinguishedName` (string)
     * 
     */
    public Optional<Output<String>> groupDnAttribute() {
        return Optional.ofNullable(this.groupDnAttribute);
    }

    /**
     * Group member mapping attribute. Default `member` (string)
     * 
     */
    @Import(name="groupMemberMappingAttribute")
    private @Nullable Output<String> groupMemberMappingAttribute;

    /**
     * @return Group member mapping attribute. Default `member` (string)
     * 
     */
    public Optional<Output<String>> groupMemberMappingAttribute() {
        return Optional.ofNullable(this.groupMemberMappingAttribute);
    }

    /**
     * Group member user attribute. Default `distinguishedName` (string)
     * 
     */
    @Import(name="groupMemberUserAttribute")
    private @Nullable Output<String> groupMemberUserAttribute;

    /**
     * @return Group member user attribute. Default `distinguishedName` (string)
     * 
     */
    public Optional<Output<String>> groupMemberUserAttribute() {
        return Optional.ofNullable(this.groupMemberUserAttribute);
    }

    /**
     * Group name attribute. Default `name` (string)
     * 
     */
    @Import(name="groupNameAttribute")
    private @Nullable Output<String> groupNameAttribute;

    /**
     * @return Group name attribute. Default `name` (string)
     * 
     */
    public Optional<Output<String>> groupNameAttribute() {
        return Optional.ofNullable(this.groupNameAttribute);
    }

    /**
     * Group object class. Default `group` (string)
     * 
     */
    @Import(name="groupObjectClass")
    private @Nullable Output<String> groupObjectClass;

    /**
     * @return Group object class. Default `group` (string)
     * 
     */
    public Optional<Output<String>> groupObjectClass() {
        return Optional.ofNullable(this.groupObjectClass);
    }

    /**
     * Group search attribute. Default `sAMAccountName` (string)
     * 
     */
    @Import(name="groupSearchAttribute")
    private @Nullable Output<String> groupSearchAttribute;

    /**
     * @return Group search attribute. Default `sAMAccountName` (string)
     * 
     */
    public Optional<Output<String>> groupSearchAttribute() {
        return Optional.ofNullable(this.groupSearchAttribute);
    }

    /**
     * Group search base (string)
     * 
     */
    @Import(name="groupSearchBase")
    private @Nullable Output<String> groupSearchBase;

    /**
     * @return Group search base (string)
     * 
     */
    public Optional<Output<String>> groupSearchBase() {
        return Optional.ofNullable(this.groupSearchBase);
    }

    /**
     * Group search filter (string)
     * 
     */
    @Import(name="groupSearchFilter")
    private @Nullable Output<String> groupSearchFilter;

    /**
     * @return Group search filter (string)
     * 
     */
    public Optional<Output<String>> groupSearchFilter() {
        return Optional.ofNullable(this.groupSearchFilter);
    }

    /**
     * Labels of the resource (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Nested group membership enable. Default `false` (bool)
     * 
     */
    @Import(name="nestedGroupMembershipEnabled")
    private @Nullable Output<Boolean> nestedGroupMembershipEnabled;

    /**
     * @return Nested group membership enable. Default `false` (bool)
     * 
     */
    public Optional<Output<Boolean>> nestedGroupMembershipEnabled() {
        return Optional.ofNullable(this.nestedGroupMembershipEnabled);
    }

    /**
     * ActiveDirectory port. Default `389` (int)
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return ActiveDirectory port. Default `389` (int)
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * ActiveDirectory servers list (list)
     * 
     */
    @Import(name="servers", required=true)
    private Output<List<String>> servers;

    /**
     * @return ActiveDirectory servers list (list)
     * 
     */
    public Output<List<String>> servers() {
        return this.servers;
    }

    /**
     * Service account password for access ActiveDirectory service (string)
     * 
     */
    @Import(name="serviceAccountPassword", required=true)
    private Output<String> serviceAccountPassword;

    /**
     * @return Service account password for access ActiveDirectory service (string)
     * 
     */
    public Output<String> serviceAccountPassword() {
        return this.serviceAccountPassword;
    }

    /**
     * Service account DN for access ActiveDirectory service (string)
     * 
     */
    @Import(name="serviceAccountUsername", required=true)
    private Output<String> serviceAccountUsername;

    /**
     * @return Service account DN for access ActiveDirectory service (string)
     * 
     */
    public Output<String> serviceAccountUsername() {
        return this.serviceAccountUsername;
    }

    /**
     * Enable start TLS connection (bool)
     * 
     */
    @Import(name="startTls")
    private @Nullable Output<Boolean> startTls;

    /**
     * @return Enable start TLS connection (bool)
     * 
     */
    public Optional<Output<Boolean>> startTls() {
        return Optional.ofNullable(this.startTls);
    }

    /**
     * Password for test access to ActiveDirectory service (string)
     * 
     */
    @Import(name="testPassword", required=true)
    private Output<String> testPassword;

    /**
     * @return Password for test access to ActiveDirectory service (string)
     * 
     */
    public Output<String> testPassword() {
        return this.testPassword;
    }

    /**
     * Username for test access to ActiveDirectory service (string)
     * 
     */
    @Import(name="testUsername", required=true)
    private Output<String> testUsername;

    /**
     * @return Username for test access to ActiveDirectory service (string)
     * 
     */
    public Output<String> testUsername() {
        return this.testUsername;
    }

    /**
     * Enable TLS connection (bool)
     * 
     */
    @Import(name="tls")
    private @Nullable Output<Boolean> tls;

    /**
     * @return Enable TLS connection (bool)
     * 
     */
    public Optional<Output<Boolean>> tls() {
        return Optional.ofNullable(this.tls);
    }

    /**
     * User disabled bit mask. Default `2` (int)
     * 
     */
    @Import(name="userDisabledBitMask")
    private @Nullable Output<Integer> userDisabledBitMask;

    /**
     * @return User disabled bit mask. Default `2` (int)
     * 
     */
    public Optional<Output<Integer>> userDisabledBitMask() {
        return Optional.ofNullable(this.userDisabledBitMask);
    }

    /**
     * User enable attribute (string)
     * 
     */
    @Import(name="userEnabledAttribute")
    private @Nullable Output<String> userEnabledAttribute;

    /**
     * @return User enable attribute (string)
     * 
     */
    public Optional<Output<String>> userEnabledAttribute() {
        return Optional.ofNullable(this.userEnabledAttribute);
    }

    /**
     * User login attribute. Default `sAMAccountName` (string)
     * 
     */
    @Import(name="userLoginAttribute")
    private @Nullable Output<String> userLoginAttribute;

    /**
     * @return User login attribute. Default `sAMAccountName` (string)
     * 
     */
    public Optional<Output<String>> userLoginAttribute() {
        return Optional.ofNullable(this.userLoginAttribute);
    }

    /**
     * User name attribute. Default `name` (string)
     * 
     */
    @Import(name="userNameAttribute")
    private @Nullable Output<String> userNameAttribute;

    /**
     * @return User name attribute. Default `name` (string)
     * 
     */
    public Optional<Output<String>> userNameAttribute() {
        return Optional.ofNullable(this.userNameAttribute);
    }

    /**
     * User object class. Default `person` (string)
     * 
     */
    @Import(name="userObjectClass")
    private @Nullable Output<String> userObjectClass;

    /**
     * @return User object class. Default `person` (string)
     * 
     */
    public Optional<Output<String>> userObjectClass() {
        return Optional.ofNullable(this.userObjectClass);
    }

    /**
     * User search attribute. Default `sAMAccountName|sn|givenName` (string)
     * 
     */
    @Import(name="userSearchAttribute")
    private @Nullable Output<String> userSearchAttribute;

    /**
     * @return User search attribute. Default `sAMAccountName|sn|givenName` (string)
     * 
     */
    public Optional<Output<String>> userSearchAttribute() {
        return Optional.ofNullable(this.userSearchAttribute);
    }

    /**
     * User search base DN (string)
     * 
     */
    @Import(name="userSearchBase", required=true)
    private Output<String> userSearchBase;

    /**
     * @return User search base DN (string)
     * 
     */
    public Output<String> userSearchBase() {
        return this.userSearchBase;
    }

    /**
     * User search filter (string)
     * 
     */
    @Import(name="userSearchFilter")
    private @Nullable Output<String> userSearchFilter;

    /**
     * @return User search filter (string)
     * 
     */
    public Optional<Output<String>> userSearchFilter() {
        return Optional.ofNullable(this.userSearchFilter);
    }

    private AuthConfigActiveDirectoryArgs() {}

    private AuthConfigActiveDirectoryArgs(AuthConfigActiveDirectoryArgs $) {
        this.accessMode = $.accessMode;
        this.allowedPrincipalIds = $.allowedPrincipalIds;
        this.annotations = $.annotations;
        this.certificate = $.certificate;
        this.connectionTimeout = $.connectionTimeout;
        this.defaultLoginDomain = $.defaultLoginDomain;
        this.enabled = $.enabled;
        this.groupDnAttribute = $.groupDnAttribute;
        this.groupMemberMappingAttribute = $.groupMemberMappingAttribute;
        this.groupMemberUserAttribute = $.groupMemberUserAttribute;
        this.groupNameAttribute = $.groupNameAttribute;
        this.groupObjectClass = $.groupObjectClass;
        this.groupSearchAttribute = $.groupSearchAttribute;
        this.groupSearchBase = $.groupSearchBase;
        this.groupSearchFilter = $.groupSearchFilter;
        this.labels = $.labels;
        this.nestedGroupMembershipEnabled = $.nestedGroupMembershipEnabled;
        this.port = $.port;
        this.servers = $.servers;
        this.serviceAccountPassword = $.serviceAccountPassword;
        this.serviceAccountUsername = $.serviceAccountUsername;
        this.startTls = $.startTls;
        this.testPassword = $.testPassword;
        this.testUsername = $.testUsername;
        this.tls = $.tls;
        this.userDisabledBitMask = $.userDisabledBitMask;
        this.userEnabledAttribute = $.userEnabledAttribute;
        this.userLoginAttribute = $.userLoginAttribute;
        this.userNameAttribute = $.userNameAttribute;
        this.userObjectClass = $.userObjectClass;
        this.userSearchAttribute = $.userSearchAttribute;
        this.userSearchBase = $.userSearchBase;
        this.userSearchFilter = $.userSearchFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigActiveDirectoryArgs $;

        public Builder() {
            $ = new AuthConfigActiveDirectoryArgs();
        }

        public Builder(AuthConfigActiveDirectoryArgs defaults) {
            $ = new AuthConfigActiveDirectoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessMode Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
         * 
         * @return builder
         * 
         */
        public Builder accessMode(@Nullable Output<String> accessMode) {
            $.accessMode = accessMode;
            return this;
        }

        /**
         * @param accessMode Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
         * 
         * @return builder
         * 
         */
        public Builder accessMode(String accessMode) {
            return accessMode(Output.of(accessMode));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(@Nullable Output<List<String>> allowedPrincipalIds) {
            $.allowedPrincipalIds = allowedPrincipalIds;
            return this;
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(List<String> allowedPrincipalIds) {
            return allowedPrincipalIds(Output.of(allowedPrincipalIds));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `activedirectory_user://&lt;DN&gt;`  `activedirectory_group://&lt;DN&gt;`. The local admin (`local://&lt;admin id&gt;`) and the `test_username` must be added too. (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(String... allowedPrincipalIds) {
            return allowedPrincipalIds(List.of(allowedPrincipalIds));
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations Annotations of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param certificate CA certificate for TLS if selfsigned (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate CA certificate for TLS if selfsigned (string)
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param connectionTimeout ActiveDirectory connection timeout. Default `5000` (int)
         * 
         * @return builder
         * 
         */
        public Builder connectionTimeout(@Nullable Output<Integer> connectionTimeout) {
            $.connectionTimeout = connectionTimeout;
            return this;
        }

        /**
         * @param connectionTimeout ActiveDirectory connection timeout. Default `5000` (int)
         * 
         * @return builder
         * 
         */
        public Builder connectionTimeout(Integer connectionTimeout) {
            return connectionTimeout(Output.of(connectionTimeout));
        }

        /**
         * @param defaultLoginDomain ActiveDirectory defult login domain (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultLoginDomain(@Nullable Output<String> defaultLoginDomain) {
            $.defaultLoginDomain = defaultLoginDomain;
            return this;
        }

        /**
         * @param defaultLoginDomain ActiveDirectory defult login domain (string)
         * 
         * @return builder
         * 
         */
        public Builder defaultLoginDomain(String defaultLoginDomain) {
            return defaultLoginDomain(Output.of(defaultLoginDomain));
        }

        /**
         * @param enabled Enable auth config provider. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enable auth config provider. Default `true` (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param groupDnAttribute Group DN attribute. Default `distinguishedName` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupDnAttribute(@Nullable Output<String> groupDnAttribute) {
            $.groupDnAttribute = groupDnAttribute;
            return this;
        }

        /**
         * @param groupDnAttribute Group DN attribute. Default `distinguishedName` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupDnAttribute(String groupDnAttribute) {
            return groupDnAttribute(Output.of(groupDnAttribute));
        }

        /**
         * @param groupMemberMappingAttribute Group member mapping attribute. Default `member` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberMappingAttribute(@Nullable Output<String> groupMemberMappingAttribute) {
            $.groupMemberMappingAttribute = groupMemberMappingAttribute;
            return this;
        }

        /**
         * @param groupMemberMappingAttribute Group member mapping attribute. Default `member` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberMappingAttribute(String groupMemberMappingAttribute) {
            return groupMemberMappingAttribute(Output.of(groupMemberMappingAttribute));
        }

        /**
         * @param groupMemberUserAttribute Group member user attribute. Default `distinguishedName` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberUserAttribute(@Nullable Output<String> groupMemberUserAttribute) {
            $.groupMemberUserAttribute = groupMemberUserAttribute;
            return this;
        }

        /**
         * @param groupMemberUserAttribute Group member user attribute. Default `distinguishedName` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupMemberUserAttribute(String groupMemberUserAttribute) {
            return groupMemberUserAttribute(Output.of(groupMemberUserAttribute));
        }

        /**
         * @param groupNameAttribute Group name attribute. Default `name` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupNameAttribute(@Nullable Output<String> groupNameAttribute) {
            $.groupNameAttribute = groupNameAttribute;
            return this;
        }

        /**
         * @param groupNameAttribute Group name attribute. Default `name` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupNameAttribute(String groupNameAttribute) {
            return groupNameAttribute(Output.of(groupNameAttribute));
        }

        /**
         * @param groupObjectClass Group object class. Default `group` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupObjectClass(@Nullable Output<String> groupObjectClass) {
            $.groupObjectClass = groupObjectClass;
            return this;
        }

        /**
         * @param groupObjectClass Group object class. Default `group` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupObjectClass(String groupObjectClass) {
            return groupObjectClass(Output.of(groupObjectClass));
        }

        /**
         * @param groupSearchAttribute Group search attribute. Default `sAMAccountName` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchAttribute(@Nullable Output<String> groupSearchAttribute) {
            $.groupSearchAttribute = groupSearchAttribute;
            return this;
        }

        /**
         * @param groupSearchAttribute Group search attribute. Default `sAMAccountName` (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchAttribute(String groupSearchAttribute) {
            return groupSearchAttribute(Output.of(groupSearchAttribute));
        }

        /**
         * @param groupSearchBase Group search base (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchBase(@Nullable Output<String> groupSearchBase) {
            $.groupSearchBase = groupSearchBase;
            return this;
        }

        /**
         * @param groupSearchBase Group search base (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchBase(String groupSearchBase) {
            return groupSearchBase(Output.of(groupSearchBase));
        }

        /**
         * @param groupSearchFilter Group search filter (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchFilter(@Nullable Output<String> groupSearchFilter) {
            $.groupSearchFilter = groupSearchFilter;
            return this;
        }

        /**
         * @param groupSearchFilter Group search filter (string)
         * 
         * @return builder
         * 
         */
        public Builder groupSearchFilter(String groupSearchFilter) {
            return groupSearchFilter(Output.of(groupSearchFilter));
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels of the resource (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param nestedGroupMembershipEnabled Nested group membership enable. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder nestedGroupMembershipEnabled(@Nullable Output<Boolean> nestedGroupMembershipEnabled) {
            $.nestedGroupMembershipEnabled = nestedGroupMembershipEnabled;
            return this;
        }

        /**
         * @param nestedGroupMembershipEnabled Nested group membership enable. Default `false` (bool)
         * 
         * @return builder
         * 
         */
        public Builder nestedGroupMembershipEnabled(Boolean nestedGroupMembershipEnabled) {
            return nestedGroupMembershipEnabled(Output.of(nestedGroupMembershipEnabled));
        }

        /**
         * @param port ActiveDirectory port. Default `389` (int)
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port ActiveDirectory port. Default `389` (int)
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param servers ActiveDirectory servers list (list)
         * 
         * @return builder
         * 
         */
        public Builder servers(Output<List<String>> servers) {
            $.servers = servers;
            return this;
        }

        /**
         * @param servers ActiveDirectory servers list (list)
         * 
         * @return builder
         * 
         */
        public Builder servers(List<String> servers) {
            return servers(Output.of(servers));
        }

        /**
         * @param servers ActiveDirectory servers list (list)
         * 
         * @return builder
         * 
         */
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }

        /**
         * @param serviceAccountPassword Service account password for access ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountPassword(Output<String> serviceAccountPassword) {
            $.serviceAccountPassword = serviceAccountPassword;
            return this;
        }

        /**
         * @param serviceAccountPassword Service account password for access ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountPassword(String serviceAccountPassword) {
            return serviceAccountPassword(Output.of(serviceAccountPassword));
        }

        /**
         * @param serviceAccountUsername Service account DN for access ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountUsername(Output<String> serviceAccountUsername) {
            $.serviceAccountUsername = serviceAccountUsername;
            return this;
        }

        /**
         * @param serviceAccountUsername Service account DN for access ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountUsername(String serviceAccountUsername) {
            return serviceAccountUsername(Output.of(serviceAccountUsername));
        }

        /**
         * @param startTls Enable start TLS connection (bool)
         * 
         * @return builder
         * 
         */
        public Builder startTls(@Nullable Output<Boolean> startTls) {
            $.startTls = startTls;
            return this;
        }

        /**
         * @param startTls Enable start TLS connection (bool)
         * 
         * @return builder
         * 
         */
        public Builder startTls(Boolean startTls) {
            return startTls(Output.of(startTls));
        }

        /**
         * @param testPassword Password for test access to ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder testPassword(Output<String> testPassword) {
            $.testPassword = testPassword;
            return this;
        }

        /**
         * @param testPassword Password for test access to ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder testPassword(String testPassword) {
            return testPassword(Output.of(testPassword));
        }

        /**
         * @param testUsername Username for test access to ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder testUsername(Output<String> testUsername) {
            $.testUsername = testUsername;
            return this;
        }

        /**
         * @param testUsername Username for test access to ActiveDirectory service (string)
         * 
         * @return builder
         * 
         */
        public Builder testUsername(String testUsername) {
            return testUsername(Output.of(testUsername));
        }

        /**
         * @param tls Enable TLS connection (bool)
         * 
         * @return builder
         * 
         */
        public Builder tls(@Nullable Output<Boolean> tls) {
            $.tls = tls;
            return this;
        }

        /**
         * @param tls Enable TLS connection (bool)
         * 
         * @return builder
         * 
         */
        public Builder tls(Boolean tls) {
            return tls(Output.of(tls));
        }

        /**
         * @param userDisabledBitMask User disabled bit mask. Default `2` (int)
         * 
         * @return builder
         * 
         */
        public Builder userDisabledBitMask(@Nullable Output<Integer> userDisabledBitMask) {
            $.userDisabledBitMask = userDisabledBitMask;
            return this;
        }

        /**
         * @param userDisabledBitMask User disabled bit mask. Default `2` (int)
         * 
         * @return builder
         * 
         */
        public Builder userDisabledBitMask(Integer userDisabledBitMask) {
            return userDisabledBitMask(Output.of(userDisabledBitMask));
        }

        /**
         * @param userEnabledAttribute User enable attribute (string)
         * 
         * @return builder
         * 
         */
        public Builder userEnabledAttribute(@Nullable Output<String> userEnabledAttribute) {
            $.userEnabledAttribute = userEnabledAttribute;
            return this;
        }

        /**
         * @param userEnabledAttribute User enable attribute (string)
         * 
         * @return builder
         * 
         */
        public Builder userEnabledAttribute(String userEnabledAttribute) {
            return userEnabledAttribute(Output.of(userEnabledAttribute));
        }

        /**
         * @param userLoginAttribute User login attribute. Default `sAMAccountName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userLoginAttribute(@Nullable Output<String> userLoginAttribute) {
            $.userLoginAttribute = userLoginAttribute;
            return this;
        }

        /**
         * @param userLoginAttribute User login attribute. Default `sAMAccountName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userLoginAttribute(String userLoginAttribute) {
            return userLoginAttribute(Output.of(userLoginAttribute));
        }

        /**
         * @param userNameAttribute User name attribute. Default `name` (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameAttribute(@Nullable Output<String> userNameAttribute) {
            $.userNameAttribute = userNameAttribute;
            return this;
        }

        /**
         * @param userNameAttribute User name attribute. Default `name` (string)
         * 
         * @return builder
         * 
         */
        public Builder userNameAttribute(String userNameAttribute) {
            return userNameAttribute(Output.of(userNameAttribute));
        }

        /**
         * @param userObjectClass User object class. Default `person` (string)
         * 
         * @return builder
         * 
         */
        public Builder userObjectClass(@Nullable Output<String> userObjectClass) {
            $.userObjectClass = userObjectClass;
            return this;
        }

        /**
         * @param userObjectClass User object class. Default `person` (string)
         * 
         * @return builder
         * 
         */
        public Builder userObjectClass(String userObjectClass) {
            return userObjectClass(Output.of(userObjectClass));
        }

        /**
         * @param userSearchAttribute User search attribute. Default `sAMAccountName|sn|givenName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchAttribute(@Nullable Output<String> userSearchAttribute) {
            $.userSearchAttribute = userSearchAttribute;
            return this;
        }

        /**
         * @param userSearchAttribute User search attribute. Default `sAMAccountName|sn|givenName` (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchAttribute(String userSearchAttribute) {
            return userSearchAttribute(Output.of(userSearchAttribute));
        }

        /**
         * @param userSearchBase User search base DN (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchBase(Output<String> userSearchBase) {
            $.userSearchBase = userSearchBase;
            return this;
        }

        /**
         * @param userSearchBase User search base DN (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchBase(String userSearchBase) {
            return userSearchBase(Output.of(userSearchBase));
        }

        /**
         * @param userSearchFilter User search filter (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchFilter(@Nullable Output<String> userSearchFilter) {
            $.userSearchFilter = userSearchFilter;
            return this;
        }

        /**
         * @param userSearchFilter User search filter (string)
         * 
         * @return builder
         * 
         */
        public Builder userSearchFilter(String userSearchFilter) {
            return userSearchFilter(Output.of(userSearchFilter));
        }

        public AuthConfigActiveDirectoryArgs build() {
            if ($.servers == null) {
                throw new MissingRequiredPropertyException("AuthConfigActiveDirectoryArgs", "servers");
            }
            if ($.serviceAccountPassword == null) {
                throw new MissingRequiredPropertyException("AuthConfigActiveDirectoryArgs", "serviceAccountPassword");
            }
            if ($.serviceAccountUsername == null) {
                throw new MissingRequiredPropertyException("AuthConfigActiveDirectoryArgs", "serviceAccountUsername");
            }
            if ($.testPassword == null) {
                throw new MissingRequiredPropertyException("AuthConfigActiveDirectoryArgs", "testPassword");
            }
            if ($.testUsername == null) {
                throw new MissingRequiredPropertyException("AuthConfigActiveDirectoryArgs", "testUsername");
            }
            if ($.userSearchBase == null) {
                throw new MissingRequiredPropertyException("AuthConfigActiveDirectoryArgs", "userSearchBase");
            }
            return $;
        }
    }

}
