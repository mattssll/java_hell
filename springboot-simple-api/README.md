#Java Springboot (JPA -DB- and Hybernate -ORM-)

## Application Arquitecture
![ScreenShot](/springboot-simple-api/img/architecture.png)

## Available APIs:
http://localhost:8080/api/v1/student GET <br>
http://localhost:8080/api/v1/student POST - Takes name, email, date of birth <br>
http://localhost:8080/api/v1/student/1 DELETE - Takes id <br>
http://localhost:8080/api/v1/student/1?name=MariaNow PUT <br>

## Some details
ps: We're using a local postgresql as our database
### SQL Commands to be executed in psql cli:
```
CREATE DATABASE student;
CREATE user springadmin;
GRANT ALL PRIVILEGES ON DATABASE "student" to springadmin;
GRANT ALL PRIVILEGES ON DATABASE "student" to postgres;
```

### Running the App
To run the java app you can use the maven helper at the right in intellij and use the "install" button, this will create a .jar <br>
To build and run our jar (make sure you have the "maven" cli installed first):
```
mvn install
cd target/
java -jar demo-0.0.1-SNAPSHOT.jar
```

