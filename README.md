# Auth0 Java Spring Security Quickstart
[tutorial link](https://auth0.com/docs/quickstart/webapp/java-spring-security-mvc)

## Built With
- [Auth0](https://auth0.com/)
- [Java](https://www.java.com/en/)
- [Spring Security](https://www.java.com/en/)

## Notes
I initialized the project with the [Spring Initializr](https://start.spring.io/) and then copied over the code in src from the  All of the code in src was copied over from [Auth0 Integration Samples for Java Spring Security MVC](https://github.com/auth0-samples/auth0-spring-security-mvc-sample).  As such, the build.gradle file is similar, but not exactly the same as the tutorial.

## Getting Up and Running
1. Clone this repo down to your local machine.
2. Open the project in IntelliJ.
3. Navigate to src/main/resources/auth0.properties and replace `xxxxx` on lines 2 and 3 with the *Auth0 client id* and *client secret* for your app.
4. Navigate to src/main/java/com/egconley/Java/Spring/Security/Quickstart and press the green button on line 13 to build and run the project.
5. Navigate to http://localhost:3000/ in your browser.
    - Login: http://localhost:3000/login
    - User Profile: http://localhost:3000/login
    - Logout: http://localhost:3000/logout
