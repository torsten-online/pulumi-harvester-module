// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this data source to retrieve information about a Rancher v2 cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as rancher2 from "@pulumi/rancher2";
 *
 * const foo_custom = pulumi.output(rancher2.getCluster({
 *     name: "foo-custom",
 * }, { async: true }));
 * ```
 */
export function getCluster(args: GetClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetClusterResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("rancher2:index/getCluster:getCluster", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getCluster.
 */
export interface GetClusterArgs {
    /**
     * The name of the Cluster (string)
     */
    readonly name: string;
}

/**
 * A collection of values returned by getCluster.
 */
export interface GetClusterResult {
    /**
     * (Computed) The Azure aks configuration for `aks` Clusters. Conflicts with `eksConfig`, `gkeConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly aksConfig: outputs.GetClusterAksConfig;
    /**
     * (Computed) Annotations for Node Pool object (map)
     */
    readonly annotations: {[key: string]: any};
    /**
     * (Computed) Enabling the [local cluster authorized endpoint](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#local-cluster-auth-endpoint) allows direct communication with the cluster, bypassing the Rancher API proxy. (list maxitems:1)
     */
    readonly clusterAuthEndpoint: outputs.GetClusterClusterAuthEndpoint;
    /**
     * (Computed) Cluster monitoring config (list maxitems:1)
     */
    readonly clusterMonitoringInput: outputs.GetClusterClusterMonitoringInput;
    /**
     * (Computed) Cluster Registration Token generated for the cluster (list maxitems:1)
     */
    readonly clusterRegistrationToken: outputs.GetClusterClusterRegistrationToken;
    /**
     * (Computed) Cluster template answers (list maxitems:1)
     */
    readonly clusterTemplateAnswers: outputs.GetClusterClusterTemplateAnswers;
    /**
     * (Computed) Cluster template ID (string)
     */
    readonly clusterTemplateId: string;
    /**
     * (Computed) Cluster template questions (list)
     */
    readonly clusterTemplateQuestions: outputs.GetClusterClusterTemplateQuestion[];
    /**
     * (Computed) Cluster template revision ID (string)
     */
    readonly clusterTemplateRevisionId: string;
    /**
     * (Optional/Computed) [Default pod security policy template id](https://rancher.com/docs/rancher/v2.x/en/cluster-provisioning/rke-clusters/options/#pod-security-policy-support) (string)
     */
    readonly defaultPodSecurityPolicyTemplateId: string;
    /**
     * (Computed) Default project ID for the cluster (string)
     */
    readonly defaultProjectId: string;
    /**
     * (Computed) The description for Cluster (string)
     */
    readonly description: string;
    /**
     * (Computed) The driver used for the Cluster. `imported`, `azurekubernetesservice`, `amazonelasticcontainerservice`, `googlekubernetesengine` and `rancherKubernetesEngine` are supported (string)
     */
    readonly driver: string;
    /**
     * (Computed) The Amazon eks configuration for `eks` Clusters. Conflicts with `aksConfig`, `gkeConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly eksConfig: outputs.GetClusterEksConfig;
    readonly eksConfigV2: outputs.GetClusterEksConfigV2;
    readonly enableClusterAlerting: boolean;
    /**
     * (Computed) Enable built-in cluster monitoring. Default `false` (bool)
     */
    readonly enableClusterMonitoring: boolean;
    /**
     * (Computed) Enable project network isolation. Default `false` (bool)
     */
    readonly enableNetworkPolicy: boolean;
    /**
     * (Computed) The Google gke configuration for `gke` Clusters. Conflicts with `aksConfig`, `eksConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly gkeConfig: outputs.GetClusterGkeConfig;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * (Computed) The K3S configuration for `k3s` imported Clusters. Conflicts with `aksConfig`, `eksConfig`, `gkeConfig` and `rkeConfig` (list maxitems:1)
     */
    readonly k3sConfig: outputs.GetClusterK3sConfig;
    /**
     * (Computed) Kube Config generated for the cluster (string)
     */
    readonly kubeConfig: string;
    /**
     * (Computed) Labels for Node Pool object (map)
     */
    readonly labels: {[key: string]: any};
    readonly name: string;
    readonly okeConfig: outputs.GetClusterOkeConfig;
    /**
     * (Computed) The RKE configuration for `rke` Clusters. Conflicts with `aksConfig`, `eksConfig` and `gkeConfig` (list maxitems:1)
     */
    readonly rkeConfig: outputs.GetClusterRkeConfig;
    readonly scheduledClusterScans: outputs.GetClusterScheduledClusterScan[];
    /**
     * (Computed) System project ID for the cluster (string)
     */
    readonly systemProjectId: string;
}
