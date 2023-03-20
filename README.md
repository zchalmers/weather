## SpringBoot Weather App

This SpringBoot application uses the OpenWeatherAPI to get weather data for a specified location and sends a daily MMS message to your phone number with the weather information for that location.

### Requirements

Java 11 or higher

Maven

OpenWeatherAPI key

Email account to send MMS messages

### Installation

1. Clone the repository

2. Open the project in your preferred IDE

3. Set the openweather.api.key property in the application.properties file to your OpenWeatherAPI key

4. Set the email.username and email.password properties in the application.properties file to the credentials for the email account you will be using to send the MMS messages

5. Build the project using Maven

6. Run the project 

### Usage

1. Access the main page of the application

2. Enter your location, phone number, and phone carrier in the input fields

3. Click the "Send MMS" button

4. Wait for the MMS message to be delivered to your phone number

5. The MMS message will contain a stock photo with the weather information for your specified location. The weather information will include the current temperature, the high/low temps for the day, the rain percentage for the day, the UV rating, sunrise time, moonrise time, and sunset time.

### Credits

This application was created by Zach Chalmers and uses the following technologies:

SpringBoot

OpenWeatherAPI

Graphics library in Java

Maven

Email to send MMS messages
