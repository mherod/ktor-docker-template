FROM openjdk:8-jre-alpine

COPY ./build/libs/*.jar /root/
COPY ./*.sh /root/

WORKDIR /root

EXPOSE 8080

RUN mkdir /root/static

CMD sh server.sh