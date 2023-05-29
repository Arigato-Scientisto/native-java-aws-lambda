#base JDK Image for GraalVM
FROM openjdk:17

RUN mkdir app
COPY /target/native-image-test-with-java-native-code-1.0-SNAPSHOT-jar-with-dependencies.jar /app

WORKDIR /app
RUN ls
# RUN /usr/bin/mvn native:compile -Pnative
# Copy the native executable into the containers and rename it to jibber
#COPY --from=build /build/target/jibber .
ENTRYPOINT ["java", "-jar", "native-image-test-with-java-native-code-1.0-SNAPSHOT-jar-with-dependencies.jar"]
