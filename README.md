# observe-elastic-apm
Prototype for integrating Elastic APM agent with Observe

Getting Elastic's APM agent to send telemetry to Observe requires the use of an Nginx reverse proxy. This project contains a simple Spring Boot application which registers an instance of Elastic APM agent in code and uses property settings in src/main/resources/elasticapm.properties to configure the agent to send data to a port on localhost.


This hack requires a Dockerized Nginx proxy to get around authentication issues.

Download the Elastic APM server:
- https://www.elastic.co/downloads/past-releases#apm-server-oss
- License: Apache 2
- Version: 7.17.10

Edit the Nginx config:
- Edit nginx/nginx-reverse-proxy.conf
- Change the Bearer token to an ingest token for your Observe instance
- Change the proxy_pass directive to hit your Observe instance

Steps to test:
- Run the Nginx proxy: ./nginx-reverse-proxy.sh 
- Build the dummy Java web service: ./mvnw clean package -DskipTests=true
- Run the dummy Java web service: ./mvnw spring-boot:run
- Hit a few endpoints to generate traffic: http://localhost:8080/dummy
- Run the Elastic APM server: ./apm-server -c ./elastic/apm-server.yml 
- Check your Observe instance for data

