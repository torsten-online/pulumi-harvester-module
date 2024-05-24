// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.rancher2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.rancher2.NodeTemplateArgs;
import com.pulumi.rancher2.Utilities;
import com.pulumi.rancher2.inputs.NodeTemplateState;
import com.pulumi.rancher2.outputs.NodeTemplateAmazonec2Config;
import com.pulumi.rancher2.outputs.NodeTemplateAzureConfig;
import com.pulumi.rancher2.outputs.NodeTemplateDigitaloceanConfig;
import com.pulumi.rancher2.outputs.NodeTemplateHarvesterConfig;
import com.pulumi.rancher2.outputs.NodeTemplateHetznerConfig;
import com.pulumi.rancher2.outputs.NodeTemplateLinodeConfig;
import com.pulumi.rancher2.outputs.NodeTemplateNodeTaint;
import com.pulumi.rancher2.outputs.NodeTemplateOpennebulaConfig;
import com.pulumi.rancher2.outputs.NodeTemplateOpenstackConfig;
import com.pulumi.rancher2.outputs.NodeTemplateOutscaleConfig;
import com.pulumi.rancher2.outputs.NodeTemplateVsphereConfig;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Rancher v2 Node Template resource. This can be used to create Node Template for Rancher v2 and retrieve their information.
 * 
 * amazonec2, azure, digitalocean, harvester, linode, opennebula, openstack, outscale, hetzner and vsphere drivers are supported for node templates.
 * 
 * **Note:** If you are upgrading to Rancher v2.3.3, please take a look to final section
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.NodeTemplate;
 * import com.pulumi.rancher2.NodeTemplateArgs;
 * import com.pulumi.rancher2.inputs.NodeTemplateAmazonec2ConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 Node Template up to Rancher 2.1.x
 *         var foo = new NodeTemplate("foo", NodeTemplateArgs.builder()
 *             .name("foo")
 *             .description("foo test")
 *             .amazonec2Config(NodeTemplateAmazonec2ConfigArgs.builder()
 *                 .accessKey("AWS_ACCESS_KEY")
 *                 .secretKey("<AWS_SECRET_KEY>")
 *                 .ami("<AMI_ID>")
 *                 .region("<REGION>")
 *                 .securityGroups("<AWS_SECURITY_GROUP>")
 *                 .subnetId("<SUBNET_ID>")
 *                 .vpcId("<VPC_ID>")
 *                 .zone("<ZONE>")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.CloudCredential;
 * import com.pulumi.rancher2.CloudCredentialArgs;
 * import com.pulumi.rancher2.inputs.CloudCredentialAmazonec2CredentialConfigArgs;
 * import com.pulumi.rancher2.NodeTemplate;
 * import com.pulumi.rancher2.NodeTemplateArgs;
 * import com.pulumi.rancher2.inputs.NodeTemplateAmazonec2ConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 Node Template from Rancher 2.2.x
 *         var foo = new CloudCredential("foo", CloudCredentialArgs.builder()
 *             .name("foo")
 *             .description("foo test")
 *             .amazonec2CredentialConfig(CloudCredentialAmazonec2CredentialConfigArgs.builder()
 *                 .accessKey("<AWS_ACCESS_KEY>")
 *                 .secretKey("<AWS_SECRET_KEY>")
 *                 .build())
 *             .build());
 * 
 *         var fooNodeTemplate = new NodeTemplate("fooNodeTemplate", NodeTemplateArgs.builder()
 *             .name("foo")
 *             .description("foo test")
 *             .cloudCredentialId(foo.id())
 *             .amazonec2Config(NodeTemplateAmazonec2ConfigArgs.builder()
 *                 .ami("<AMI_ID>")
 *                 .region("<REGION>")
 *                 .securityGroups("<AWS_SECURITY_GROUP>")
 *                 .subnetId("<SUBNET_ID>")
 *                 .vpcId("<VPC_ID>")
 *                 .zone("<ZONE>")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Using the Harvester Node Driver
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.Rancher2Functions;
 * import com.pulumi.rancher2.inputs.GetClusterV2Args;
 * import com.pulumi.rancher2.CloudCredential;
 * import com.pulumi.rancher2.CloudCredentialArgs;
 * import com.pulumi.rancher2.inputs.CloudCredentialHarvesterCredentialConfigArgs;
 * import com.pulumi.rancher2.NodeTemplate;
 * import com.pulumi.rancher2.NodeTemplateArgs;
 * import com.pulumi.rancher2.inputs.NodeTemplateHarvesterConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Get imported harvester cluster info
 *         final var foo-harvester = Rancher2Functions.getClusterV2(GetClusterV2Args.builder()
 *             .name("foo-harvester")
 *             .build());
 * 
 *         // Create a new Cloud Credential for an imported Harvester cluster
 *         var foo_harvesterCloudCredential = new CloudCredential("foo-harvesterCloudCredential", CloudCredentialArgs.builder()
 *             .name("foo-harvester")
 *             .harvesterCredentialConfig(CloudCredentialHarvesterCredentialConfigArgs.builder()
 *                 .clusterId(foo_harvester.clusterV1Id())
 *                 .clusterType("imported")
 *                 .kubeconfigContent(foo_harvester.kubeConfig())
 *                 .build())
 *             .build());
 * 
 *         // Create a new rancher2 Node Template using harvester node_driver
 *         var foo_harvesterNodeTemplate = new NodeTemplate("foo-harvesterNodeTemplate", NodeTemplateArgs.builder()
 *             .name("foo-harvester")
 *             .cloudCredentialId(foo_harvesterCloudCredential.id())
 *             .engineInstallUrl("https://releases.rancher.com/install-docker/20.10.sh")
 *             .harvesterConfig(NodeTemplateHarvesterConfigArgs.builder()
 *                 .vmNamespace("default")
 *                 .cpuCount("2")
 *                 .memorySize("4")
 *                 .diskInfo("""
 *     {
 *         "disks": [{
 *             "imageName": "harvester-public/image-57hzg",
 *             "size": 40,
 *             "bootOrder": 1
 *         }]
 *     }
 *                 """)
 *                 .networkInfo("""
 *     {
 *         "interfaces": [{
 *             "networkName": "harvester-public/vlan1"
 *         }]
 *     }
 *                 """)
 *                 .sshUser("ubuntu")
 *                 .userData("""
 *     package_update: true
 *     packages:
 *       - qemu-guest-agent
 *       - iptables
 *     runcmd:
 *       - - systemctl
 *         - enable
 *         - '--now'
 *         - qemu-guest-agent.service
 *                 """)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Using the Hetzner Node Driver
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.rancher2.NodeDriver;
 * import com.pulumi.rancher2.NodeDriverArgs;
 * import com.pulumi.rancher2.NodeTemplate;
 * import com.pulumi.rancher2.NodeTemplateArgs;
 * import com.pulumi.rancher2.inputs.NodeTemplateHetznerConfigArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         // Create a new rancher2 Node Template using hetzner node_driver
 *         var hetznerNodeDriver = new NodeDriver("hetznerNodeDriver", NodeDriverArgs.builder()
 *             .active(true)
 *             .builtin(false)
 *             .name("Hetzner")
 *             .uiUrl("https://storage.googleapis.com/hcloud-rancher-v2-ui-driver/component.js")
 *             .url("https://github.com/JonasProgrammer/docker-machine-driver-hetzner/releases/download/3.6.0/docker-machine-driver-hetzner_3.6.0_linux_amd64.tar.gz")
 *             .whitelistDomains("storage.googleapis.com")
 *             .build());
 * 
 *         var myHetznerNodeTemplate = new NodeTemplate("myHetznerNodeTemplate", NodeTemplateArgs.builder()
 *             .name("my-hetzner-node-template")
 *             .driverId(hetznerNodeDriver.id())
 *             .hetznerConfig(NodeTemplateHetznerConfigArgs.builder()
 *                 .apiToken("XXXXXXXXXX")
 *                 .image("ubuntu-18.04")
 *                 .serverLocation("nbg1")
 *                 .serverType("cx11")
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Upgrading to Rancher v2.3.3
 * 
 * **Important** This process could update `rancher2.NodeTemplate` data on tfstate file. Be sure to save a copy of tfstate file before proceed
 * 
 * Due to [this feature](https://github.com/rancher/rancher/pull/23718) included on Rancher v2.3.3, `rancher2.NodeTemplate` are now global scoped objects with RBAC around them, instead of user scoped objects as they were. This means that existing node templates `id` field is changing on upgrade. Provider implements `fixNodeTemplateID()` that will update tfstate with proper id.
 * 
 */
@ResourceType(type="rancher2:index/nodeTemplate:NodeTemplate")
public class NodeTemplate extends com.pulumi.resources.CustomResource {
    /**
     * AWS config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="amazonec2Config", refs={NodeTemplateAmazonec2Config.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateAmazonec2Config> amazonec2Config;

    /**
     * @return AWS config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateAmazonec2Config>> amazonec2Config() {
        return Codegen.optional(this.amazonec2Config);
    }
    /**
     * Annotations for Node Template object (map)
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> annotations;

    /**
     * @return Annotations for Node Template object (map)
     * 
     */
    public Output<Map<String,Object>> annotations() {
        return this.annotations;
    }
    /**
     * Auth certificate authority for the Node Template (string)
     * 
     */
    @Export(name="authCertificateAuthority", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authCertificateAuthority;

    /**
     * @return Auth certificate authority for the Node Template (string)
     * 
     */
    public Output<Optional<String>> authCertificateAuthority() {
        return Codegen.optional(this.authCertificateAuthority);
    }
    /**
     * Auth key for the Node Template (string)
     * 
     */
    @Export(name="authKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authKey;

    /**
     * @return Auth key for the Node Template (string)
     * 
     */
    public Output<Optional<String>> authKey() {
        return Codegen.optional(this.authKey);
    }
    /**
     * Azure config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="azureConfig", refs={NodeTemplateAzureConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateAzureConfig> azureConfig;

    /**
     * @return Azure config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateAzureConfig>> azureConfig() {
        return Codegen.optional(this.azureConfig);
    }
    /**
     * Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     * 
     */
    @Export(name="cloudCredentialId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> cloudCredentialId;

    /**
     * @return Cloud credential ID for the Node Template. Required from Rancher v2.2.x (string)
     * 
     */
    public Output<Optional<String>> cloudCredentialId() {
        return Codegen.optional(this.cloudCredentialId);
    }
    /**
     * Description for the Node Template (string)
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description for the Node Template (string)
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Digitalocean config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="digitaloceanConfig", refs={NodeTemplateDigitaloceanConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateDigitaloceanConfig> digitaloceanConfig;

    /**
     * @return Digitalocean config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateDigitaloceanConfig>> digitaloceanConfig() {
        return Codegen.optional(this.digitaloceanConfig);
    }
    /**
     * (Computed) The driver of the node template (string)
     * 
     */
    @Export(name="driver", refs={String.class}, tree="[0]")
    private Output<String> driver;

    /**
     * @return (Computed) The driver of the node template (string)
     * 
     */
    public Output<String> driver() {
        return this.driver;
    }
    /**
     * The node driver id used by the node template. It&#39;s required if the node driver isn&#39;t built in Rancher (string)
     * 
     */
    @Export(name="driverId", refs={String.class}, tree="[0]")
    private Output<String> driverId;

    /**
     * @return The node driver id used by the node template. It&#39;s required if the node driver isn&#39;t built in Rancher (string)
     * 
     */
    public Output<String> driverId() {
        return this.driverId;
    }
    /**
     * Engine environment for the node template (string)
     * 
     */
    @Export(name="engineEnv", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> engineEnv;

    /**
     * @return Engine environment for the node template (string)
     * 
     */
    public Output<Optional<Map<String,Object>>> engineEnv() {
        return Codegen.optional(this.engineEnv);
    }
    /**
     * Insecure registry for the node template (list)
     * 
     */
    @Export(name="engineInsecureRegistries", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> engineInsecureRegistries;

    /**
     * @return Insecure registry for the node template (list)
     * 
     */
    public Output<Optional<List<String>>> engineInsecureRegistries() {
        return Codegen.optional(this.engineInsecureRegistries);
    }
    /**
     * Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     * 
     */
    @Export(name="engineInstallUrl", refs={String.class}, tree="[0]")
    private Output<String> engineInstallUrl;

    /**
     * @return Docker engine install URL for the node template. Available install docker versions at `https://github.com/rancher/install-docker` (string)
     * 
     */
    public Output<String> engineInstallUrl() {
        return this.engineInstallUrl;
    }
    /**
     * Engine label for the node template (string)
     * 
     */
    @Export(name="engineLabel", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> engineLabel;

    /**
     * @return Engine label for the node template (string)
     * 
     */
    public Output<Optional<Map<String,Object>>> engineLabel() {
        return Codegen.optional(this.engineLabel);
    }
    /**
     * Engine options for the node template (map)
     * 
     */
    @Export(name="engineOpt", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output</* @Nullable */ Map<String,Object>> engineOpt;

    /**
     * @return Engine options for the node template (map)
     * 
     */
    public Output<Optional<Map<String,Object>>> engineOpt() {
        return Codegen.optional(this.engineOpt);
    }
    /**
     * Engine registry mirror for the node template (list)
     * 
     */
    @Export(name="engineRegistryMirrors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> engineRegistryMirrors;

    /**
     * @return Engine registry mirror for the node template (list)
     * 
     */
    public Output<Optional<List<String>>> engineRegistryMirrors() {
        return Codegen.optional(this.engineRegistryMirrors);
    }
    /**
     * Engine storage driver for the node template (string)
     * 
     */
    @Export(name="engineStorageDriver", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> engineStorageDriver;

    /**
     * @return Engine storage driver for the node template (string)
     * 
     */
    public Output<Optional<String>> engineStorageDriver() {
        return Codegen.optional(this.engineStorageDriver);
    }
    /**
     * Harvester config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="harvesterConfig", refs={NodeTemplateHarvesterConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateHarvesterConfig> harvesterConfig;

    /**
     * @return Harvester config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateHarvesterConfig>> harvesterConfig() {
        return Codegen.optional(this.harvesterConfig);
    }
    /**
     * Hetzner config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="hetznerConfig", refs={NodeTemplateHetznerConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateHetznerConfig> hetznerConfig;

    /**
     * @return Hetzner config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateHetznerConfig>> hetznerConfig() {
        return Codegen.optional(this.hetznerConfig);
    }
    /**
     * Labels for Node Template object (map)
     * 
     * **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Node Template
     * 
     */
    @Export(name="labels", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> labels;

    /**
     * @return Labels for Node Template object (map)
     * 
     * **Note:** `labels` and `node_taints` will be applied to nodes deployed using the Node Template
     * 
     */
    public Output<Map<String,Object>> labels() {
        return this.labels;
    }
    /**
     * Linode config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="linodeConfig", refs={NodeTemplateLinodeConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateLinodeConfig> linodeConfig;

    /**
     * @return Linode config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateLinodeConfig>> linodeConfig() {
        return Codegen.optional(this.linodeConfig);
    }
    /**
     * The name of the Node Template (string)
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the Node Template (string)
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Node taints. For Rancher v2.3.3 and above (List)
     * 
     */
    @Export(name="nodeTaints", refs={List.class,NodeTemplateNodeTaint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NodeTemplateNodeTaint>> nodeTaints;

    /**
     * @return Node taints. For Rancher v2.3.3 and above (List)
     * 
     */
    public Output<Optional<List<NodeTemplateNodeTaint>>> nodeTaints() {
        return Codegen.optional(this.nodeTaints);
    }
    /**
     * Opennebula config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="opennebulaConfig", refs={NodeTemplateOpennebulaConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateOpennebulaConfig> opennebulaConfig;

    /**
     * @return Opennebula config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateOpennebulaConfig>> opennebulaConfig() {
        return Codegen.optional(this.opennebulaConfig);
    }
    /**
     * Openstack config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="openstackConfig", refs={NodeTemplateOpenstackConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateOpenstackConfig> openstackConfig;

    /**
     * @return Openstack config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateOpenstackConfig>> openstackConfig() {
        return Codegen.optional(this.openstackConfig);
    }
    /**
     * Outscale config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="outscaleConfig", refs={NodeTemplateOutscaleConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateOutscaleConfig> outscaleConfig;

    /**
     * @return Outscale config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateOutscaleConfig>> outscaleConfig() {
        return Codegen.optional(this.outscaleConfig);
    }
    /**
     * Engine storage driver for the node template (bool)
     * 
     */
    @Export(name="useInternalIpAddress", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> useInternalIpAddress;

    /**
     * @return Engine storage driver for the node template (bool)
     * 
     */
    public Output<Optional<Boolean>> useInternalIpAddress() {
        return Codegen.optional(this.useInternalIpAddress);
    }
    /**
     * vSphere config for the Node Template (list maxitems:1)
     * 
     */
    @Export(name="vsphereConfig", refs={NodeTemplateVsphereConfig.class}, tree="[0]")
    private Output</* @Nullable */ NodeTemplateVsphereConfig> vsphereConfig;

    /**
     * @return vSphere config for the Node Template (list maxitems:1)
     * 
     */
    public Output<Optional<NodeTemplateVsphereConfig>> vsphereConfig() {
        return Codegen.optional(this.vsphereConfig);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NodeTemplate(String name) {
        this(name, NodeTemplateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NodeTemplate(String name, @Nullable NodeTemplateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NodeTemplate(String name, @Nullable NodeTemplateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodeTemplate:NodeTemplate", name, args == null ? NodeTemplateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NodeTemplate(String name, Output<String> id, @Nullable NodeTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("rancher2:index/nodeTemplate:NodeTemplate", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "authCertificateAuthority",
                "authKey"
            ))
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
    public static NodeTemplate get(String name, Output<String> id, @Nullable NodeTemplateState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NodeTemplate(name, id, state, options);
    }
}
