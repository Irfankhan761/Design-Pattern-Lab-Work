***
<p align="center">
🎉 Lab 7! 🎉
</p>
<p align="center">
1) AbstractFactory Pattern <br>
2) Builder Pattern <br>
3) Strategy Pattern
</p>

***
 
# 1) AbstractFactory Pattern
Abstract Factory is the Design Pattern of class *Creational* and having subclass of *Object Creational*. It provides the limiration on the creation of objects.

## Known as
KIT

## When to Use?
1. A System should be independent of how its products are composed, created or used.
2. A System should be configurable with one or multiple families of products.
3. A Family of related products objects is designed to be used together.
4. You want to provide only interface of library not implementation.

# 2) Builder Pattern
Builder is the Design Pattern of class *Creational* and having subclass of *Object Creational*. It provides the facility to create objects wiht looking under the hood.

## Intent
The main intent of this Design Pattern is to make the creation process same for objects with different representation.

## Motivation
In RICH TEXT Formatter, there should be a possibility to save file in many formats while not changing the existing software or software structure.

## Applicability
1. Creation of the object is independent of parts that makes the object.
2. When there is a need to create different object representation with same process.

## Consequences
* Can help to vary product internal representation -> The internal representation of product is hiddern by the Builder Interface.
* Isolation of code for *Representation* and *Construction*.
* Control over construction Process.

# 3) Strategy Pattern
The Strategy Design Pattern is of class _Behavioral_ and having subclass of _Object Behavioral_. It is related to defining the algorithms that can be interchangeable and also it does not depends upon the client that is using each algorithm.

## Also Known As
**Policy**

## Motivation
Let's say that we have an implementation of the String Building and different types of strings have different kind of building. Now let's say that we have to implement the line breaking algorithm. Now, it becomes very difficult to hard wiring implementation of the line breaking for different kind of String Building methods, the simple way to implement this is through Strategy Design Pattern. In this pattern, a class is defined that encapsulates different line breaking algorithms.

## Applicability
Use Strategy Design Pattern when:
1. Many Related Classes Differ in only their Behavior. Strategy provides a way to configure a class with one of many behaviors.
2. Different Variants of an Algorithm is required.
3. An Algorithm uses data that client should not known about.
4. A Class defines many behaviors, and these appear as multiple conditional statements in its operations.

## Consequences
* Implementation of Families of Related Algorithms can become easy.
* It is a better alternative to subclassing.
* Strategy Design Pattern eliminates the complex conditional statements.
