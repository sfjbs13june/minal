# Create Project

```
https://start.spring.io/
```
# Build the project

```
mvn clean install
```
# Run the application

```
mvn spring-boot:run
```
# Testing the application
curl --location --request POST 'localhost:8080/patient/save'
curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=15'

### Security for application


curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C8E88CBD1C2ACB97C642207416588784' \
--data-raw '{
"id":"123",
"name":"pat123",
"age":"30",
"gender":"female",
"disease":"headache"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=25' \
--header 'Authorization: Basic YWRtaW4xMjM6cGFzc3dvcmQ=' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C8E88CBD1C2ACB97C642207416588784' \
--data-raw '{
"id":"123",
"name":"pat123",
"age":"30",
"gender":"female",
"disease":"headache"
}'

