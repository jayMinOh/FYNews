#!/bin/bash

pushd . >& /dev/null

cd /home/www/bin/GNP
pwd
../git-chk jayMinOh GNP master

cd /home/DATA/www/GNP
pwd
ant -f ./GNP/build/build-web.xml dist

popd >& /dev/null
~