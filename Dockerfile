From openjdk:8
copy ./target/gateway-0.0.1-SNAPSHOT.jar gateway-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","gateway-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080