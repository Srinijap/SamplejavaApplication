FROM openjdk
COPY target/SpringBootRestAPI-0.0.1-SNAPSHOT.jar SpringBootRestAPI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/SpringBootRestAPI-0.0.1-SNAPSHOT.jar"]