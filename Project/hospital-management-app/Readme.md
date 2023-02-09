## Create Spring-boot application:

```
https://start.spring.io/
```

## Build the application:

```
mvn clean install
```

## Run the application:

```
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down
```

## DoctorController

# Post:

localhost:8080/doctor/savedocappointment

```
curl --location --request POST 'localhost:8080/doctor/savedocappointment' \
--header 'Authorization: Basic bmFtZTEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C17745259D9DC4142AFF03A01DC5FD79' \
--data-raw '{
    "appointmentId":"1",
    "patientName":"Riya",
    "doctorName":"DrBhati",
    "date":"12Feb2023",
    "prescription":{
        "prescriptionId":"pre1",
        "appointmentId":"1",
        "description":"Symptoms of Fever",
        "patientName":"Riya",
        "doctorName":"DrBhati"
    }
}'
```

# GET:

localhost:8080/doctor/doctorappointment?doctorName=DrBhati
```
curl --l
ocation --request GET 'localhost:8080/doctor/doctorappointment?doctorName=DrBhati' \
--header 'Cookie: JSESSIONID=C17745259D9DC4142AFF03A01DC5FD79'
```

# PatientController:

# Post:

localhost:8080/patient/saveappointment

```
curl --location --request POST 'localhost:8080/patient/saveappointment' \
--header 'Authorization: Basic bmFtZTEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C17745259D9DC4142AFF03A01DC5FD79' \
--data-raw '{
    "appointmentId": "2",
    "patientName": "Virat",
    "doctorName": "DrRathi",
    "date": "15May2022",
    "prescription": {
        "prescriptionId": "pre2",
        "appointmentId": "2",
        "description": "Symptoms of Covid",
        "patientName": "Virat",
        "doctorName": "DrRathi"
    }
}'
```

# GET:

localhost:8080/patient/myappointment?patientName=Virat

```
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=Virat' \
--header 'Authorization: Basic bmFtZTEyMzpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=C17745259D9DC4142AFF03A01DC5FD79' \
--data-raw ''
```

# PrescriptionController:

# POST:

http://localhost:8080/Prescription/saveprescription

```
curl --location --request POST 'http://localhost:8080/Prescription/saveprescription' \
--header 'Authorization: Basic bmFtZTEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=C17745259D9DC4142AFF03A01DC5FD79' \
--data-raw '{
    "appointmentId": "3",
    "patientName": "Riddhima",
    "doctorName": "DrDixit",
    "date": "18MAugust2022",
    "prescription": {
        "prescriptionId": "pre3",
        "appointmentId": "3",
        "description": "Symptoms of Diabetes",
        "patientName": "Riddhima",
        "doctorName": "DrDixit"
    }
}'
```

# GET:

http://localhost:8080/Prescription/viewprescription?patientName=Riddhima

```
curl --location --request GET 'http://localhost:8080/Prescription/viewprescription?patientName=Riddhima' \
--header 'Authorization: Basic bmFtZTEyMzpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=C17745259D9DC4142AFF03A01DC5FD79'
```

# security :

```
    .antMatchers(HttpMethod.GET, "/doctor/doctorappointment").hasAnyRole("USER")
    .antMatchers(HttpMethod.POST, "/doctor/savedocappointment").hasAnyRole("USER")
    .antMatchers(HttpMethod.GET, "/patient/myappointment").hasAnyRole("USER")
    .antMatchers(HttpMethod.POST, "/patient/saveappointment").hasAnyRole("USER")
    .antMatchers(HttpMethod.GET, "/Prescription/viewprescription").hasAnyRole("USER")
    .antMatchers(HttpMethod.POST, "/Prescription/saveprescription").hasAnyRole("USER")
    .and().csrf().disable().headers()
    .frameOptions().disable();
```

# show data:

```
docker exec -it spring-mongo-app-mongo-1 bash

mongo

show dbs

show tables

db.hospital-management-app.find()

```

# Swagger page:

```
http://localhost:8080/swagger-ui/index.html
```