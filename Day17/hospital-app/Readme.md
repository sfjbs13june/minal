# Build

mvn clean install

# Run
docker-compose -f docker-compose-rabbitmq.yml up -d


rabbitmq-demo-producer> mvn spring-boot:run

# Test
curl --location --request GET 'http://localhost:8080/rabbitmq/producer?empName=joey&id=123'


rabbit-mq-hospital-app-consumer> mvn spring-boot:run

#Show data on browser::

http://localhost:15672/

user-name:guest
password:guest


## Stop Container

docker-compose -f docker-compose-rabbitmq.yml down