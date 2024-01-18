package com.ff.aspectImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AspectImplApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectImplApplication.class, args);
	}

}
