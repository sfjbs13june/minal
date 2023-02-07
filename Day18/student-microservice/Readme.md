# Create project

``` 
https://start.spring.io/
```

# Build the project

``` 
mvn clean install
```

# Run application

``` 
mvn spring-boot:run
```

# Testing the application
Save Data:

curl -X 'POST' \
'http://localhost:8081/save/student' \
-H 'accept: */*' \
-H 'Content-Type: application/json' \
-d '{
"rollNo": "1",
"name": "chandler",
"std": "9"
}'

Get data:
curl -X 'GET' \
'http://localhost:8081/get/student?name=chandler' \
-H 'accept: */*'

Update data:

curl -X 'PUT' \
'http://localhost:8081/update/student?name=chandler&std=5' \
-H 'accept: */*'

Remove Data:

curl -X 'DELETE' \
'http://localhost:8081/remove/student?name=chandler' \
-H 'accept: */*'


Swagger Page:
http://localhost:8081/swagger-ui/index.html