FROM openjdk:8-jre-slim
MAINTAINER yuriy

ENV PARAMS=""

#ENV TZ=PRC
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

ADD target/git_actions-0.0.1-SNAPSHOT.jar /app.jar
ENTRYPOINT ["sh","-c","java -jar $JAVA_OPTS -Dspring.profiles.active=$SPRING_PROFILE_ACTIVE /app.jar $PARAMS"]
