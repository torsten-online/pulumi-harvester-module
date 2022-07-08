// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.NodePoolArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.NodePoolState;
import com.pulumi.rancher2.outputs.NodePoolNodeTaint;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Node Pool resource. This can be used to create Node Pool, using Node template for Rancher v2 RKE clusters and retrieve their information.
 * 
 * ## Import
 * 
 * Node Pool can be imported using the Rancher Node Pool ID
 * 
 * ```sh
 *  $ pulumi import rancher2:index/nodePool:NodePool foo &amp;lt;node_pool_id&amp;gt;
 * ```
 * 
 */
@ResourceType(type="rancher2:index/nodePool:NodePool")
public class NodePool extends com.pulumi.resources.CustomResource {
    /**
     * Annotations for Node Pool object (map)
     * 
     */
    @Export(name="annotations", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Node Pool object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * The RKE cluster id to use Node Pool (string)
     * 
     */
    @Export(name="clusterId", type=String.class, parameters={})
    private Output<String> clusterId;

    /**
     * @return The RKE cluster id to use Node Pool (string)
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * RKE control plane role for created nodes (bool)
     * 
     */
    @Export(name="controlPlane", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> controlPlane;

    /**
     * @return RKE control plane role for created nodes (bool)
     * 
     */
    public Output<Optional<Boolean>> controlPlane() {
        return Codegen.optional(this.controlPlane);
    }
    /**
     * Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
     * 
     */
    @Export(name="deleteNotReadyAfterSecs", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> deleteNotReadyAfterSecs;

    /**
     * @return Delete not ready node after secs. For Rancher v2.3.3 or above. Default `0` (int)
     * 
     */
    public Output<Optional<Integer>> deleteNotReadyAfterSecs() {
        return Codegen.optional(this.deleteNotReadyAfterSecs);
    }
    /**
     * Drain nodes before delete. Default: `false` (bool)
     * 
     */
    @Export(name="drainBeforeDelete", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> drainBeforeDelete;

    /**
     * @return Drain nodes before delete. Default: `false` (bool)
     * 
     */
    public Output<Optional<Boolean>> drainBeforeDelete() {
        return Codegen.optional(this.drainBeforeDelete);
    }
    /**
     * RKE etcd role for created nodes (bool)
     * 
     */
    @Export(name="etcd", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> etcd;

    /**
     * @return RKE etcd role for created nodes (bool)
     * 
     */
    public Output<Optional<Boolean>> etcd() {
        return Codegen.optional(this.etcd);
    }
    /**
     * The prefix for created nodes of the Node Pool (string)
     * 
     */
    @Export(name="hostnamePrefix", type=String.class, parameters={})
    private Output<String> hostnamePrefix;

    /**
     * @return The prefix for created nodes of the Node Pool (string)
     * 
     */
    public Output<String> hostnamePrefix() {
        return this.hostnamePrefix;
    }
    /**
     * Labels for Node Pool object (map)
     * 
     */
    @Export(name="labels", type=Map.class, parameters={String.class, Object.class})
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Node Pool object (map)
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * The name of the Node Pool (string)
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the Node Pool (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Node taints. For Rancher v2.3.3 or above (List)
     * 
     */
    @Export(name="nodeTaints", type=List.class, parameters={NodePoolNodeTaint.class})
    private Output</* @Nullable */ List<NodePoolNodeTaint>> nodeTaints;

    /**
     * @return Node taints. For Rancher v2.3.3 or above (List)
     * 
     */
    public Output<Optional<List<NodePoolNodeTaint>>> nodeTaints() {
        return Codegen.optional(this.nodeTaints);
    }
    /**
     * The Node Template ID to use for node creation (string)
     * 
     */
    @Export(name="nodeTemplateId", type=String.class, parameters={})
    private Output<String> nodeTemplateId;

    /**
     * @return The Node Template ID to use for node creation (string)
     * 
     */
    public Output<String> nodeTemplateId() {
        return this.nodeTemplateId;
    }
    /**
     * The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
     * 
     */
    @Export(name="quantity", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> quantity;

    /**
     * @return The number of nodes to create on Node Pool. Default `1`. Only values &gt;= 1 allowed (int)
     * 
     */
    public Output<Optional<Integer>> quantity() {
        return Codegen.optional(this.quantity);
    }
    /**
     * RKE role role for created nodes (bool)
     * 
     */
    @Export(name="worker", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> worker;

    /**
     * @return RKE role role for created nodes (bool)
     * 
     */
    public Output<Optional<Boolean>> worker() {
        return Codegen.optional(this.worker);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodePool(String name) {
        this(name, NodePoolArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodePool(String name, NodePoolArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodePool(String name, NodePoolArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodePool:NodePool", name, args == null ? NodePoolArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodePool(String name, Output<String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodePool:NodePool", name, state, makeResourceOptions(options, id));
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
    public static NodePool get(String name, Output<String> id, @Nullable NodePoolState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodePool(name, id, state, options);
    }
}
