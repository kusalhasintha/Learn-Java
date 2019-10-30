# Basic Syntax of Java

When we consider a Java program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods, and instance variables mean.

* <b>Object</b> - Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.
* <b>Class</b> - A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.
* <b>Methods</b> - A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.
* <b>Instance Variables</b> - Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.

## Hello World Program
The <b>HelloWorld.java</b> program contains simple code that prints the words <b>Hello World</b>

Let's look at how to compile and run the program. In order to do so, please follow the following subsequent steps.
1. Open a command prompt window and go to the directory where you saved the class. Assume it's C:\\.
2. Type 'javac HelloWorld.java' and press enter to compile your code. If there are no errors in your code, the command prompt will take you to the next line (Assumption : The path variable is set).
3. Now, type ' java MyFirstJavaProgram ' to run your program.
4. You will be able to see ' Hello World ' printed on the window.

### Output
```shell
C:\> javac MyFirstJavaProgram.java
C:\> java MyFirstJavaProgram 
Hello World
```

### Basic Syntax
* <b>Case Sensitivity</b> - Java is case sensitive, which means identifier Hello and hello would have different meaning in Java.
* <b>Class Names</b> - For all class names the first letter should be in Upper Case. If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.
<br><b>Example:</b> class RandomJavaClass
* <b>Method Names</b> - All method names should start with a Lower Case letter. If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.
<br><b>Example:</b> public void myMethodName()
* <b>Program File Name</b> - Name of the program file should exactly match the class name.
<br><b>Example:</b> Assume 'MyFirstJavaProgram' is the class name. Then the file should be saved as 'MyFirstJavaProgram.java'
* <b>public static void main(String args[])/b> - Java program processing starts from the main() method which is a mandatory part of every Java program.
  
### Java Identifiers
All Java components require names. Names used for classes, variables, and methods are called identifiers.

In Java, there are several points to remember about identifiers. They are as follows −

* All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).

* After the first character, identifiers can have any combination of characters.

* A key word cannot be used as an identifier.

* Most importantly, identifiers are case sensitive.

* Examples of legal identifiers: age, $salary, _value, __1_value.

* Examples of illegal identifiers: 123abc, -salary.

Source: [tutorialspoint](https://www.tutorialspoint.com/java/java_basic_syntax.htm)2
