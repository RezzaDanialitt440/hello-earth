FROM openjdk:21
VOLUME /tmp
COPY earth-0.0.1-SNAPSHOT.jar earth-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/earth-0.0.1-SNAPSHOT.jar"]