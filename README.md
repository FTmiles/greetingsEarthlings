## Small Talk app, submit your greetings

changed root directory of the app<br>
server.servlet.context-path=/myapp<br>

localhost:8080/myapp/
--
MySQL database name - greetings

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


==================================
### unrelated, about forms and pets
http://localhost:8080/myapp/petName
