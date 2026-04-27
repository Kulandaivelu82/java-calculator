# Java Calculator

A small example Java project demonstrating a simple calculator with unit tests using Maven and JUnit 5.

## Project Structure

```
java-calculator/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/java/com/example/calculator/
    │   ├── Calculator.java
    │   └── Main.java
    └── test/java/com/example/calculator/
        └── CalculatorTest.java
```

## Requirements

- Java 17 or higher
- Maven 3.6+

## Build and Run

Compile the project:
```bash
mvn compile
```

Run the tests:
```bash
mvn test
```

Package into a JAR:
```bash
mvn package
```

Run the calculator:
```bash
mvn exec:java -Dexec.mainClass="com.example.calculator.Main"
```

Or after packaging:
```bash
java -cp target/classes com.example.calculator.Main
```

## License

MIT
