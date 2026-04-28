# Java Calculator (Eclipse Project)

A small example Java project set up as a native Eclipse project (no Maven/Gradle).

## Project Structure

```
java-calculator/
├── .project                                # Eclipse project descriptor
├── .classpath                              # Eclipse classpath (src, test, JRE, JUnit 5)
├── .settings/
│   └── org.eclipse.jdt.core.prefs          # Java 17 compiler settings
├── .gitignore
├── README.md
├── src/                                    # Main source folder
│   └── com/example/calculator/
│       ├── Calculator.java
│       └── Main.java
└── test/                                   # Test source folder
    └── com/example/calculator/
        └── CalculatorTest.java
```

## Requirements

- Eclipse IDE for Java Developers (2022-09 or newer recommended)
- JDK 17 or higher installed and registered in Eclipse

## Importing into Eclipse

1. Open Eclipse.
2. Go to **File → Import...**
3. Choose **General → Existing Projects into Workspace**, then click **Next**.
4. Click **Browse...** next to "Select root directory" and pick the `java-calculator` folder.
5. Make sure `java-calculator` is checked in the projects list, then click **Finish**.

The project will appear in the Package Explorer with `src` and `test` shown as source folders.

## Running the Application

In Package Explorer, right-click `Main.java` (under `src/com/example/calculator/`) and choose **Run As → Java Application**. Enter two numbers when prompted in the Console view.

## Running the Tests

Right-click `CalculatorTest.java` (under `test/com/example/calculator/`) and choose **Run As → JUnit Test**. Results appear in the JUnit view.

## Troubleshooting

- **"JRE_CONTAINER" error or red X on the project**: Go to **Window → Preferences → Java → Installed JREs** and make sure a JDK 17+ is installed and selected. Then right-click the project → **Build Path → Configure Build Path → Libraries**, select the JRE entry and click **Edit** to point at the right one.
- **JUnit not found**: The project uses Eclipse's built-in JUnit 5 container. If it's missing, right-click the project → **Build Path → Add Libraries → JUnit → JUnit 5**.

## License

MIT
