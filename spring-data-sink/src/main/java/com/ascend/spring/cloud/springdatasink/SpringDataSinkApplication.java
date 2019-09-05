package com.ascend.spring.cloud.springdatasink;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class SpringDataSinkApplication {

  private static Logger logger = LoggerFactory.getLogger(SpringDataSinkApplication.class);

  @StreamListener(Sink.INPUT)
  public void logSink(String date) {
    logger.info("Received: " + date);
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringDataSinkApplication.class, args);
  }

}
