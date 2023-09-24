# Design-Pattern-Lab-Work
In this repository, I will be sharing all of my  design patterns lab work using Java. Please feel free to explore my projects, code implementations, and design pattern examples. Your feedback and contributions are always welcome!

**LAB Assignments Document Files**
This folder contains all Lab Assignments Word documents and theoretical solutions to the questions.

**LAB-1 Part-1**
**Assignment Title: Lab-1 Part-1 Understanding OOP Concepts with Code Examples**
In Lab-1 part-1, I have organized the code into separate packages, each dedicated to illustrating a specific Object-Oriented Programming (OOP) concept. These packages are designed to provide a clear and explicit understanding of various OOP concepts, such as encapsulation, inheritance, polymorphism, and more. Each package contains code implementations that exemplify the respective concept.

**Packages Overview**

**Package Name: EncapsulationConcepts**
Description: This package focuses on the encapsulation concept in OOP. It includes code examples that demonstrate how encapsulation helps in data hiding and controlling access to class members.
**Package Name: InheritanceConcepts**
Description: In this package, you will find code that explores the inheritance concept in OOP. It showcases how classes can inherit properties and behaviors from other classes, promoting code reusability.
**Package Name: PolymorphismConcepts**
Description: The polymorphism package delves into the polymorphic behavior of objects in OOP. It illustrates how objects of different classes can respond to the same method differently.
**Package Name: AbstractionConcepts**
Description: Abstraction is a fundamental OOP concept. This package contains code that emphasizes the abstraction concept by simplifying complex systems into manageable components.
**Package Name: InterfaceConcepts**
Description: The InterfaceConcepts package explores the role of interfaces in OOP, promoting code consistency and flexibility.

**LAB-1 Part-2**
**Assignment Title: Lab-2 Exploring Java Advance Concepts**
The answers and implementation to the following questions:
1.	Overloading of the main method is possible or not?
2.	Can we create a program without the main method? How many main methods are allowed in Java Programs?
3.	What are the six ways to use this keyword?
4.	Prove that multiple inheritance is not supported in Java.
5.	How to override the static method?

**Assignment Title: Lab-2 part-1 Singleton Pattern Lab Work**
I have done Examples and Lab Tasks of Lab-2 part-1.
To make the given example of SingeltonFA20Homework thread-safe, we can synchronize the getInstance() method. 
This will ensure that only one thread can access the instance of the Configuration class at a time.
**Task Package**
The modified version of the Configuration class with the getInstance() method synchronized is done in the Task Package.

**Assignment Title: Lab-2 part-2 Observer Pattern Lab Work**
In this lab, I will implement all examples of the observer pattern that were mentioned in the lab tasks.
**Question-1 Task:**
In the first example, I have completed my lab task. Here are the steps I followed:
To convert the anonymous concrete observer into a proper concrete observer class, follow these steps:
•	Create a new class that implements the Observer interface.
•	Override the update method in the new class to specify how it should react to updates.
•	Instantiate the new observer class and add it to the EventSource
**Question-2 Task:**
To add the detach(Observer o) method to the Subject class and modify the pattern so that only active observers are notified, I can make the following changes:
1. Add the detach(Observer o) method to the Subject class to remove an observer from the list of observers.
2. Modify the notifyAllObservers() method to check if each observer is active before notifying it.


**Usage:**
Each package within this repository contains its own set of code examples and explanations. You can explore these packages individually to gain a deeper understanding of the respective  concepts.

**Feedback**
Your feedback is valuable in further enhancing this repository's educational value. If you encounter any issues, have questions, or would like to suggest improvements, please feel free to open an issue or reach out via email.

