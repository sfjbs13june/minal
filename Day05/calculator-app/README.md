## Build application

``` 
mvn clean install
```

## Run application

``` 
mvn spring-boot:run
```

## Test Application

```  
curl --location --request GET 'localhost:8080/add?a=12&b=6'

curl --location --request POST 'localhost:8080/sub?a=12&b=6'

curl --location --request PUT 'localhost:8080/multi?a=12&b=6'

curl --location --request DELETE 'localhost:8080/div?a=12&b=6'
```

