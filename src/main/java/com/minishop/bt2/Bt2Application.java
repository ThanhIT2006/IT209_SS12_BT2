package com.minishop.bt2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Bt2Application {

    public static void main(String[] args) {
        SpringApplication.run(Bt2Application.class, args);
    }

}
@RestController
class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Release Docker Demo v1.0.0";
    }
}