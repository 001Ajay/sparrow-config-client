package org.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping("/sparrow")
public class SparrowConfigClientApplication {
	
	@Autowired
	private ProjectConfig config;
	
	@RequestMapping("/property")	
	public String getDemo(){
		return config.getProperty();
	}

	public static void main(String[] args) {
		SpringApplication.run(SparrowConfigClientApplication.class, args);
	}
}
