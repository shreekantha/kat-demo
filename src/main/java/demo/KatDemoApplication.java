package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("ag.kat")
public class KatDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(KatDemoApplication.class, args);
    }
}
