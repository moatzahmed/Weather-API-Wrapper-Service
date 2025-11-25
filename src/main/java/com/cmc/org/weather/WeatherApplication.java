package com.cmc.org.weather;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class WeatherApplication {


    public static void main(String[] args) {
        SpringApplication.run(WeatherApplication.class, args);


    }

	@Bean
	public CommandLineRunner commandLineRunner(){
		return args -> System.out.println("Hello World");
	}

}
