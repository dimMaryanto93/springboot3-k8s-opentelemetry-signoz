ARG JDK_VERSION=17-alpine
FROM eclipse-temurin:${JDK_VERSION}
LABEL maintener="Dimas Maryanto <software.dimas_m@icloud.com>"

ENV SERVER_PORT=8080
ENV OTEL_RESOURCE_ATTRIBUTES="service.name=springweb-example"
ENV OTEL_EXPORTER_OTLP_HEADERS="signoz-access-token={SIGNOZ_INGESTION_KEY}"
ENV OTEL_EXPORTER_OTLP_ENDPOINT="https://ingest.{region}.signoz.cloud:443"

# installing os dependencies
RUN apk add wget curl

# setup application
WORKDIR /usr/share/applications

ARG JAR_FILE="springweb-1.0.0-release.jar"
COPY target/${JAR_FILE} spring-boot.jar
RUN wget https://github.com/open-telemetry/opentelemetry-java-instrumentation/releases/latest/download/opentelemetry-javaagent.jar

ENTRYPOINT ["java", "-jar", "-Djava.security.egd=file:/dev/./urandom", "spring-boot.jar"]

CMD ["--server.port=${SERVER_PORT}", "-javaagent:$PWD/opentelemetry-javaagent.jar"]
EXPOSE ${SERVER_PORT}/tcp