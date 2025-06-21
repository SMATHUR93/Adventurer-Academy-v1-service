package com.shrek.AdventurerAcademyV1Service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/adventurerAcademy")
public class HealthCheckController {

    @GetMapping("/isServiceUp")
    public String isServiceUp() {
        return "Service is UP !!";
    }

}
