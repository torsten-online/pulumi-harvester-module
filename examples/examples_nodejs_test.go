// Copyright 2016-2020, Pulumi Corporation.  All rights reserved.
// +build nodejs all

package examples

import (
	"path"
	"testing"

	"github.com/pulumi/pulumi/pkg/v3/testing/integration"
)

func TestAccUserTs(t *testing.T) {
	skipIfNoPulumiAccessToken(t)
	test := getJSBaseOptions().
		With(integration.ProgramTestOptions{
			Dir: path.Join(getCwd(t), "user", "ts"),
		})

	integration.ProgramTest(t, &test)
}

func getJSBaseOptions() integration.ProgramTestOptions {
	base := getBaseOptions()
	baseJS := base.With(integration.ProgramTestOptions{
		Dependencies: []string{
			"@pulumi/rancher2",
		},
	})

	return baseJS
}
