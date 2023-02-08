## Build the app

``` 
mvn clean install
```

## Run the app

``` 
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down

```

## Post

``` 
curl --location --request POST 'http://localhost:8083/patient/create' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Rachel",
    "id": "123",
    "hospitalName": "Apollo Hospital"
}'
```

## Get 

``` 
curl --location --request GET 'http://localhost:8083/patient/read' 
```

## Put

``` 
curl -X PUT 'http://localhost:8083/patient/update?id=123&name=Robert' 
```

##Delete

```
curl -X DELETE 'http://localhost:8083/patient/delete?name=Robert' 
```




## Show data

```
docker exec -it spring-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.customer.find()

```


## Dockerization

### Maven 
Here i am using maven spotify plugin to create the docker image for this application.
Use the below command to create the docker image.
For creating please use your repository to create the image which will be easy to push image in your docker hub.
update in your pom.xml.
<docker.image.prefix> <your repo name> </docker.image.prefix>

```bash
$ mvn install dockerfile:build
```

### Push docker images

```bash
docker login

$ docker push <repository-name>/<app-name>

```

