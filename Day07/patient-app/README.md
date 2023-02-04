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

curl --location --request POST 'localhost:8082/patient/save'

curl --location --request PUT 'localhost:8082/patient/update?disease=fever&age=25'


```

### Security for application

```

curl --location --request POST 'http://localhost:8082/patient/save?disease=fever&age=25' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A94DBC23C7082813FCF48EE87C8F8535' \
--data-raw '{
"id" : "pat01",
"name": "pat_test",
"age" : "22",
"gender" : "Male",
"disease" : "Headache"
}'

curl --location --request PUT 'http://localhost:8082/patient/update?disease=fever&age=22' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A94DBC23C7082813FCF48EE87C8F8535' \
--data-raw '{
"id" : "pat01",
"name": "pat_test",
"age" : "22",
"gender" : "Male",
"disease" : "Headache"
}'

