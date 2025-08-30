#!/bin/sh
##############################################################################
##
##  Gradle start up script for UN*X
##
##############################################################################

if [ -n "$DEBUG" ]; then
  set -x
fi

DIR="$(cd "$(dirname "$0")" && pwd)"
DEFAULT_JVM_OPTS=""

exec "$DIR/gradle/wrapper/gradle-wrapper.jar" "$@"