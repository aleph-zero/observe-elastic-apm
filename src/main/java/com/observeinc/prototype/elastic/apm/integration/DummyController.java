package com.observeinc.prototype.elastic.apm.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController
{
    @GetMapping("/dummy")
    public String dummy()
    {
        System.out.println("Dummy controller called");
        return "Dummy controller called";
    }

    @GetMapping("/")
    public String env()
    {
        System.out.println("Root controller called");
        return "/";
    }
}
