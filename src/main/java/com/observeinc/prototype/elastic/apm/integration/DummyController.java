package com.observeinc.prototype.elastic.apm.integration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController
{
    @GetMapping("/dummy")
    public String dummy()
    {
        return "Dummy controller called";
    }

    @GetMapping("/")
    public String env()
    {
        return "/";
    }
}
