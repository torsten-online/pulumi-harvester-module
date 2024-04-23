// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAlertRuleMetricRule {
    /**
     * @return Metric rule comparison
     * 
     */
    private @Nullable String comparison;
    /**
     * @return Metric rule description
     * 
     */
    private @Nullable String description;
    /**
     * @return Metric rule duration
     * 
     */
    private String duration;
    /**
     * @return Metric rule expression
     * 
     */
    private String expression;
    /**
     * @return Metric rule threshold value
     * 
     */
    private Double thresholdValue;

    private ClusterAlertRuleMetricRule() {}
    /**
     * @return Metric rule comparison
     * 
     */
    public Optional<String> comparison() {
        return Optional.ofNullable(this.comparison);
    }
    /**
     * @return Metric rule description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Metric rule duration
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return Metric rule expression
     * 
     */
    public String expression() {
        return this.expression;
    }
    /**
     * @return Metric rule threshold value
     * 
     */
    public Double thresholdValue() {
        return this.thresholdValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAlertRuleMetricRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comparison;
        private @Nullable String description;
        private String duration;
        private String expression;
        private Double thresholdValue;
        public Builder() {}
        public Builder(ClusterAlertRuleMetricRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.description = defaults.description;
    	      this.duration = defaults.duration;
    	      this.expression = defaults.expression;
    	      this.thresholdValue = defaults.thresholdValue;
        }

        @CustomType.Setter
        public Builder comparison(@Nullable String comparison) {

            this.comparison = comparison;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {

            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder duration(String duration) {
            if (duration == null) {
              throw new MissingRequiredPropertyException("ClusterAlertRuleMetricRule", "duration");
            }
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder expression(String expression) {
            if (expression == null) {
              throw new MissingRequiredPropertyException("ClusterAlertRuleMetricRule", "expression");
            }
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdValue(Double thresholdValue) {
            if (thresholdValue == null) {
              throw new MissingRequiredPropertyException("ClusterAlertRuleMetricRule", "thresholdValue");
            }
            this.thresholdValue = thresholdValue;
            return this;
        }
        public ClusterAlertRuleMetricRule build() {
            final var _resultValue = new ClusterAlertRuleMetricRule();
            _resultValue.comparison = comparison;
            _resultValue.description = description;
            _resultValue.duration = duration;
            _resultValue.expression = expression;
            _resultValue.thresholdValue = thresholdValue;
            return _resultValue;
        }
    }
}
