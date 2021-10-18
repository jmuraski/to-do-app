FROM openjdk:17-jdk-alpine

RUN apk update && apk add curl tzdata

RUN mkdir -p -m 0775 /apps/jars
RUN mkdir -p -m 0775 /apps/docker/logs/archive
RUN mkdir -p -m 0775 /apps/docker/ssl

WORKDIR /apps/jars

ADD ./build/libs/toDoApp-0.0.1-SNAPSHOT.jar /apps/jars/todo.jar

CMD java -jar -Xmx1g -Dserver.port=8080 /apps/jars/todo.jar
EXPOSE 8080
