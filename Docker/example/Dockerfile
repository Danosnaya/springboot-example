FROM openjdk:8-alpine
MAINTAINER LecAnibal <anibsanmor@gmail.com>

RUN mkdir /example
WORKDIR /example

VOLUME /example

EXPOSE 9091 9091

ADD ./example-1.0.jar /example/example-1.0.jar
ENTRYPOINT ["sh", "-c", "java -jar example-1.0.jar" ]