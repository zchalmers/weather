package com.weather.server;


import com.weather.server.repository.UserRecord;
import com.weather.server.service.SQLService;
import com.weather.server.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	@Autowired
	public SQLService sqlService;
	@Autowired
	public WeatherService weatherService;
	@GetMapping("/current")
	public ResponseEntity<String> currentWeather (){
		weatherService.sendTexts();

		return ResponseEntity.ok("Sent Texts");
	}

	@PostMapping("/user")
	public ResponseEntity<UserRecord> addUser(@RequestBody UserRecord userRecord){
		sqlService.addUserToTable(userRecord);
		return ResponseEntity.ok(userRecord);
	}

	@PostMapping("/user/delete/{phoneNumber}")
	public ResponseEntity<String> deleteUser(@RequestParam(name = "phoneNumber") String phoneNumber){
		String response = sqlService.deleteUser(phoneNumber);
		return ResponseEntity.ok(response);
	}

}
