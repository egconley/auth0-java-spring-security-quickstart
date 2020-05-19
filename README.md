# Auth0 Java Spring Security Quickstart
Implementation of [Auth0 Java Spring Security Quickstart Tutorial](https://auth0.com/docs/quickstart/webapp/java-spring-security-mvc)

## Built With
- [Auth0](https://auth0.com/)
- [Java](https://www.java.com/en/)
- [Spring Security](https://www.java.com/en/)

## Getting Up and Running
1. Clone this repo down to your local machine.
2. Open the project in IntelliJ.
3. From the **Run** dropdown menu, select **Edit Configurations...**.  Under **Environment Variables**, add 2 variables: `CLIENT_ID` and `CLIENT_SECRET` with the values from **Settings** page of the corresponding Auth0 application for the app in your Auth0 account.
4. Navigate to [src/main/java/com/egconley/Java/Spring/Security/Quickstart](./src/main/java/com/egconley/Java/Spring/Security/Quickstart/JavaSpringSecurityQuickstartApplication.java) and press the green button on line 13 to build and run the project.
5. Navigate to http://localhost:3000/ in your browser.
    - Login: http://localhost:3000/login
    - User Profile: http://localhost:3000/login
    - Logout: http://localhost:3000/logout

## Notes
- I initialized the project with the [Spring Initializr](https://start.spring.io/) and then copied over the code in src from the  All of the code in src was copied over from [Auth0 Integration Samples for Java Spring Security MVC](https://github.com/auth0-samples/auth0-spring-security-mvc-sample).  As such, the build.gradle file is similar, but not exactly the same as the tutorial.
- The version of Spring Boot that I used wasn't recognizing the `org.springframework.boot.autoconfigure.web.ErrorController` interface used in the [Auth0 Integration Samples for Java Spring Security MVC](https://github.com/auth0-samples/auth0-spring-security-mvc-sample) `ErrorController` class, so my `Error Controller` class implements the `org.springframework.boot.web.servlet.error.ErrorController` interface.

## Screenshot
![](screenshot.png)
