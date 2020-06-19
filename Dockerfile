FROM  openjdk:11
COPY build.sh .
RUN chmod +x build.sh
COPY manifest-az.yaml manifest-az.yaml
COPY /target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]