# java-and-maven

Make a new project using mvn with the command 

```bash
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

Make changes to the groupID and artifcatID

Then once build succeeds, cd to the new directory and run

```bash
mvn package
```

That should compile the project, error encountered might be regarding mvn-compiler version.

After that you can run the jar with the command

```bash
java -cp target/hello-world-1.0-SNAPSHOT.jar com.ar21anmolarora.app.App
```

Was unable to figure out how to make the 

```bash
java -jar target/hello-world-1.0-SNAPSHOT.jar
```

command work (?) Something about App.java file I guess!

! Works now had to add 

```xml

<configuration> 
          <archive> 
            <manifest>  
              <addClasspath>true</addClasspath> 
              <mainClass>com.ar21anmolarora.app.App</mainClass> 
            </manifest> 
          </archive>  
        </configuration>

```

As a plugin to pom.xml and recompile
