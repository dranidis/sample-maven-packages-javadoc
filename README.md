# my-project

## Created by
```
mvn archetype:generate -DgroupId=com.example -DartifactId=my-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

```
## Compile
```
mvn compile
```

## Create jar
```
mvn package
```

## Run tests
```
mvn test
```

## Execute
```
java -cp target/my-project-1.0-SNAPSHOT.jar com.example.App
```

## Generate Javadoc
```
mvn javadoc:javadoc 
```
Site is generated in folder `target/site`. Open in the browser the file `index.html`.

## Clean (rm target directory)
```
mvn clean
```