## Import project
Import the project on either eclipse or intellij as a maven import project

## Building

### Maven
This project is maven project which will be build using maven command.

```
$ mvn clean install
```

# Run
```
docker-compose -f docker-compose-mysql.yml up -d

mvn spring-boot:run

docker-compose -f docker-compose-mysql.yml down

```

## Getting inside container

docker exec -it <container-id> /bin/bash
mysql -u user -p
show databases;
use db;
show tables;
select * from user;
