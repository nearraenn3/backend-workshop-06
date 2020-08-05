## Step
* gradlew (checking)
* gradlew test (checking)
* gradlew bootRun (start test and u can check it on localhost:8080)
* set java_home=<path> (install or set jdk)

## Run in production
* gradlew bootJar สร้าง Jar file
* java -jar build\libs\demo 

## Open URL
* localhost:8080 for checking in a web browser

##Why Spring-boot?
* Application skeleton generator
* Redue effort to add new tech.
* website: https://spring.io/projects/spring-boot
* Spring Boot Reference Documentation: https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/html/
    * Getting Started
    * Using Spring Boot
    * Spring Boot Features

## Note
### Deployment
* EAR, E => Enterprise (Biggest)
    * WAR, W => Web (Bigger)
        * JAR, J => Java (Big)
* Create a deployable war file
    * website available on: https://docs.spring.io/spring-boot/docs/2.3.2.RELEASE/reference/html/howto.html#howto-traditional-deployment
    * How to guide -> Traditional deployment
* JSON
    * http://localhost:8080/users 
    GET /users
    Response code = 200
    <!-- array -->
    [
        <!-- object -->
        {
            "id": 1,
            "name": "User 1"
        }
        {
            "id": 2,
            "name": "User 2"
        }
    ]
* Pathvariable
    * "users/{id}" ตรง id คือ Path variable
    ```js
    @GetMapping("/users/{id}")
    public UsersResponse getUserById(@PathVariable int id) {
        return new UsersResponse(id, "User " + id);
    }
    ```
## Note
* Autowired => 