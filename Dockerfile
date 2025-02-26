FROM alpine:3.21.3

RUN apk add openjdk21
COPY ./build/libs/cats-api.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]
