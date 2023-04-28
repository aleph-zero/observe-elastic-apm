# observe-elastic-apm
Prototype for integrating Elastic APM agent with Observe

Getting Elastic's APM agent to send telemetry to Observe requires the use of an Nginx reverse proxy. This project contains a simple Spring Boot application which registers an instance of Elastic APM agent in code and uses property settings in src/main/resources/elasticapm.properties to configure the agent to send data to a port on localhost.

- Replace <OBSERVE_CUSTOMER_ID> and <OBSERVE_INGEST_TOKEN> in nginx-reverse-proxy.conf
-  cd nginx/ && ./nginx-reverse-proxy.sh
-  ./mvnw spring-boot:run
-  http://localhost:8080/dummy

Now check Observe and you should see records.
