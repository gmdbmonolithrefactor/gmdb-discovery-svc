package com.galvanize.gmdb.disc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GmdbDiscoverySvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmdbDiscoverySvcApplication.class, args);
    }

}
