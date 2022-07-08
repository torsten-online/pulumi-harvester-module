// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.AuthConfigFreeIpaArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.AuthConfigFreeIpaState;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Auth Config FreeIpa resource. This can be used to configure and enable Auth Config FreeIpa for Rancher v2 RKE clusters and retrieve their information.
 * 
 * In addition to the built-in local auth, only one external auth config provider can be enabled at a time.
 * 
 */
@ResourceType(type="rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa")
public class AuthConfigFreeIpa extends com.pulumi.resources.CustomResource {
    /**
     * Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    @Export(name="accessMode", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessMode;

    /**
     * @return Access mode for auth. `required`, `restricted`, `unrestricted` are supported. Default `unrestricted` (string)
     * 
     */
    public Output<Optional<String>> accessMode() {
        return Codegen.optional(this.accessMode);
    }
    /**
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
     * 
     */
    @Export(name="allowedPrincipalIds", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `freeipa_user://&lt;DN&gt;`  `freeipa_group://&lt;DN&gt;` (list)
     * 
     */
    public Output<Optional<List<String>>> allowedPrincipalIds() {
        return Codegen.optional(this.allowedPrincipalIds);
    }
    /**
     * Annotations of the resource (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations of the resource (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
     * 
     */
    @Export(name="certificate", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificate;

    /**
     * @return Base64 encoded CA certificate for TLS if self-signed. Use filebase64(&lt;FILE&gt;) for encoding file (string)
     * 
     */
    public Output<Optional<String>> certificate() {
        return Codegen.optional(this.certificate);
    }
    /**
     * FreeIpa connection timeout. Default `5000` (int)
     * 
     */
    @Export(name="connectionTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> connectionTimeout;

    /**
     * @return FreeIpa connection timeout. Default `5000` (int)
     * 
     */
    public Output<Optional<Integer>> connectionTimeout() {
        return Codegen.optional(this.connectionTimeout);
    }
    /**
     * Enable auth config provider. Default `true` (bool)
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Enable auth config provider. Default `true` (bool)
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Group DN attribute. Default `entryDN` (string)
     * 
     */
    @Export(name="groupDnAttribute", type=String.class, parameters={})
    private Output<String> groupDnAttribute;

    /**
     * @return Group DN attribute. Default `entryDN` (string)
     * 
     */
    public Output<String> groupDnAttribute() {
        return this.groupDnAttribute;
    }
    /**
     * Group member mapping attribute. Default `member` (string)
     * 
     */
    @Export(name="groupMemberMappingAttribute", type=String.class, parameters={})
    private Output<String> groupMemberMappingAttribute;

    /**
     * @return Group member mapping attribute. Default `member` (string)
     * 
     */
    public Output<String> groupMemberMappingAttribute() {
        return this.groupMemberMappingAttribute;
    }
    /**
     * Group member user attribute. Default `entryDN` (string)
     * 
     */
    @Export(name="groupMemberUserAttribute", type=String.class, parameters={})
    private Output<String> groupMemberUserAttribute;

    /**
     * @return Group member user attribute. Default `entryDN` (string)
     * 
     */
    public Output<String> groupMemberUserAttribute() {
        return this.groupMemberUserAttribute;
    }
    /**
     * Group name attribute. Default `cn` (string)
     * 
     */
    @Export(name="groupNameAttribute", type=String.class, parameters={})
    private Output<String> groupNameAttribute;

    /**
     * @return Group name attribute. Default `cn` (string)
     * 
     */
    public Output<String> groupNameAttribute() {
        return this.groupNameAttribute;
    }
    /**
     * Group object class. Default `groupOfNames` (string)
     * 
     */
    @Export(name="groupObjectClass", type=String.class, parameters={})
    private Output<String> groupObjectClass;

    /**
     * @return Group object class. Default `groupOfNames` (string)
     * 
     */
    public Output<String> groupObjectClass() {
        return this.groupObjectClass;
    }
    /**
     * Group search attribute. Default `cn` (string)
     * 
     */
    @Export(name="groupSearchAttribute", type=String.class, parameters={})
    private Output<String> groupSearchAttribute;

    /**
     * @return Group search attribute. Default `cn` (string)
     * 
     */
    public Output<String> groupSearchAttribute() {
        return this.groupSearchAttribute;
    }
    /**
     * Group search base (string)
     * 
     */
    @Export(name="groupSearchBase", type=String.class, parameters={})
    private Output<String> groupSearchBase;

    /**
     * @return Group search base (string)
     * 
     */
    public Output<String> groupSearchBase() {
        return this.groupSearchBase;
    }
    /**
     * Labels of the resource (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels of the resource (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * (Computed) The name of the resource (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return (Computed) The name of the resource (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Nested group membership enable. Default `false` (bool)
     * 
     */
    @Export(name="nestedGroupMembershipEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> nestedGroupMembershipEnabled;

    /**
     * @return Nested group membership enable. Default `false` (bool)
     * 
     */
    public Output<Boolean> nestedGroupMembershipEnabled() {
        return this.nestedGroupMembershipEnabled;
    }
    /**
     * FreeIpa port. Default `389` (int)
     * 
     */
    @Export(name="port", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> port;

    /**
     * @return FreeIpa port. Default `389` (int)
     * 
     */
    public Output<Optional<Integer>> port() {
        return Codegen.optional(this.port);
    }
    /**
     * FreeIpa servers list (list)
     * 
     */
    @Export(name="servers", type=List.class, parameters={String.class})
    private Output<List<String>> servers;

    /**
     * @return FreeIpa servers list (list)
     * 
     */
    public Output<List<String>> servers() {
        return this.servers;
    }
    /**
     * Service account DN for access FreeIpa service (string)
     * 
     */
    @Export(name="serviceAccountDistinguishedName", type=String.class, parameters={})
    private Output<String> serviceAccountDistinguishedName;

    /**
     * @return Service account DN for access FreeIpa service (string)
     * 
     */
    public Output<String> serviceAccountDistinguishedName() {
        return this.serviceAccountDistinguishedName;
    }
    /**
     * Service account password for access FreeIpa service (string)
     * 
     */
    @Export(name="serviceAccountPassword", type=String.class, parameters={})
    private Output<String> serviceAccountPassword;

    /**
     * @return Service account password for access FreeIpa service (string)
     * 
     */
    public Output<String> serviceAccountPassword() {
        return this.serviceAccountPassword;
    }
    /**
     * Password for test access to FreeIpa service (string)
     * 
     */
    @Export(name="testPassword", type=String.class, parameters={})
    private Output<String> testPassword;

    /**
     * @return Password for test access to FreeIpa service (string)
     * 
     */
    public Output<String> testPassword() {
        return this.testPassword;
    }
    /**
     * Username for test access to FreeIpa service (string)
     * 
     */
    @Export(name="testUsername", type=String.class, parameters={})
    private Output<String> testUsername;

    /**
     * @return Username for test access to FreeIpa service (string)
     * 
     */
    public Output<String> testUsername() {
        return this.testUsername;
    }
    /**
     * Enable TLS connection (bool)
     * 
     */
    @Export(name="tls", type=Boolean.class, parameters={})
    private Output<Boolean> tls;

    /**
     * @return Enable TLS connection (bool)
     * 
     */
    public Output<Boolean> tls() {
        return this.tls;
    }
    /**
     * (Computed) The type of the resource (string)
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return (Computed) The type of the resource (string)
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * User disabled bit mask (int)
     * 
     */
    @Export(name="userDisabledBitMask", type=Integer.class, parameters={})
    private Output<Integer> userDisabledBitMask;

    /**
     * @return User disabled bit mask (int)
     * 
     */
    public Output<Integer> userDisabledBitMask() {
        return this.userDisabledBitMask;
    }
    /**
     * User enable attribute (string)
     * 
     */
    @Export(name="userEnabledAttribute", type=String.class, parameters={})
    private Output<String> userEnabledAttribute;

    /**
     * @return User enable attribute (string)
     * 
     */
    public Output<String> userEnabledAttribute() {
        return this.userEnabledAttribute;
    }
    /**
     * User login attribute. Default `uid` (string)
     * 
     */
    @Export(name="userLoginAttribute", type=String.class, parameters={})
    private Output<String> userLoginAttribute;

    /**
     * @return User login attribute. Default `uid` (string)
     * 
     */
    public Output<String> userLoginAttribute() {
        return this.userLoginAttribute;
    }
    /**
     * User member attribute. Default `memberOf` (string)
     * 
     */
    @Export(name="userMemberAttribute", type=String.class, parameters={})
    private Output<String> userMemberAttribute;

    /**
     * @return User member attribute. Default `memberOf` (string)
     * 
     */
    public Output<String> userMemberAttribute() {
        return this.userMemberAttribute;
    }
    /**
     * User name attribute. Default `givenName` (string)
     * 
     */
    @Export(name="userNameAttribute", type=String.class, parameters={})
    private Output<String> userNameAttribute;

    /**
     * @return User name attribute. Default `givenName` (string)
     * 
     */
    public Output<String> userNameAttribute() {
        return this.userNameAttribute;
    }
    /**
     * User object class. Default `inetorgperson` (string)
     * 
     */
    @Export(name="userObjectClass", type=String.class, parameters={})
    private Output<String> userObjectClass;

    /**
     * @return User object class. Default `inetorgperson` (string)
     * 
     */
    public Output<String> userObjectClass() {
        return this.userObjectClass;
    }
    /**
     * User search attribute. Default `uid|sn|givenName` (string)
     * 
     */
    @Export(name="userSearchAttribute", type=String.class, parameters={})
    private Output<String> userSearchAttribute;

    /**
     * @return User search attribute. Default `uid|sn|givenName` (string)
     * 
     */
    public Output<String> userSearchAttribute() {
        return this.userSearchAttribute;
    }
    /**
     * User search base DN (string)
     * 
     */
    @Export(name="userSearchBase", type=String.class, parameters={})
    private Output<String> userSearchBase;

    /**
     * @return User search base DN (string)
     * 
     */
    public Output<String> userSearchBase() {
        return this.userSearchBase;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthConfigFreeIpa(String name) {
        this(name, AuthConfigFreeIpaArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthConfigFreeIpa(String name, AuthConfigFreeIpaArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthConfigFreeIpa(String name, AuthConfigFreeIpaArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, args == null ? AuthConfigFreeIpaArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthConfigFreeIpa(String name, Output<String> id, @Nullable AuthConfigFreeIpaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AuthConfigFreeIpa get(String name, Output<String> id, @Nullable AuthConfigFreeIpaState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthConfigFreeIpa(name, id, state, options);
    }
}
