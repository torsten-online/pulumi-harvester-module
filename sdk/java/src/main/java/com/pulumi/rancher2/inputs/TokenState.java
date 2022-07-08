// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TokenState extends com.pulumi.resources.ResourceArgs {

    public static final TokenState Empty = new TokenState();

    /**
     * (Computed) Token access key part (string)
     * 
     */
    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    /**
     * @return (Computed) Token access key part (string)
     * 
     */
    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    /**
     * (Computed) Annotations of the token (map)
     * 
     */
    @Import(name="annotations")
    private @Nullable Output<Map<String,Object>> annotations;

    /**
     * @return (Computed) Annotations of the token (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    /**
     * Cluster ID for scoped token (string)
     * 
     */
    @Import(name="clusterId")
    private @Nullable Output<String> clusterId;

    /**
     * @return Cluster ID for scoped token (string)
     * 
     */
    public Optional<Output<String>> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }

    /**
     * Token description (string)
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Token description (string)
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Computed) Token is enabled (bool)
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return (Computed) Token is enabled (bool)
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * (Computed) Token is expired (bool)
     * 
     */
    @Import(name="expired")
    private @Nullable Output<Boolean> expired;

    /**
     * @return (Computed) Token is expired (bool)
     * 
     */
    public Optional<Output<Boolean>> expired() {
        return Optional.ofNullable(this.expired);
    }

    /**
     * (Computed) Labels of the token (map)
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return (Computed) Labels of the token (map)
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * (Computed) Token name (string)
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Computed) Token name (string)
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Renew expired or disabled token
     * 
     */
    @Import(name="renew")
    private @Nullable Output<Boolean> renew;

    /**
     * @return Renew expired or disabled token
     * 
     */
    public Optional<Output<Boolean>> renew() {
        return Optional.ofNullable(this.renew);
    }

    /**
     * (Computed/Sensitive) Token secret key part (string)
     * 
     */
    @Import(name="secretKey")
    private @Nullable Output<String> secretKey;

    /**
     * @return (Computed/Sensitive) Token secret key part (string)
     * 
     */
    public Optional<Output<String>> secretKey() {
        return Optional.ofNullable(this.secretKey);
    }

    /**
     * (Computed/Sensitive) Token value (string)
     * 
     */
    @Import(name="token")
    private @Nullable Output<String> token;

    /**
     * @return (Computed/Sensitive) Token value (string)
     * 
     */
    public Optional<Output<String>> token() {
        return Optional.ofNullable(this.token);
    }

    /**
     * Token time to live in seconds. Default `0` (int)
     * 
     */
    @Import(name="ttl")
    private @Nullable Output<Integer> ttl;

    /**
     * @return Token time to live in seconds. Default `0` (int)
     * 
     */
    public Optional<Output<Integer>> ttl() {
        return Optional.ofNullable(this.ttl);
    }

    /**
     * (Computed) Token user ID (string)
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return (Computed) Token user ID (string)
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private TokenState() {}

    private TokenState(TokenState $) {
        this.accessKey = $.accessKey;
        this.annotations = $.annotations;
        this.clusterId = $.clusterId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.expired = $.expired;
        this.labels = $.labels;
        this.name = $.name;
        this.renew = $.renew;
        this.secretKey = $.secretKey;
        this.token = $.token;
        this.ttl = $.ttl;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TokenState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TokenState $;

        public Builder() {
            $ = new TokenState();
        }

        public Builder(TokenState defaults) {
            $ = new TokenState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessKey (Computed) Token access key part (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        /**
         * @param accessKey (Computed) Token access key part (string)
         * 
         * @return builder
         * 
         */
        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        /**
         * @param annotations (Computed) Annotations of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(@Nullable Output<Map<String,Object>> annotations) {
            $.annotations = annotations;
            return this;
        }

        /**
         * @param annotations (Computed) Annotations of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder annotations(Map<String,Object> annotations) {
            return annotations(Output.of(annotations));
        }

        /**
         * @param clusterId Cluster ID for scoped token (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(@Nullable Output<String> clusterId) {
            $.clusterId = clusterId;
            return this;
        }

        /**
         * @param clusterId Cluster ID for scoped token (string)
         * 
         * @return builder
         * 
         */
        public Builder clusterId(String clusterId) {
            return clusterId(Output.of(clusterId));
        }

        /**
         * @param description Token description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Token description (string)
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled (Computed) Token is enabled (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled (Computed) Token is enabled (bool)
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param expired (Computed) Token is expired (bool)
         * 
         * @return builder
         * 
         */
        public Builder expired(@Nullable Output<Boolean> expired) {
            $.expired = expired;
            return this;
        }

        /**
         * @param expired (Computed) Token is expired (bool)
         * 
         * @return builder
         * 
         */
        public Builder expired(Boolean expired) {
            return expired(Output.of(expired));
        }

        /**
         * @param labels (Computed) Labels of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels (Computed) Labels of the token (map)
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param name (Computed) Token name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Computed) Token name (string)
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param renew Renew expired or disabled token
         * 
         * @return builder
         * 
         */
        public Builder renew(@Nullable Output<Boolean> renew) {
            $.renew = renew;
            return this;
        }

        /**
         * @param renew Renew expired or disabled token
         * 
         * @return builder
         * 
         */
        public Builder renew(Boolean renew) {
            return renew(Output.of(renew));
        }

        /**
         * @param secretKey (Computed/Sensitive) Token secret key part (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(@Nullable Output<String> secretKey) {
            $.secretKey = secretKey;
            return this;
        }

        /**
         * @param secretKey (Computed/Sensitive) Token secret key part (string)
         * 
         * @return builder
         * 
         */
        public Builder secretKey(String secretKey) {
            return secretKey(Output.of(secretKey));
        }

        /**
         * @param token (Computed/Sensitive) Token value (string)
         * 
         * @return builder
         * 
         */
        public Builder token(@Nullable Output<String> token) {
            $.token = token;
            return this;
        }

        /**
         * @param token (Computed/Sensitive) Token value (string)
         * 
         * @return builder
         * 
         */
        public Builder token(String token) {
            return token(Output.of(token));
        }

        /**
         * @param ttl Token time to live in seconds. Default `0` (int)
         * 
         * @return builder
         * 
         */
        public Builder ttl(@Nullable Output<Integer> ttl) {
            $.ttl = ttl;
            return this;
        }

        /**
         * @param ttl Token time to live in seconds. Default `0` (int)
         * 
         * @return builder
         * 
         */
        public Builder ttl(Integer ttl) {
            return ttl(Output.of(ttl));
        }

        /**
         * @param userId (Computed) Token user ID (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId (Computed) Token user ID (string)
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public TokenState build() {
            return $;
        }
    }

}
