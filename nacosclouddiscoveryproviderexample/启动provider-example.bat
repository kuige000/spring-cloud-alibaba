@echo off
d:
cd \IdeaProjects\spring-cloud-alibaba\nacosclouddiscoveryproviderexample\target\

start cmd /c "title provider-example-1 && java -jar nacos-cloud-discovery-provider-example-1.0-SNAPSHOT.jar"
start cmd /c "title provider-example2-1 && java -jar nacos-cloud-discovery-provider-example2-1.0-SNAPSHOT.jar"

pause