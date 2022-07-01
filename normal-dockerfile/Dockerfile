FROM openjdk:8-jre-alpine

ENV LOCAL_PATH /opt/normal-dockerfile
ENV MAIN_CLASS demo.skyleaworlder.normal.Main

COPY target/classes/ $LOCAL_PATH
COPY entrypoint.sh $LOCAL_PATH/entrypoint.sh
COPY pom.xml $LOCAL_PATH/pom.xml

RUN chmod +x $LOCAL_PATH/entrypoint.sh

WORKDIR $LOCAL_PATH

ENTRYPOINT ["/bin/sh", "entrypoint.sh"]
