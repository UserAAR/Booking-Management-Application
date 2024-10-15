FROM openjdk:22

COPY build/libs/booking_app-END-0.0.1-SNAPSHOT.jar booking-app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "booking-app.jar"]