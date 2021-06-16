package io.txf4311.librams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "io.txf4311")
public class MsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsApplication.class);
    }
}
