-Day03:

-Repository:
    .Responsible for talking to the database
    .Eg: public interface UserRepository extends JpaRepository<User, Long> {  }
    .Creating an object does not automatically store it in the database it is stored only when we say .save()
    
-ORM(Object Relational Mapping):
    .It is just a concept that means the conversion between Java object with relational database table automatically both ways

-Hibernate:
    .Java ORM framework

-JPA(Java Persistence API):
    .Actually for all the methods like .save() inside interface JpaRepository there are no implementation it just has declaration... Spring JPA implements it at run time by creating a class that implements say the UserRepository that implements the JpaRepository and then implements methods inside this class all behind the scens (i.e Spring creates the implementation at run time)
    .It is a specification
    .JPA = Rules and Hibernate= Implementation
    .JpaRepository extends CrudRepository and provides additional JPA-specific features such as pagination, batch operations, flushing, and a List return type for findAll() unlike CrudRepository an iterable, making it more convenient for most Spring Boot applications.
    .Custom methods:Spring data Jpa can create queries from method names
    public interface UserRepository extends JpaRepository<User, Long> --only wrapper class
        { User findByName(String name); }

-@Entity:
    .A java class that represents a database table
    .@Id to set a variable as the primary key for the database table
    .@Generated Value(strategy=GenerationType.
            AUTO - let hibernate decide how to do it
            IDENTITY - id bigint incremented used in mysql
            SEQUENCE - used in postrgress sql oracle
            TABLE - stores a separate table for id )

-Entity Relationship:
    .OneToOne
    .OneToMany
    .ManyToOne
    .ManyToMany- database cannot directly store this unlike others so JPA creates a third table

-JDBC(Java Database Connectivity):
    .Standard java API for connecting with database
    .Connection:
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/springbootdb","root","HelloWorld@2007");
    .Statement & Prepared statement
        .Statement:
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("SELECT * from Topic WHERE name='" + name + "'" );
        .Prepared Statement:
            PreparedStatement ps=con.prepareStatement("SELECT * from Topic WHERE name=?);
            ps.setString(5,"Thala");
        -executeQuery() used when sql returns rows
        -resultSet() contains returned rows
    .After use close every jdbc resource like rs.close(),ps.close() or in modern java we put them in a try block so it closes automatically
-Deployment:
    mvn clean package // mvn clean install
    java -jar target/the jar name
    .Spring Acutator:
        Production ready features to help you monitor and manage your application
        you can do the port on which it is running with /health and you will get a json output similar to this there are many endpoints created because of this spring actuator
-Additional points:
    .Always declare the model class as public
