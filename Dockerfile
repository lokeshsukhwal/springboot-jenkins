FROM openjdk:17
EXPOSE 9090
ADD target/springbootJenkins-0.0.1-SNAPSHOT.jar springbootJenkins-0.0.1-SNAPSHOT.jar
LABEL authors="Lokesh"

ENTRYPOINT ["java", "-jar","/springbootJenkins-0.0.1-SNAPSHOT.jar"]