// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy;
import com.pulumi.rancher2.outputs.GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler;
import java.util.Objects;

@CustomType
public final class GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices {
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy;
    private final GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler;

    @CustomType.Constructor
    private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices(
        @CustomType.Parameter("etcd") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd,
        @CustomType.Parameter("kubeApi") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi,
        @CustomType.Parameter("kubeController") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController,
        @CustomType.Parameter("kubelet") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet,
        @CustomType.Parameter("kubeproxy") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy,
        @CustomType.Parameter("scheduler") GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler) {
        this.etcd = etcd;
        this.kubeApi = kubeApi;
        this.kubeController = kubeController;
        this.kubelet = kubelet;
        this.kubeproxy = kubeproxy;
        this.scheduler = scheduler;
    }

    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd() {
        return this.etcd;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi() {
        return this.kubeApi;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController() {
        return this.kubeController;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet() {
        return this.kubelet;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy() {
        return this.kubeproxy;
    }
    public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler() {
        return this.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy;
        private GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcd = defaults.etcd;
    	      this.kubeApi = defaults.kubeApi;
    	      this.kubeController = defaults.kubeController;
    	      this.kubelet = defaults.kubelet;
    	      this.kubeproxy = defaults.kubeproxy;
    	      this.scheduler = defaults.scheduler;
        }

        public Builder etcd(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesEtcd etcd) {
            this.etcd = Objects.requireNonNull(etcd);
            return this;
        }
        public Builder kubeApi(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeApi kubeApi) {
            this.kubeApi = Objects.requireNonNull(kubeApi);
            return this;
        }
        public Builder kubeController(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeController kubeController) {
            this.kubeController = Objects.requireNonNull(kubeController);
            return this;
        }
        public Builder kubelet(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubelet kubelet) {
            this.kubelet = Objects.requireNonNull(kubelet);
            return this;
        }
        public Builder kubeproxy(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesKubeproxy kubeproxy) {
            this.kubeproxy = Objects.requireNonNull(kubeproxy);
            return this;
        }
        public Builder scheduler(GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServicesScheduler scheduler) {
            this.scheduler = Objects.requireNonNull(scheduler);
            return this;
        }        public GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices build() {
            return new GetClusterTemplateTemplateRevisionClusterConfigRkeConfigServices(etcd, kubeApi, kubeController, kubelet, kubeproxy, scheduler);
        }
    }
}
