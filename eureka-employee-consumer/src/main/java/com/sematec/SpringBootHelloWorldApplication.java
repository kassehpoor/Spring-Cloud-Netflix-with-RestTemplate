package com.sematec;

import java.io.IOException;

import com.sematec.controllers.ConsumerController_Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;


@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				SpringBootHelloWorldApplication.class, args);
		
		ConsumerController_Client consumerControllerClient= (ConsumerController_Client) ctx.getBean("client");

		System.out.println(consumerControllerClient);
		consumerControllerClient.getEmployee();
		
	}
	
	@Bean
	public  ConsumerController_Client  consumerControllerClient()
	{
		return  new ConsumerController_Client();
	}
}
