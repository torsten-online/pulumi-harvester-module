// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAlertRuleEventRule {
    /**
     * @return Event type. Supported values : `&#34;Warning&#34; | &#34;Normal&#34;`. Default: `Warning` (string)
     * 
     */
    private @Nullable String eventType;
    /**
     * @return Resource kind. Supported values : `&#34;DaemonSet&#34; | &#34;Deployment&#34; | &#34;Node&#34; | &#34;Pod&#34; | &#34;StatefulSet&#34;` (string)
     * 
     */
    private String resourceKind;

    private ClusterAlertRuleEventRule() {}
    /**
     * @return Event type. Supported values : `&#34;Warning&#34; | &#34;Normal&#34;`. Default: `Warning` (string)
     * 
     */
    public Optional<String> eventType() {
        return Optional.ofNullable(this.eventType);
    }
    /**
     * @return Resource kind. Supported values : `&#34;DaemonSet&#34; | &#34;Deployment&#34; | &#34;Node&#34; | &#34;Pod&#34; | &#34;StatefulSet&#34;` (string)
     * 
     */
    public String resourceKind() {
        return this.resourceKind;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAlertRuleEventRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String eventType;
        private String resourceKind;
        public Builder() {}
        public Builder(ClusterAlertRuleEventRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.resourceKind = defaults.resourceKind;
        }

        @CustomType.Setter
        public Builder eventType(@Nullable String eventType) {
            this.eventType = eventType;
            return this;
        }
        @CustomType.Setter
        public Builder resourceKind(String resourceKind) {
            this.resourceKind = Objects.requireNonNull(resourceKind);
            return this;
        }
        public ClusterAlertRuleEventRule build() {
            final var o = new ClusterAlertRuleEventRule();
            o.eventType = eventType;
            o.resourceKind = resourceKind;
            return o;
        }
    }
}
