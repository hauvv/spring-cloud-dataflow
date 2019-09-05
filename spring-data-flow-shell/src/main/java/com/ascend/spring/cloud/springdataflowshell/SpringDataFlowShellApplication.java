package com.ascend.spring.cloud.springdataflowshell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.dataflow.shell.EnableDataFlowShell;

@EnableDataFlowShell
@SpringBootApplication
public class SpringDataFlowShellApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataFlowShellApplication.class, args);
	}

}
