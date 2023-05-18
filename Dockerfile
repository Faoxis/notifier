FROM openjdk:17-slim
WORKDIR /app

COPY build/libs/notifier.jar build/

WORKDIR /app/build
ENTRYPOINT java -jar notifier.jar