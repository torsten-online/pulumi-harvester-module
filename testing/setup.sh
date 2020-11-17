#!/usr/bin/env bash
set -x -ef -o pipefail

./testing/wait-for-local-rancher.sh

# install requirements
pip install -r testing/requirements.txt
# this python script returns a token
# we use this python script because it hands retries for us if we get a 5xx response
APIRESPONSE=$(python testing/provision-rancher.py)

export RANCHER_ACCESS_KEY=$(echo $APIRESPONSE |cut -d ':' -f 1)
export RANCHER_SECRET_KEY=$(echo $APIRESPONSE | cut -d ':' -f 2)
echo "RANCHER_ACCESS_KEY=$RANCHER_ACCESS_KEY" >> $GITHUB_ENV
echo "RANCHER_SECRET_KEY=$RANCHER_SECRET_KEY" >> $GITHUB_ENV
