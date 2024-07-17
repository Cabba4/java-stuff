# Starter project for the Adapter Design pattern

Contains essentially empty Java Maven project skeleton with basic Junit5 example. 
Can be used as starter for adapter design pattern exercise.
 
## Running the code

The "main" main() function is in App.java.

## CLI - Building and running the code

````
git clone ...URL...
cd ...THE-DIR...

mvn clean
mvn package # ... or: mvn install

echo "Run the main() in App.java (defined in the manifest file of the jar)
java -jar target/*.jar
 
echo "Run the main() in some other file
java -cp target/*.jar org.hfdp.tla...
````

## Unit tests

Unit test basic example with Junit5.
Normal maven build will run the tests. To run only tests without building:
````
mvn test
````
Building without running the tests:
````
mvn package -DskipTests=true
````

# References
## Book
* https://learning.oreilly.com/library/view/head-first-design/9781492077992
* https://andor.tuni.fi/permalink/358FIN_TAMPO/1j3mh4m/alma9911189474705973 
* https://javabydeveloper.com/junit-5-maven-example/
