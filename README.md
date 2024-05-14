# Javafx app using Maven build outil

---
## Construct the Application
[x] Create a maven quickstart   
[x] Adding javafx dependency
- add in dependencies tag of pom.xml
```
     <dependency>
          <groupId>org.openjfx</groupId>
          <artifactId>javafx-controls</artifactId>
          <version>2.0.1</version>
     </dependency>
```
- add in plugins tag of pom.xml
```
      <plugin>
        <groupId>org.openjfx</groupId>
        <artifactId>javafx-maven-plugin</artifactId>
        <version>0.0.8</version>
        <configuration>
          <mainClass>com.softwify.HelloWorld</mainClass>
        </configuration>
      </plugin>
```
[x] Implement the main java class   
[x] [In the command line run](#run-app) : mvn javafx:run
> [!NOTE]  
> Make sure Maven is installed on your machine to use the mvn command

 ### Main JavaFX Scene Graph

![avaFX Scene Graph](https://docs.oracle.com/javafx/2/scenegraph/img/figure1.png)

1. Hello World Scene Graph

This is the current project javafx app structure
![Hello World Scene Graph](https://docs.oracle.com/javafx/2/get_started/img/helloworld_scenegraph.png)
# Running application process
## Run app 
First of all run the project with the command line in your terminal
```mvn javafx:run```
1. In the Projects window, right-click the HelloWorld project node and choose Run.
2. Click the Say Hello World button.
3. Verify that the text “Hello World!” is printed to the NetBeans output window.

![Hello World Scene Graph](https://docs.oracle.com/javafx/2/get_started/img/helloworld.png)
