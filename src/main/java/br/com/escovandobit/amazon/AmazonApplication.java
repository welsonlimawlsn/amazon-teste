package br.com.escovandobit.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/health-check")
public class AmazonApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmazonApplication.class, args);
    }

    @GetMapping
    public String healthCheck() {
        return "Applicação OK";
    }

}
