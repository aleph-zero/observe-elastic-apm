# observe-elastic-apm
Prototype for integrating Elastic APM agent with Observe

Getting Elastic's APM agent to send telemetry to Observe requires the use of an Nginx reverse proxy. 

0. Replace <OBSERVE_CUSTOMER_ID> and <OBSERVE_INGEST_TOKEN> in nginx-reverse-proxy.conf
1.  cd nginx/ && ./nginx-reverse-proxy.sh
2.  ./mvnw spring-boot:run
3.  http://localhost:8080/dummy

Now check Observe and you should see records.
