package com.abhinab_blitz.hr_portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
    @EnableJpaAuditing
    public class HrPortalApplication {
        public static void main(String[] args) {
            SpringApplication.run(HrPortalApplication.class, args);
        }
    }
