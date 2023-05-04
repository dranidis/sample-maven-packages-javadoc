# my-project

## Created by
```
mvn archetype:generate -DgroupId=com.example -DartifactId=my-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

It might be necessary to add the following section in the pom.xml file inside the `<project>`:
```
  <properties>
    <maven.compiler.source>1.6</maven.compiler.source>
    <maven.compiler.target>1.6</maven.compiler.target>
  </properties>
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
The pom.xml file needs an additional section inside the `<project>`:
```
  <build>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-javadoc-plugin</artifactId>
        <version>3.5.0</version>
        <configuration>
          <show>private</show>
        </configuration>
      </plugin>
    </plugins>
  </build>
```

```
mvn javadoc:javadoc 
```
Site is generated in folder `target/site`. Open in the browser the file `index.html`.

## Clean (rm target directory)
```
mvn clean
```