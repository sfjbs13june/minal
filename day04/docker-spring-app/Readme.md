## Simple calculator app

### Build application

    mvn clean install

### Run Application
    mvn spring-boot:run

### Create docker image

    mvn install dockerfile:build

## Run docker image

    docker run -p 8080:8080 minal04/docker-spring-app:0.0.1-SNAPSHOT

### List the docker active containers
    docker ps

### List all docker containers (active and inactive container)
    docker ps -a

### Stop active running container
    docker stop <containerid> ex: e471a90e5266
    docker stop 3e70b89013a8

### Remove the containers
    docker rm <container-id> ex: e471a90e5266
    docker rm 3e70b89013a8

### List all docker images
    docker images

### Remove docker images
    docker rmi <imageaid>