# Homework Aloha World Report

The following report contains questions you need to answer as part of your submission for the homework assignment. 


## Design Doc
Please link your UML design file here. See resources in the assignment on how to
link an image in markdown. You may also use [mermaid] class diagrams if you prefer, if so, include the mermaid code here.  You DO NOT have to include Greeting.java as part of the diagram, just the AlohaWorld application that includes: [AlohaWorld.java], [Greeter.java], and [ConsoleView.java].

![UML.png](../UMLimages/UML.png)

### Program Flow
Write a short paragraph detailing the flow of the program in your own words. This is to help you understand / trace the code (and give you practice of something called a code walk that will be required in this course).

This program has three classes: ConsoleView is responsible for collecting user input (name and preferred greeting location), Greeter is responsible for generating corresponding greetings based on different locations, and AlohaWorld is responsible for starting the program. When AlohaWorld.main is executed, the user input is first obtained through ConsoleView, and then the data is used to create a Greeter object to generate a greeting. After that, it will enter a loop and ask the user if he wants to greet again. If so, the location will be updated and the greeting will be repeated until the user chooses to end.

## Assignment Questions

1. List three additional java syntax items you didn't know when reading the code.  (make sure to use * for the list items, see example below, the backtick marks are used to write code inline with markdown)
   
   * (example) `final class`
   * `List.copyOf()`
   * `@Override`
   * `instanceof`
   

2. For each syntax additional item listed above, explain what it does in your own words and then link a resource where you figured out what it does in the references section. 

    * (example) The `final` keyword when used on a class prevents the class from being subclassed. This means that the class cannot be extended by another class. This is useful when you want to prevent a class from being modified or extended[^1] . It is often the standard to do this when a class only contains static methods such as driver or utility classes. Math in Java is an example of a final class[^2] .
    * The `List.copyOf()` keyword creates an unmodifiable copy of a collection to protect the original data from being changed. (https://www.javaguides.net/2023/09/java-list-copyof.html)
    * The `@Override` keyword tells the compiler that this method is to override the parent class method. If you mark @Override but the method name or parameters are incorrect, the compiler will report an error to avoid accidentally creating a new method. (https://www.geeksforgeeks.org/the-override-annotation-in-java/)
    * The `instanceof` keyword is like asking "Is this object an instance of a certain class?" and returns true or false. (https://www.baeldung.com/java-instanceof)


3. What does `main` do in Java? 

* In Java, the `main` method is the entry point of a Java application. Therefore, when the program runs, the first method executed is the `main` method. The name of the method must be main, and it must have the public static void modifier. It also accepts a `String[] args` parameter.

4. What does `toString()` do in Java? Why should any object class you create have a `toString()` method?


* `toString()` turns objects into understandable text. It is important because if we don't modify `toString()` and only use `System.out.print()`, when we print an object, only the class name and memory address will be shown, so we can't see the actual content. If we override `toString()`, we can view the content more clearly.
    

5. What is javadoc style commenting? What is it used for? 
  
   
* Javadoc starts with /**, uses * on each line, and ends with */. Usually we use some tags such as @return in the annotation to help explain. The purpose of annotations is to help myself and other people who read the code understand the function and purpose of a piece of code I wrote. 


6. Describe Test Driving Development (TDD) in your own words. 


* Test Driving Development is a development approach in which tests are written before the code. Tests are created based on the requirements of the program's functionality. Initially, the tests will fail, prompting the development of code to meet the test requirements and make the tests pass. Afterward, the code is gradually optimized. This process is repeated for other functionalities by writing tests first and then implementing the corresponding code.  


7. Go to the [Markdown Playground](MarkdownPlayground.md) and add at least 3 different markdown elements you learned about by reading the markdown resources listed in the document. Additionally you need to add a mermaid class diagram (of your choice does not have to follow the assignment. However, if you did use mermaid for the assignment, you can just copy that there). Add the elements into the markdown file, so that the formatting changes are reserved to that file. 


## Deeper Thinking Questions

These questions require deeper thinking of the topic. We don't expect 100% correct answers, but we encourage you to think deeply and come up with a reasonable answer. 


1. Why would we want to keep interaction with the client contained to ConsoleView?

* I think it's probably because each class focuses on its own responsibility. The `ConsoleView` is responsible for interacting with the client, and it passes the information to the `Greeter` class. By having these classes focus on their own tasks, the code becomes clearer. Also, this approach is more flexible, for example, if we need to modify one class, we can do so without affecting the other parts of the program. 

2. Right now, the application isn't very dynamic in that it can be difficult to add new languages and greetings without modifying the code every time. Just thinking programmatically,  how could you make the application more dynamic? You are free to reference Geeting.java and how that could be used in your design.

* I think it might be possible to design classes for handling greetings in different languages, which would define a structure or rule for generating greetings. By creating different implementations for each language, such as EnglishGreeting for English and ChineseGreeting for Chinese, you can avoid modifying the existing code. The Greeter and ConsoleView classes no longer need to manage language specific logic. Instead, you can just add new greeting classes and inject them into Greeter, making the program more flexible and easier to extend. 



> [!IMPORTANT]
>  After you upload the files to your github (ideally you have been committing throughout this progress / after you answer every question) - make sure to look at your completed assignment on github/in the browser! You can make sure images are showing up/formatting is correct, etc. The TAs will actually look at your assignment on github, so it is important that it is formatted correctly.


## References

[^1]: Final keyword in Java: 2024. https://www.geeksforgeeks.org/final-keyword-in-java/. Accessed: 2024-03-30. 

[^2]: Math (Java Platform SE 17). https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html. Accessed: 2024-03-30.


<!-- This is a comment, below this link the links in the document are placed here to make ti easier to read. This is an optional style for markdown, and often as a student you will include the links inline. for example [mermaid](https://mermaid.js.org/intro/syntax-reference.html) -->
[mermaid]: https://mermaid.js.org/intro/syntax-reference.html
[AlohaWorld.java]: src/main/java/student/AlohaWorld.java
[Greeter.java]: src/main/java/student/Greeter.java
[ConsoleView.java]: src/main/java/student/ConsoleView.java