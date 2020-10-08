FROM amazoncorretto:11
COPY target/b4f-service-0.0.1-SNAPSHOT.jar b4f-service.jar
ENTRYPOINT ["java","-jar","/b4f-service.jar"]