package com.game.community.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		System.out.println("테스트");
		SpringApplication.run(ServerApplication.class, args);
	}

}
