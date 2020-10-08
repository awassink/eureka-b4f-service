package nl.quintor.minor.cnsd.blok1.b4fservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class B4fServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(B4fServiceApplication.class, args);
	}

}
