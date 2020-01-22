package com.esigproject.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class ProjectEsigApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProjectEsigApplication.class, args);
	}

}
