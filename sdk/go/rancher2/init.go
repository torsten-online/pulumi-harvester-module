// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rancher2

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "rancher2:index/activeDirectory:ActiveDirectory":
		r = &ActiveDirectory{}
	case "rancher2:index/app:App":
		r = &App{}
	case "rancher2:index/appV2:AppV2":
		r = &AppV2{}
	case "rancher2:index/authConfigActiveDirectory:AuthConfigActiveDirectory":
		r = &AuthConfigActiveDirectory{}
	case "rancher2:index/authConfigAdfs:AuthConfigAdfs":
		r = &AuthConfigAdfs{}
	case "rancher2:index/authConfigAzureAd:AuthConfigAzureAd":
		r = &AuthConfigAzureAd{}
	case "rancher2:index/authConfigFreeIpa:AuthConfigFreeIpa":
		r = &AuthConfigFreeIpa{}
	case "rancher2:index/authConfigGithub:AuthConfigGithub":
		r = &AuthConfigGithub{}
	case "rancher2:index/authConfigKeycloak:AuthConfigKeycloak":
		r = &AuthConfigKeycloak{}
	case "rancher2:index/authConfigOkta:AuthConfigOkta":
		r = &AuthConfigOkta{}
	case "rancher2:index/authConfigOpenLdap:AuthConfigOpenLdap":
		r = &AuthConfigOpenLdap{}
	case "rancher2:index/authConfigPing:AuthConfigPing":
		r = &AuthConfigPing{}
	case "rancher2:index/bootstrap:Bootstrap":
		r = &Bootstrap{}
	case "rancher2:index/catalog:Catalog":
		r = &Catalog{}
	case "rancher2:index/catalogV2:CatalogV2":
		r = &CatalogV2{}
	case "rancher2:index/certificate:Certificate":
		r = &Certificate{}
	case "rancher2:index/cloudCredential:CloudCredential":
		r = &CloudCredential{}
	case "rancher2:index/cluster:Cluster":
		r = &Cluster{}
	case "rancher2:index/clusterAlertGroup:ClusterAlertGroup":
		r = &ClusterAlertGroup{}
	case "rancher2:index/clusterAlertRule:ClusterAlertRule":
		r = &ClusterAlertRule{}
	case "rancher2:index/clusterAlterGroup:ClusterAlterGroup":
		r = &ClusterAlterGroup{}
	case "rancher2:index/clusterAlterRule:ClusterAlterRule":
		r = &ClusterAlterRule{}
	case "rancher2:index/clusterDriver:ClusterDriver":
		r = &ClusterDriver{}
	case "rancher2:index/clusterRoleTemplateBinding:ClusterRoleTemplateBinding":
		r = &ClusterRoleTemplateBinding{}
	case "rancher2:index/clusterSync:ClusterSync":
		r = &ClusterSync{}
	case "rancher2:index/clusterTemplate:ClusterTemplate":
		r = &ClusterTemplate{}
	case "rancher2:index/clusterV2:ClusterV2":
		r = &ClusterV2{}
	case "rancher2:index/configMapV2:ConfigMapV2":
		r = &ConfigMapV2{}
	case "rancher2:index/etcdBackup:EtcdBackup":
		r = &EtcdBackup{}
	case "rancher2:index/feature:Feature":
		r = &Feature{}
	case "rancher2:index/globalDns:GlobalDns":
		r = &GlobalDns{}
	case "rancher2:index/globalDnsProvider:GlobalDnsProvider":
		r = &GlobalDnsProvider{}
	case "rancher2:index/globalRole:GlobalRole":
		r = &GlobalRole{}
	case "rancher2:index/globalRoleBinding:GlobalRoleBinding":
		r = &GlobalRoleBinding{}
	case "rancher2:index/machineConfigV2:MachineConfigV2":
		r = &MachineConfigV2{}
	case "rancher2:index/multiClusterApp:MultiClusterApp":
		r = &MultiClusterApp{}
	case "rancher2:index/namespace:Namespace":
		r = &Namespace{}
	case "rancher2:index/nodeDriver:NodeDriver":
		r = &NodeDriver{}
	case "rancher2:index/nodePool:NodePool":
		r = &NodePool{}
	case "rancher2:index/nodeTemplate:NodeTemplate":
		r = &NodeTemplate{}
	case "rancher2:index/notifier:Notifier":
		r = &Notifier{}
	case "rancher2:index/podSecurityPolicyTemplate:PodSecurityPolicyTemplate":
		r = &PodSecurityPolicyTemplate{}
	case "rancher2:index/project:Project":
		r = &Project{}
	case "rancher2:index/projectAlertGroup:ProjectAlertGroup":
		r = &ProjectAlertGroup{}
	case "rancher2:index/projectAlertRule:ProjectAlertRule":
		r = &ProjectAlertRule{}
	case "rancher2:index/projectRoleTemplateBinding:ProjectRoleTemplateBinding":
		r = &ProjectRoleTemplateBinding{}
	case "rancher2:index/registry:Registry":
		r = &Registry{}
	case "rancher2:index/roleTempalte:RoleTempalte":
		r = &RoleTempalte{}
	case "rancher2:index/roleTemplate:RoleTemplate":
		r = &RoleTemplate{}
	case "rancher2:index/secret:Secret":
		r = &Secret{}
	case "rancher2:index/secretV2:SecretV2":
		r = &SecretV2{}
	case "rancher2:index/setting:Setting":
		r = &Setting{}
	case "rancher2:index/storageClassV2:StorageClassV2":
		r = &StorageClassV2{}
	case "rancher2:index/token:Token":
		r = &Token{}
	case "rancher2:index/user:User":
		r = &User{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:rancher2" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, _ := PkgVersion()
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/activeDirectory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/app",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/appV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigActiveDirectory",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigAdfs",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigAzureAd",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigFreeIpa",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigGithub",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigKeycloak",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigOkta",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigOpenLdap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/authConfigPing",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/bootstrap",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/catalog",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/catalogV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/certificate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/cloudCredential",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/cluster",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterAlertGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterAlertRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterAlterGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterAlterRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterDriver",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterRoleTemplateBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterSync",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/clusterV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/configMapV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/etcdBackup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/feature",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/globalDns",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/globalDnsProvider",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/globalRole",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/globalRoleBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/machineConfigV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/multiClusterApp",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/namespace",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/nodeDriver",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/nodePool",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/nodeTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/notifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/podSecurityPolicyTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/project",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/projectAlertGroup",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/projectAlertRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/projectRoleTemplateBinding",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/registry",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/roleTempalte",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/roleTemplate",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/secret",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/secretV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/setting",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/storageClassV2",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/token",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"rancher2",
		"index/user",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"rancher2",
		&pkg{version},
	)
}
