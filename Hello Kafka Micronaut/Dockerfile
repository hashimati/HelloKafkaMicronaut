FROM openjdk:14-alpine
COPY build/libs/io.hashimati.testkafka-*-all.jar testkafka.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "testkafka.jar"]