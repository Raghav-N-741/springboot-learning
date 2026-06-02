-day01:
 .spring framework:
    .What it mainly does:
        -Object management,dependency management,boilerplate reduction,easier database integration
    -Application framework
    -Dependency Injection:
       Instead of creating dependencies yourself, they are injected from outside by spring container/IOC Container
    -Bean: An object created and managed by spring
    -Core concepts:
        @Component- Create and manage this object
        @Service- special version of Component used for business logic
        @Repository - used for database layer
        @Controller- used in web applications handles requests
        @Autowired - used for dependency injections

 .springboot
    built of top of spring framework but much easier and faster to work
    Core concepts:
        -Auto configuration
        -Embedded servers
        -Production ready - includes monitroing,metrics,health checks,logging
        -Starter dependencies : spring-boot-starter-web
    It is standalone and production ready
 .api: a way for a software program to communicate
 .REST- Representational State transfer is an architectural style for designing an API
 .Maven : is an build automation and dependency management tool for Java
 .POM(Project Object Model) : Project Configuration File,everything maven needs is here pom.xml
 .jar-(java archive) kind of a zip file for Java
 .Fat jar or uber jar contains: code + spring libraries + other dependencies + tomcat server
 .Application Context: 
    also commonly used with terms IOC,spring container
    it does:
        -Creating beans, managing their lifecycle, storing them,provide beans when needed
        -Dependency injection

.Creating a Spring boot project:
    1 You can just create a maven project and then in its pom.xml you can add the following to make this project a child project and declare the spring-boot.starter-parent as the  parent project 
    <parent>
        <groupId> org.springframework.boot </groupId>
        <artifactId>spring-boot-starter-parent </artifactId>
        <version> 1.4.2.RELEASE </version>
    </parent> 
    2 and then for making it as a web project add the following meta dependency which wraps all the required web dependencis:
    <dependency> 
        <groupId>org.springframework.boot </groupId>
        <artifactId> spring-boot-starter-web </artifactId?>
    </dependency>
    3  inside src/java/main create a java file that contains a class with a main method and the annotation @SpringBootApplication inside which it has SpringApplication.run(classname.class,args);
    4.cmd: mvn spring-boot:run 

.Starting Spring Boot:
    -Starts up default configuration
    -Starts Spring application context
    -Performs class path scan ----- Component scanning
    -Starts Tomcat server

.Spring MVC(Model View Controller)
    -Spring MVC is the framework that handles the entire HTTP request-response cycle.
    -whenever a http request comes it goes to tomcat server-DispatchServlet(a part of Spring MVC)--Correct Controller then business logic and then the result is converted by spring mvc as json(by HttpMessageConvertor) for returning to the web only if it is @RestController not for @Controller then it considers the response as .html

Additional points
-If you want a particular version of something then you mention it in the properties inside pom.xml:
 <properties> 
 <java.version>1.8</java.version> </properties>
-Inside a RestController in whatever mapping whatever you return will be converted to json automatically by spring mvc and sent back as the HTTP response

