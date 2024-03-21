# RemitlyTask

Summer Internship Remitly Task

The task involves implementing a method to validate input JSON data conforming to the AWS IAM Role Policy format, particularly focusing on the Resource field. The method reads the input JSON, check if the Resource field contains a single asterisk, and return false in that case; otherwise, it returns true. This validation ensures that the input JSON adheres to expected criteria for AWS IAM Role policies.

Unit tests were created to cover possible edge cases and check if method returns correct values or throw exception if needed.

## Requirements
- JDK 17
- Apache Maven 4.0.0

## Installation

Clone this repository to your local machine using the following command:

```bash
git clone https://github.com/Zolzolekkk/RemitlyTask.git
```

Navigate to the project directory:

```bash
cd your-repository
```

## Compile the Project

Run the following command to compile the project using Maven:

```bash
mvn compile
```

## Running the Application

Once the project is successfully compiled, you can run the application using the following command:

```bash
mvn exec:java -Dexec.mainClass="org.example.Main"
```

## Testing

To execute the tests, run the following command:

```bash
mvn test
```

## Note

If you use an IDE that supports Maven (e.g. IntelliJ IDEA), you can easily compile, run and test the application.
