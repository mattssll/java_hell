# Before everything
Make sure you have the mvn cli installed,
<br>
Then: <br>
mvn package 
<br>
The above command will generate a .jar of your app in the target folder, this will be used by the Dockerfile.

## To build the docker image:
<i>docker build -t bootdocker:1 . </i>

## To run the application in a container
docker run -d --name bootdocker -p 8080:8080 bootdocker:1

## Available endpoint
/greeting > "Hello, World!"
/greeting?name=Ed > "Hello, Ed!"