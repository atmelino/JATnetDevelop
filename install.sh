#!/bin/bash

echo "installing JATnetDevelop.war to Tomcat"

while true
do

	echo "ls before"
	ls -la /var/lib/tomcat7/webapps

	echo "copy file"
	sudo cp JATnetDevelop.war /var/lib/tomcat7/webapps

	echo "change mod"
	sudo chmod 666 /var/lib/tomcat7/webapps/JATnetDevelop.war

	echo "ls after"
	ls -la /var/lib/tomcat7/webapps

	echo "Press enter to run again"
	echo "Pres CTRL+C to stop..."
	read input
done




