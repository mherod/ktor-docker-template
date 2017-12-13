#!/bin/sh
sh server-background.sh &
java -server -Xms128m -Xmx256m -XX:+UseG1GC -XX:MaxGCPauseMillis=100 -XX:+UseStringDeduplication -jar my-application-1.0-SNAPSHOT.jar