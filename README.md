# CalculatorProject

Made by: Max Lucio Martins de Assis

Calculator made in Java, the goal is to make a calculator with graphical interface till the final version.

## Things to Know

Now the calculator executes the four basic operations and power, it doesn't have the graphical interface and it's executed in the terminal.

To edit the Class Diagram, utilize Software Ideas Modeler.

## Compilation and Execution

1 - In the root folder of the project, type the following in your terminal:

~~~~
javac -d bin src/calculus/*.java
~~~~

2 - Next, to execute it type the following:

~~~
java -cp bin calculus.StartProgram
~~~

3 - To generate the JavaDoc type the following:

~~~
javadoc -d doc src/calculus/*.java
~~~

**Alternatively you can import this program on your IDE to execute it.**

Current Version: 1.2

## Changelog

**Version 1.2 (14/12/2019) [FORMAT (DD/MM/YY)]**

-> The program is in english as well as the comments.

**Version 1.1.3 (06/10/2019) [FORMAT (DD/MM/YY)]**

-> Changes in the file structure, now with a bin folder presents, as well as a calculus folder that stores the source-code inside the src folder.

-> Removal of the EclipseBranch.

**Version 1.1.2 (05/10/2019) [FORMAT (DD/MM/YY)]**

-> Modification to the version made in the Eclipse IDE so it could stay in a secondary branch.

-> Free version to run in terminals created.

-> Accentuation removed from the comments to prevent problemas with the comments.

**Version 1.1.1 (28/09/2019) [FORMAT (DD/MM/YY)]**

-> Class Power addedm responsible for the execution of power operations; because of that, there was slight changes in MainMenu.java and ProgramExecution.java code to accomodate the new mathematic operation.

**Version 1.1 (28/09/2019) [FORMAT (DD/MM/YY)]**

-> Modification of the functions that execute the 4 operations, changes were mande on ProgramExecution.java.

**Version 1.0 (27/09/2019) [FORMAT (DD/MM/YY)]** 

-> Program creation, with sum, subtraction, multiplication and division operations.