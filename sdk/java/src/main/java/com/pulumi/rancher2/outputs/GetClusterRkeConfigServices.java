// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesEtcd;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesKubeApi;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesKubeController;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesKubelet;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesKubeproxy;
import com.pulumi.rancher2.outputs.GetClusterRkeConfigServicesScheduler;
import java.util.Objects;

@CustomType
public final class GetClusterRkeConfigServices {
    private final GetClusterRkeConfigServicesEtcd etcd;
    private final GetClusterRkeConfigServicesKubeApi kubeApi;
    private final GetClusterRkeConfigServicesKubeController kubeController;
    private final GetClusterRkeConfigServicesKubelet kubelet;
    private final GetClusterRkeConfigServicesKubeproxy kubeproxy;
    private final GetClusterRkeConfigServicesScheduler scheduler;

    @CustomType.Constructor
    private GetClusterRkeConfigServices(
        @CustomType.Parameter("etcd") GetClusterRkeConfigServicesEtcd etcd,
        @CustomType.Parameter("kubeApi") GetClusterRkeConfigServicesKubeApi kubeApi,
        @CustomType.Parameter("kubeController") GetClusterRkeConfigServicesKubeController kubeController,
        @CustomType.Parameter("kubelet") GetClusterRkeConfigServicesKubelet kubelet,
        @CustomType.Parameter("kubeproxy") GetClusterRkeConfigServicesKubeproxy kubeproxy,
        @CustomType.Parameter("scheduler") GetClusterRkeConfigServicesScheduler scheduler) {
        this.etcd = etcd;
        this.kubeApi = kubeApi;
        this.kubeController = kubeController;
        this.kubelet = kubelet;
        this.kubeproxy = kubeproxy;
        this.scheduler = scheduler;
    }

    public GetClusterRkeConfigServicesEtcd etcd() {
        return this.etcd;
    }
    public GetClusterRkeConfigServicesKubeApi kubeApi() {
        return this.kubeApi;
    }
    public GetClusterRkeConfigServicesKubeController kubeController() {
        return this.kubeController;
    }
    public GetClusterRkeConfigServicesKubelet kubelet() {
        return this.kubelet;
    }
    public GetClusterRkeConfigServicesKubeproxy kubeproxy() {
        return this.kubeproxy;
    }
    public GetClusterRkeConfigServicesScheduler scheduler() {
        return this.scheduler;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterRkeConfigServices defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetClusterRkeConfigServicesEtcd etcd;
        private GetClusterRkeConfigServicesKubeApi kubeApi;
        private GetClusterRkeConfigServicesKubeController kubeController;
        private GetClusterRkeConfigServicesKubelet kubelet;
        private GetClusterRkeConfigServicesKubeproxy kubeproxy;
        private GetClusterRkeConfigServicesScheduler scheduler;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterRkeConfigServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etcd = defaults.etcd;
    	      this.kubeApi = defaults.kubeApi;
    	      this.kubeController = defaults.kubeController;
    	      this.kubelet = defaults.kubelet;
    	      this.kubeproxy = defaults.kubeproxy;
    	      this.scheduler = defaults.scheduler;
        }

        public Builder etcd(GetClusterRkeConfigServicesEtcd etcd) {
            this.etcd = Objects.requireNonNull(etcd);
            return this;
        }
        public Builder kubeApi(GetClusterRkeConfigServicesKubeApi kubeApi) {
            this.kubeApi = Objects.requireNonNull(kubeApi);
            return this;
        }
        public Builder kubeController(GetClusterRkeConfigServicesKubeController kubeController) {
            this.kubeController = Objects.requireNonNull(kubeController);
            return this;
        }
        public Builder kubelet(GetClusterRkeConfigServicesKubelet kubelet) {
            this.kubelet = Objects.requireNonNull(kubelet);
            return this;
        }
        public Builder kubeproxy(GetClusterRkeConfigServicesKubeproxy kubeproxy) {
            this.kubeproxy = Objects.requireNonNull(kubeproxy);
            return this;
        }
        public Builder scheduler(GetClusterRkeConfigServicesScheduler scheduler) {
            this.scheduler = Objects.requireNonNull(scheduler);
            return this;
        }        public GetClusterRkeConfigServices build() {
            return new GetClusterRkeConfigServices(etcd, kubeApi, kubeController, kubelet, kubeproxy, scheduler);
        }
    }
}
