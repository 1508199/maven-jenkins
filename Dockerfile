FROM openjdk:11
EXPOSE 8080
ADD target/maven-jenkins.jar maven-jenkins.jar
ENTRYPOINT ["java", "-jar", "/maven-jenkins.jar"]