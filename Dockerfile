FROM vasuniranjan.jfrog.io/niranjan-docker-virtual/tomcat:9.0.56-jdk17-temurin
MAINTAINER V Niranjan
ADD target/HelloWorld-DevOps.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]
