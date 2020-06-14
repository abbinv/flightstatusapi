package com.clouddemo.flightstatus;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestController
public class StatusController {

	private final HashMap<String, String> flights = new HashMap();
	StatusController(){
		flights.put("KL1111", "SCHEDULED");
		flights.put("KL2222", "DEPARTED");
		flights.put("KL3333", "ARRIVED");
		flights.put("KL4444", "DELAYED");
		flights.put("KL1234", "SCHEDULED");
	}

	@GetMapping("/{flightNumber}")
	public FlightStatus getStatus(@PathVariable String flightNumber) {
		String status = flights.get(flightNumber);
		if(status == null){
			status = "UNKNOWN";
		}
		return new FlightStatus(flightNumber, status);
	}

	@GetMapping("/")
	public String home() {
		return "It works!! Make a get call using /{flightNumber}";
	}

	@PostMapping("/")
	public FlightStatus getStatus(@RequestBody FlightStatus flightStatus) {
		flights.put(flightStatus.flightNumber, flightStatus.status);
		return flightStatus;
	}

}
