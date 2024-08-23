# Java 22 kullanarak temel imaj oluşturuyoruz
FROM openjdk:22-jdk

# Uygulamanın JAR dosyasını konteynere kopyalıyoruz
COPY /WebChatApp/target/websocket-app.jar /app.jar

# Uygulamanın çalışacağı portu belirtiyoruz
EXPOSE 8080

# Uygulamayı başlatmak için gerekli komut
ENTRYPOINT ["java", "-jar", "/app.jar"]
