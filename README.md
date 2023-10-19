# Design-Pattern-Lab-Work
***

<p align="center">
🎉 Ultra-simplified explanation to design patterns! 🎉
</p>
<p align="center">
A topic that can easily make anyone's mind wobble. Here I try to make them stick in to your<br> mind (and maybe mine) by explaining them in the <i>simplest</i> way possible.
</p>

***
Introduction
=================

Design patterns are solutions to recurring problems; **guidelines on how to tackle certain problems**. They are not classes, packages or libraries that you can plug into your application and wait for the magic to happen. These are, rather, guidelines on how to tackle certain problems in certain situations.

> Design patterns are solutions to recurring problems; guidelines on how to tackle certain problems

Wikipedia describes them as

> In software engineering, a software design pattern is a general reusable solution to a commonly occurring problem within a given context in software design. It is not a finished design that can be transformed directly into source or machine code. It is a description or template for how to solve a problem that can be used in many different situations.

⚠️ Be Careful
-----------------
- Design patterns are not a silver bullet to all your problems.
- Do not try to force them; bad things are supposed to happen, if done so. 
- Keep in mind that design patterns are solutions **to** problems, not solutions **finding** problems; so don't overthink.
- If used in a correct place in a correct manner, they can prove to be a savior; or else they can result in a horrible mess of a code.

> Also note that the code are done in Java, however this shouldn't stop you because the concepts are same anyways.

<br>
 <b>Types of Design Patterns<b>

* [Creational](#creational-design-patterns)
* [Structural](#structural-design-patterns)
* [Behavioral](#behavioral-design-patterns)

|[Creational Design Patterns](#creational-design-patterns)|[Structural Design Patterns](#structural-design-patterns)|[Behavioral Design Patterns](#behavioral-design-patterns)|
|:-|:-|:-|
|[Simple Factory](#-simple-factory)|[Adapter](#-adapter)|[Chain of Responsibility](#-chain-of-responsibility)|
|[Factory Method](#-factory-method)|[Bridge](#-bridge)|[Command](#-command)|
|[Abstract Factory](#-abstract-factory)|[Composite](#-composite)|[Iterator](#-iterator)|
|[Builder](#-builder)|[Decorator](#-decorator)|[Mediator](#-mediator)|
|[Prototype](#-prototype)|[Facade](#-facade)|[Memento](#-memento)|
|[Singleton](#-singleton)|[Flyweight](#-flyweight)|[Observer](#-observer)|
||[Proxy](#-proxy)|[Visitor](#-visitor)|
|||[Strategy](#-strategy)|
|||[State](#-state)|
|||[Template Method](#-template-method)|

<br>




**LAB Assignments Document Files**
This folder contains all Lab Assignments Word documents and theoretical solutions to the questions.

**LAB-1 Part-1**
**Assignment Title: Lab-1 Part-1 Understanding OOP Concepts with Code Examples**
In Lab-1 part-1, I have organized the code into separate packages, each dedicated to illustrating a specific Object-Oriented Programming (OOP) concept. These packages are designed to provide a clear and explicit understanding of various OOP concepts, such as encapsulation, inheritance, polymorphism, and more. Each package contains code implementations that exemplify the respective concept.


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

