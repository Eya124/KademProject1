package tn.agena3000.cloud.kademproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KademprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(KademprojectApplication.class, args);
    }

}
