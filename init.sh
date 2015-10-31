#! /bin/bash
# dependances: mysql!!!!!
wildfly=$HOME/wildfly-8.0.0.Final

echo "User (root)mysql:"
read user

echo "mot de passe"
stty -echo
read pass
stty echo
sed "s/\[MDP\]/$pass/" .standalone.xml | sed "s/\[USER\]/$user/" >$wildfly/standalone/configuration/standalone.xml

cp -r mysql $wildfly/modules/system/layers/base/com/
