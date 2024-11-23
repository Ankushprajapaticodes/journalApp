package com.AnkushCodes.journalApp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HealthCheck {

    @GetMapping("/health-check")
    public String Check(){
        return  "Ok Working! ";
    }
}
