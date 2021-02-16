// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Immutable;

namespace Pulumi.Rancher2
{
    public static class Config
    {
        private static readonly Pulumi.Config __config = new Pulumi.Config("rancher2");
        /// <summary>
        /// API Key used to authenticate with the rancher server
        /// </summary>
        public static string? AccessKey { get; set; } = __config.Get("accessKey");

        /// <summary>
        /// The URL to the rancher API
        /// </summary>
        public static string? ApiUrl { get; set; } = __config.Get("apiUrl");

        /// <summary>
        /// Bootstrap rancher server
        /// </summary>
        public static bool? Bootstrap { get; set; } = __config.GetBoolean("bootstrap") ?? Utilities.GetEnvBoolean("RANCHER_BOOTSTRAP") ?? false;

        /// <summary>
        /// CA certificates used to sign rancher server tls certificates. Mandatory if self signed tls and insecure option false
        /// </summary>
        public static string? CaCerts { get; set; } = __config.Get("caCerts");

        /// <summary>
        /// Allow insecure connections to Rancher. Mandatory if self signed tls and not ca_certs provided
        /// </summary>
        public static bool? Insecure { get; set; } = __config.GetBoolean("insecure") ?? Utilities.GetEnvBoolean("RANCHER_INSECURE") ?? false;

        /// <summary>
        /// Rancher connection retries
        /// </summary>
        public static int? Retries { get; set; } = __config.GetInt32("retries");

        /// <summary>
        /// API secret used to authenticate with the rancher server
        /// </summary>
        public static string? SecretKey { get; set; } = __config.Get("secretKey");

        /// <summary>
        /// API token used to authenticate with the rancher server
        /// </summary>
        public static string? TokenKey { get; set; } = __config.Get("tokenKey");

    }
}
