// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthConfigAzureAdArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthConfigAzureAdArgs Empty = new AuthConfigAzureAdArgs();

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
     * Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
     * 
     */
    @Import(name="allowedPrincipalIds")
    private @Nullable Output<List<String>> allowedPrincipalIds;

    /**
     * @return Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
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
     * AzureAD auth application ID (string)
     * 
     */
    @Import(name="applicationId", required=true)
    private Output<String> applicationId;

    /**
     * @return AzureAD auth application ID (string)
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }

    /**
     * AzureAD auth application secret (string)
     * 
     */
    @Import(name="applicationSecret", required=true)
    private Output<String> applicationSecret;

    /**
     * @return AzureAD auth application secret (string)
     * 
     */
    public Output<String> applicationSecret() {
        return this.applicationSecret;
    }

    /**
     * AzureAD auth endpoint (string)
     * 
     */
    @Import(name="authEndpoint", required=true)
    private Output<String> authEndpoint;

    /**
     * @return AzureAD auth endpoint (string)
     * 
     */
    public Output<String> authEndpoint() {
        return this.authEndpoint;
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
     * AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * AzureAD graph endpoint (string)
     * 
     */
    @Import(name="graphEndpoint", required=true)
    private Output<String> graphEndpoint;

    /**
     * @return AzureAD graph endpoint (string)
     * 
     */
    public Output<String> graphEndpoint() {
        return this.graphEndpoint;
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
     * Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
     * 
     */
    @Import(name="rancherUrl", required=true)
    private Output<String> rancherUrl;

    /**
     * @return Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
     * 
     */
    public Output<String> rancherUrl() {
        return this.rancherUrl;
    }

    /**
     * AzureAD tenant ID (string)
     * 
     */
    @Import(name="tenantId", required=true)
    private Output<String> tenantId;

    /**
     * @return AzureAD tenant ID (string)
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     * AzureAD token endpoint (string)
     * 
     */
    @Import(name="tokenEndpoint", required=true)
    private Output<String> tokenEndpoint;

    /**
     * @return AzureAD token endpoint (string)
     * 
     */
    public Output<String> tokenEndpoint() {
        return this.tokenEndpoint;
    }

    private AuthConfigAzureAdArgs() {}

    private AuthConfigAzureAdArgs(AuthConfigAzureAdArgs $) {
        this.accessMode = $.accessMode;
        this.allowedPrincipalIds = $.allowedPrincipalIds;
        this.annotations = $.annotations;
        this.applicationId = $.applicationId;
        this.applicationSecret = $.applicationSecret;
        this.authEndpoint = $.authEndpoint;
        this.enabled = $.enabled;
        this.endpoint = $.endpoint;
        this.graphEndpoint = $.graphEndpoint;
        this.labels = $.labels;
        this.rancherUrl = $.rancherUrl;
        this.tenantId = $.tenantId;
        this.tokenEndpoint = $.tokenEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthConfigAzureAdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthConfigAzureAdArgs $;

        public Builder() {
            $ = new AuthConfigAzureAdArgs();
        }

        public Builder(AuthConfigAzureAdArgs defaults) {
            $ = new AuthConfigAzureAdArgs(Objects.requireNonNull(defaults));
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
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(@Nullable Output<List<String>> allowedPrincipalIds) {
            $.allowedPrincipalIds = allowedPrincipalIds;
            return this;
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
         * 
         * @return builder
         * 
         */
        public Builder allowedPrincipalIds(List<String> allowedPrincipalIds) {
            return allowedPrincipalIds(Output.of(allowedPrincipalIds));
        }

        /**
         * @param allowedPrincipalIds Allowed principal ids for auth. Required if `access_mode` is `required` or `restricted`. Ex: `azuread_user://&lt;USER_ID&gt;`  `azuread_group://&lt;GROUP_ID&gt;` (list)
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
         * @param applicationId AzureAD auth application ID (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationId(Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId AzureAD auth application ID (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param applicationSecret AzureAD auth application secret (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationSecret(Output<String> applicationSecret) {
            $.applicationSecret = applicationSecret;
            return this;
        }

        /**
         * @param applicationSecret AzureAD auth application secret (string)
         * 
         * @return builder
         * 
         */
        public Builder applicationSecret(String applicationSecret) {
            return applicationSecret(Output.of(applicationSecret));
        }

        /**
         * @param authEndpoint AzureAD auth endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder authEndpoint(Output<String> authEndpoint) {
            $.authEndpoint = authEndpoint;
            return this;
        }

        /**
         * @param authEndpoint AzureAD auth endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder authEndpoint(String authEndpoint) {
            return authEndpoint(Output.of(authEndpoint));
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
         * @param endpoint AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint AzureAD endpoint. Default `https://login.microsoftonline.com/` (string)
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param graphEndpoint AzureAD graph endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder graphEndpoint(Output<String> graphEndpoint) {
            $.graphEndpoint = graphEndpoint;
            return this;
        }

        /**
         * @param graphEndpoint AzureAD graph endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder graphEndpoint(String graphEndpoint) {
            return graphEndpoint(Output.of(graphEndpoint));
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
         * @param rancherUrl Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
         * 
         * @return builder
         * 
         */
        public Builder rancherUrl(Output<String> rancherUrl) {
            $.rancherUrl = rancherUrl;
            return this;
        }

        /**
         * @param rancherUrl Rancher URL (string). &#34;&lt;rancher_url&gt;/verify-auth-azure&#34;
         * 
         * @return builder
         * 
         */
        public Builder rancherUrl(String rancherUrl) {
            return rancherUrl(Output.of(rancherUrl));
        }

        /**
         * @param tenantId AzureAD tenant ID (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(Output<String> tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        /**
         * @param tenantId AzureAD tenant ID (string)
         * 
         * @return builder
         * 
         */
        public Builder tenantId(String tenantId) {
            return tenantId(Output.of(tenantId));
        }

        /**
         * @param tokenEndpoint AzureAD token endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder tokenEndpoint(Output<String> tokenEndpoint) {
            $.tokenEndpoint = tokenEndpoint;
            return this;
        }

        /**
         * @param tokenEndpoint AzureAD token endpoint (string)
         * 
         * @return builder
         * 
         */
        public Builder tokenEndpoint(String tokenEndpoint) {
            return tokenEndpoint(Output.of(tokenEndpoint));
        }

        public AuthConfigAzureAdArgs build() {
            if ($.applicationId == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "applicationId");
            }
            if ($.applicationSecret == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "applicationSecret");
            }
            if ($.authEndpoint == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "authEndpoint");
            }
            if ($.graphEndpoint == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "graphEndpoint");
            }
            if ($.rancherUrl == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "rancherUrl");
            }
            if ($.tenantId == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "tenantId");
            }
            if ($.tokenEndpoint == null) {
                throw new MissingRequiredPropertyException("AuthConfigAzureAdArgs", "tokenEndpoint");
            }
            return $;
        }
    }

}
