# 1. 빌드 단계
FROM gradle:7.6.0-jdk17 AS build

# 프로젝트 소스 복사
COPY --chown=gradle:gradle . /app
WORKDIR /app

# Gradle 빌드
RUN gradle build --no-daemon

# 2. 실행 단계
FROM openjdk:17-jdk-slim

# JAR 파일 복사
COPY --from=build /app/build/libs/*.jar app.jar

# 애플리케이션 실행
ENTRYPOINT ["java", "-jar", "/app.jar"]