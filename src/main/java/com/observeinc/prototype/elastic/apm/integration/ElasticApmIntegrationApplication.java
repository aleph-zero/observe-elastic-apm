package com.observeinc.prototype.elastic.apm.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.elastic.apm.attach.ElasticApmAttacher;

@SpringBootApplication
public class ElasticApmIntegrationApplication
{
	public static void main(String[] args)
	{
		ElasticApmAttacher.attach();
		SpringApplication.run(ElasticApmIntegrationApplication.class, args);
	}
}
