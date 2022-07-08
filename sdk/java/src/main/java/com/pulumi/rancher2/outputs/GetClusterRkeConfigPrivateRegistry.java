// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigPrivateRegistryEcrCredentialPlugin;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetClusterRkeConfigPrivateRegistry {
    private final @Nullable GetClusterRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin;
    private final @Nullable Boolean isDefault;
    private final @Nullable String password;
    private final String url;
    private final @Nullable String user;

    @CustomType.Constructor
    private GetClusterRkeConfigPrivateRegistry(
        @CustomType.Parameter("ecrCredentialPlugin") @Nullable GetClusterRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin,
        @CustomType.Parameter("isDefault") @Nullable Boolean isDefault,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("url") String url,
        @CustomType.Parameter("user") @Nullable String user) {
        this.ecrCredentialPlugin = ecrCredentialPlugin;
        this.isDefault = isDefault;
        this.password = password;
        this.url = url;
        this.user = user;
    }

    public Optional<GetClusterRkeConfigPrivateRegistryEcrCredentialPlugin> ecrCredentialPlugin() {
        return Optional.ofNullable(this.ecrCredentialPlugin);
    }
    public Optional<Boolean> isDefault() {
        return Optional.ofNullable(this.isDefault);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public String url() {
        return this.url;
    }
    public Optional<String> user() {
        return Optional.ofNullable(this.user);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigPrivateRegistry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable GetClusterRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin;
        private @Nullable Boolean isDefault;
        private @Nullable String password;
        private String url;
        private @Nullable String user;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigPrivateRegistry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ecrCredentialPlugin = defaults.ecrCredentialPlugin;
    	      this.isDefault = defaults.isDefault;
    	      this.password = defaults.password;
    	      this.url = defaults.url;
    	      this.user = defaults.user;
        }

        public Builder ecrCredentialPlugin(@Nullable GetClusterRkeConfigPrivateRegistryEcrCredentialPlugin ecrCredentialPlugin) {
            this.ecrCredentialPlugin = ecrCredentialPlugin;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = user;
            return this;
        }        public GetClusterRkeConfigPrivateRegistry build() {
            return new GetClusterRkeConfigPrivateRegistry(ecrCredentialPlugin, isDefault, password, url, user);
        }
    }
}
