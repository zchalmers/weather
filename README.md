# Weather Notification Service 🌤️

A Spring Boot application that fetches weather data from OpenWeatherAPI and sends automated daily weather notifications via SMS/MMS to registered users. The application features a web interface for user registration and includes beautifully formatted weather images with comprehensive daily forecasts.

## ✨ Features

- **Automated Daily Notifications**: Scheduled weather updates sent directly to your phone
- **Custom Weather Images**: Dynamically generated images with weather information
- **Multi-User Support**: Manage multiple phone numbers with personalized locations
- **Comprehensive Weather Data**: 
  - Current temperature
  - Daily high/low temperatures
  - Rain percentage
  - UV index rating
  - Sunrise/sunset times
  - Moonrise time
- **Web Dashboard**: User-friendly interface for registration and management
- **Location Intelligence**: Automatic IP-based location detection with GeoIP2
- **Carrier-Agnostic**: Support for all major phone carriers via email-to-SMS gateway

## 🏗️ Architecture

### Backend
- **Framework**: Spring Boot 3.0.3
- **Language**: Java 17
- **Database**: MySQL with JPA/Hibernate
- **Build Tool**: Gradle
- **Caching**: Caffeine cache for optimized API calls

### Frontend
- **Framework**: Vanilla JavaScript
- **Module Bundler**: Webpack
- **HTTP Client**: Axios
- **Notifications**: Toastify.js

### External Services
- **Weather Data**: OpenWeatherMap API
- **Messaging**: Twilio SDK & Email-to-SMS
- **Geolocation**: MaxMind GeoIP2

## 📋 Prerequisites

- Java 17 or higher
- MySQL database
- OpenWeatherMap API key ([Get one here](https://openweathermap.org/api))
- Email account for sending SMS messages
- (Optional) Twilio account for enhanced SMS delivery
- Node.js and npm/yarn (for frontend development)

## 🚀 Installation & Setup

### 1. Clone the Repository
```bash
git clone https://github.com/zchalmers/weather.git
cd weather
```

### 2. Database Setup

Create a MySQL database:
```sql
CREATE DATABASE weather_app;
```

### 3. Configure Application Properties

Create or update `src/main/resources/application.properties`:

```properties
# OpenWeatherMap API
openweather.api.key=YOUR_API_KEY_HERE

# Email Configuration (for SMS via email gateway)
email.username=your.email@gmail.com
email.password=your_app_password

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/weather_app
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

# Twilio (Optional - for direct SMS)
twilio.account.sid=YOUR_TWILIO_SID
twilio.auth.token=YOUR_TWILIO_TOKEN
twilio.phone.number=YOUR_TWILIO_PHONE
```

### 4. Build the Application

```bash
./gradlew build
```

### 5. Run the Application

```bash
./gradlew bootRun
```

The application will be available at `http://localhost:8080`

## 📱 Usage

### Register for Weather Notifications

1. Open the web application at `http://localhost:8080`
2. Enter your information:
   - **Location**: City name or ZIP code
   - **Phone Number**: Your mobile number
   - **Phone Carrier**: Select your carrier from the dropdown
3. Click "Send MMS" to register
4. You'll receive a daily MMS with weather information at your scheduled time

### Weather Notification Format

The MMS message includes:
- 📸 Custom-generated weather image
- 🌡️ Current temperature
- ⬆️⬇️ High/low temperatures for the day
- 🌧️ Rain probability percentage
- ☀️ UV index rating
- 🌅 Sunrise and sunset times
- 🌙 Moonrise time

### API Endpoints

#### Get Current Weather (Trigger Manual Send)
```http
GET /weather/current
```
Manually triggers weather notifications to all registered users.

#### Add User
```http
POST /weather/user
Content-Type: application/json

{
  "phoneNumber": "1234567890",
  "carrier": "verizon",
  "location": "Seattle, WA"
}
```

#### Delete User
```http
POST /weather/user/delete/{phoneNumber}
```

## 📦 Project Structure

```
weather/
├── Frontend/                 # JavaScript frontend
│   ├── src/
│   │   ├── css/             # Stylesheets
│   │   ├── pages/           # HTML pages
│   │   └── js/              # JavaScript modules
│   ├── package.json
│   └── webpack.config.js
├── src/
│   └── main/
│       ├── java/com/weather/server/
│       │   ├── controller/  # REST controllers
│       │   ├── service/     # Business logic
│       │   │   ├── WeatherService.java
│       │   │   ├── EmailService.java
│       │   │   ├── TwilioService.java
│       │   │   ├── SQLService.java
│       │   │   └── ImageDrawing.java
│       │   ├── repository/  # Data access
│       │   └── converter/   # Data transformers
│       └── resources/
│           ├── application.properties
│           └── static/      # Frontend build output
└── build.gradle
```

## 🛠️ Technologies Used

**Backend:**
- Spring Boot 3.0.3
- Spring Web (REST API)
- Spring Data JPA (Database ORM)
- Spring Cache (Caffeine)
- MySQL Connector
- Twilio SDK
- MaxMind GeoIP2
- Jakarta Mail (Email to SMS)
- Swagger/OpenAPI (API Documentation)

**Frontend:**
- JavaScript (ES6+)
- Webpack 4
- Axios (HTTP requests)
- Toastify.js (Notifications)
- HTML5/CSS3

**Development Tools:**
- Gradle
- JUnit & Mockito (Testing)
- Testcontainers (Integration testing)
- Spring Boot DevTools

## 🔧 Configuration Options

### Phone Carrier Email Gateways

The application supports email-to-SMS for major carriers:
- Verizon: `number@vtext.com`
- AT&T: `number@txt.att.net`
- T-Mobile: `number@tmomail.net`
- Sprint: `number@messaging.sprintpcs.com`

### Scheduling

Weather notifications are sent on a scheduled basis. Configure the schedule in the `WeatherService` class using Spring's `@Scheduled` annotation.

### Image Customization

Weather images are generated using the `ImageDrawing` service. Customize the appearance by modifying the drawing logic in `ImageDrawing.java`.

## 🧪 Testing

Run the test suite:
```bash
./gradlew test
```

## 🚧 Development

### Frontend Development

```bash
cd Frontend
npm install
npm start
```

The frontend dev server will run at `http://localhost:8081` with hot-reloading.

### Building for Production

```bash
./gradlew build
```

This will:
1. Build the frontend (Webpack production build)
2. Copy frontend assets to `src/main/resources/static`
3. Compile Java sources
4. Run tests
5. Create executable JAR

## 📝 API Documentation

Once the application is running, access the Swagger UI at:
```
http://localhost:8080/swagger-ui.html
```

## 🔐 Security Notes

- Never commit API keys or passwords to version control
- Use environment variables or secure configuration management
- For Gmail, use App Passwords instead of your main password
- Consider implementing rate limiting for API endpoints

## 🐛 Troubleshooting

**Issue: SMS not received**
- Verify email credentials are correct
- Check carrier email gateway format
- Ensure OpenWeatherMap API key is valid

**Issue: Database connection error**
- Verify MySQL is running
- Check database credentials in `application.properties`
- Ensure database exists

**Issue: Weather data not fetching**
- Verify API key is valid and active
- Check API rate limits
- Review application logs for errors

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

## 📄 License

This project is licensed under UNLICENSED - see the project for details.

## 👤 Author

**Zach Chalmers**

## 🙏 Acknowledgments

- OpenWeatherMap for weather data API
- Twilio for SMS infrastructure
- MaxMind for GeoIP2 database
- Spring Boot community

---

**Note**: This application was created as a capstone project demonstrating full-stack development, API integration, scheduled tasks, and messaging services.
