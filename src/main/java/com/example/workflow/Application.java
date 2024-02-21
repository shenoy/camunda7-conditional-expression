package com.example.workflow;

import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    ProcessEngines.getDefaultProcessEngine().getRuntimeService().startProcessInstanceByKey("camunda-examples-process");
  }
}