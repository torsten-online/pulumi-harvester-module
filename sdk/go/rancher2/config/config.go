// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package config

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi/config"
)

// API Key used to authenticate with the rancher server
func GetAccessKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "rancher2:accessKey")
}

// The URL to the rancher API
func GetApiUrl(ctx *pulumi.Context) string {
	return config.Get(ctx, "rancher2:apiUrl")
}

// Bootstrap rancher server
func GetBootstrap(ctx *pulumi.Context) bool {
	v, err := config.TryBool(ctx, "rancher2:bootstrap")
	if err == nil {
		return v
	}
	return getEnvOrDefault(false, parseEnvBool, "RANCHER_BOOTSTRAP").(bool)
}

// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
func GetCaCerts(ctx *pulumi.Context) string {
	return config.Get(ctx, "rancher2:caCerts")
}

// Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
func GetInsecure(ctx *pulumi.Context) bool {
	v, err := config.TryBool(ctx, "rancher2:insecure")
	if err == nil {
		return v
	}
	return getEnvOrDefault(false, parseEnvBool, "RANCHER_INSECURE").(bool)
}

// Rancher connection retries
func GetRetries(ctx *pulumi.Context) int {
	return config.GetInt(ctx, "rancher2:retries")
}

// API secret used to authenticate with the rancher server
func GetSecretKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "rancher2:secretKey")
}

// API token used to authenticate with the rancher server
func GetTokenKey(ctx *pulumi.Context) string {
	return config.Get(ctx, "rancher2:tokenKey")
}
