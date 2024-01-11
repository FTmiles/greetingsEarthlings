changed root directory of the app
server.servlet.context-path=/myapp

localhost:8080/myapp/

=========================================

Browser version with Thymeleaf 
Controller file - htmlController.java

* Add new greeting  http://localhost:8080/myapp/greeting 
* See all greetings in DB   http://localhost:8080/myapp/allGreetings

=======================================

PostMan version with JSON, @RestController

Controller file - HomeController.java

* Get JSON of all greetings, method GET, localhost:8080/myapp/jsonGetAll
* Add new greeting with POST JSON <br>
    * url: localhost:8080/myapp/addGreets<br>
    * JSON example: { "content":"Hello Dear Leader" }
