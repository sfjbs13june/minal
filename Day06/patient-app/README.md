## Create the Springboot project using :
https://start.spring.io/

## Build the project using command :
```
mvn clean install
```

## Run the application:

```
mvn spring-boot:run
```

## Testing the application

save Data:
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=142CF83EE1C1FEDA4317A7A6197941B9' \
--data-raw '{
"id":"123",
"name":"merry",
"age":"25",
"gender":"female",
"disease":"fever"
}
'

update Data:
curl --location --request PUT 'localhost:8080/patient/update?disease=headache' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=98E0855AFAF791BD54350E9FEB902C3A' \
--data-raw '{
"id": "123",
"name": "merry",
"age": "25",
"gender": "female",
"disease": "cold"
}'
