package com.OPEN_CV.characterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class JungbumApplication {
	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.properties,"
			+ "classpath:aws.yml";

	public static void main(String[] args) {

		new SpringApplicationBuilder(JungbumApplication.class)
				.properties(APPLICATION_LOCATIONS)
				.run(args);

	}

}
