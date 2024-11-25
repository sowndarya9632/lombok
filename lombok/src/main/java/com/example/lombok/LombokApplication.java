package com.example.lombok;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LombokApplication {

	public static void main(String[] args) {

		SpringApplication.run(LombokApplication.class, args);
		log.info("Info Level");
		log.error("Error level");
		log.debug("Debuf level");
		log.warn("Warn level");
	}

}
