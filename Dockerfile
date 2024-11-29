FROM openjdk:17


COPY "./target/MongoBotanicDB-1.jar" "app.jar"
EXPOSE 8070
ENTRYPOINT [ "java", "-jar", "app.jar" ]