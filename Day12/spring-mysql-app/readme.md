# Build spring-boot application

```
mvn clean install
```

# Run the application:

```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down
```

# Training

# POST
```
curl -X POST http://localhost:8081/user/create -H 'content-type: application/json' -d '{"name": "Rachel","teamName": "friends","salary": 25000 }'
```

# GET
```
curl -X GET http://localhost:8081/user/read
```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;