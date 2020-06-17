FROM  openjdk:11
COPY build.sh .
RUN chmod +x build.sh
COPY /target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]