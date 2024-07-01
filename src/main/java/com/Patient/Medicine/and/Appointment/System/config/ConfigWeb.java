package com.Patient.Medicine.and.Appointment.System.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@Configuration
public class ConfigWeb {

        // Bean creation to Config Method Not Allowed
        @Bean
        public HiddenHttpMethodFilter hiddenHttpMethodFilter() {
            return new HiddenHttpMethodFilter();
        }
    }



