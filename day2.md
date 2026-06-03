-Day2:
-Controller Layer:
    .Handles HTTP requests
    .@RestController= @Controller + @ResponseBody
        Controller return Json or text not Html pages
    .@RequestMapping-sets the base url
    .HTTP methods:
        GET- retrieves daa
        POST- creates data
        Put- updates entire object
        Patch- update part of the object
        Delete- Deletes object
    .path variable eg:   usually for a specific resource
        @GetMapping("/users/{id}")
        public String getUser(@PathVariable int id)        // (@PathVariable("id") int roll)
        {  return "User " + id; }
    .Request Parameters usually for filtering/searching/sorting/pagination 
     eg:url:/users?name=Raghav&age=19
        @GetMapping("/users")
        public String getUser( @RequestParam String name,@RequestParam int age)
        {return name;} 
    .RequestBody usually when sending whole object/data-contains the actual data being sent as json and spring converts this into a java object

-Service Layer:
    contains business logic-that is the actual rules and work of the application

-Dependency Injection:
    .Field injection:
        @Autowired
        private UserService userservice;
        Internally:
            UserController controller=new UserController();
            controller.service=userService;
    .Constructor injection:
        private UserService userSerivce;
        private UserController(UserService userService)
        {
            this.userService=userService;
        }
        Internally:
            UserController controller=new UserController(userService);

-application.properties:(or can use application.yml)
    Configuration file for the application
    Reading a custom property: @Value("${app.company}") private String company;   
    some of the properties eg:
        spring.application.name=demo_project
        server.port=8081
        spring.jpa.show-sql=true
     context path: server.servlet.context-path=/api   ---> spring adds this before to every endpoint
        Database configuration:
            spring.datasource.url=jdbc:mysql://localhost:3306/course_db
            spring.datasource.username=root
            spring.datasource.password=root
    when there are multiple properties file then:
        dev.properties
        pro.properties
        spring.profiles.active=dev
    say in app.properties server.port=8081 but for running we say java -jar app.jar --server.port=9090 then it runs on 9090 cause cmd line has more precedence


-Additional points:
.for mapping we can also write it as eg:
    @RequestMapping(method=RequestMethod.POST,value="/topics") //an enum
.BOM(bill of materials) a special maven POM that conntains a list of dependency versions
.if you want to send a json request then while sending a requst as a raw text file add a header as 
key:Content-Type value:application/json
.Model vs Entity: Model a java class containing data,Entity- model that maps to a database table
.Different ways to create a springboot project:
    -Create a maven project and then add parent and dependencies
    -Using Spring Initializer
    -Spring boot CLI 
    -using IDE like Spring Tool Suite(STS),VS code etc

