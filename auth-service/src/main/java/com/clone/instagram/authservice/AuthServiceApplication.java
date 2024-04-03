package com.clone.instagram.authservice;

import com.clone.instagram.authservice.messaging.UserEventStream;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@EnableMongoAuditing
@EnableBinding(UserEventStream.class)
@Lazy
public class AuthServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthServiceApplication.class, args);
	}
}
