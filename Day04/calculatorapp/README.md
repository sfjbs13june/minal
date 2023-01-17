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
curl --location --request GET 'localhost:8081/add?a=4.0&b=4.0'

curl --location --request GET 'localhost:8081/sub?a=4.0&b=4.0'

curl --location --request GET 'localhost:8081/multi?a=4.0&b=4.0'

curl --location --request GET 'localhost:8081/div?a=4.0&b=4.0'
```

