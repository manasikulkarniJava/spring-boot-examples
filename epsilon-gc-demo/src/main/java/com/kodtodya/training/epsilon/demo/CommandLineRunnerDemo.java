package com.kodtodya.training.epsilon.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandLineRunnerDemo implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(CommandLineRunnerDemo.class, args);
    }
    @Override
    public void run(String... arg0) throws Exception {
        System.out.println("Hello world from Command Line Runner");
    }
}
