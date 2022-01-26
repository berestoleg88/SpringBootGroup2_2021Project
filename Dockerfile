FROM openjdk:11

ADD target/test-jar-group2.war test-jar-group2.war

EXPOSE 8076

ENTRYPOINT ["java", "-jar", "test-jar-group2.war"]