FROM eclipse-temurin:17
COPY target/jen.jar jen.jar
CMD ["java","-jar","jen.jar"]