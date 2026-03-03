FROM ubuntu:latest
LABEL authors="Raphael_Faure"

WORKDIR /app

COPY pom.xml .

COPY . /app

RUN mvn package

CMD ["java", "-jar", "target/laskin.jar"]