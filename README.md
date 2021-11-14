Expense tracker API
--------------------


Technology used

* java 8
* Spring Boot 
* JPA
* Tomcat
* MySQL Database

Steps to run

Method 1 : Using Prebuild jar

* Setup MySQL DB by running SQL Scripts present in "DB Scrips" folder
* Clone repo and go to the "Build" folder
* Go to application.properties availiable in resoures and change DB url, username and password accordingly.
* Open Command Prompt and change directory to Build directory bu using cd command.
* run command "java -jar expensetracker-0.0.1-SNAPSHOT.jar" and application will start running.
* Load the Expense-tracker-collection present in "Postman-Collection" folder in Postman.
* Explore url endpoints provided in the collection.


Method 2 : By opening as a maven project

* Setup MySQL DB by running SQL Scripts present in "DB Scrips" folder
* Clone the repo and open as a maven project in eclipse
* Go to application.properties availiable in resoures and change DB url, username and password accordingly.
* Do a maven update and run as Spring-boot-application.
* Load the Expense-tracker-collection present in "Postman-Collection" folder in Postman.
* Explore url endpoints provided in the collection.