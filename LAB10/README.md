***
<p align="center">
🎉 Lab 10! 🎉
</p>
<p align="center">
1) Adapter Pattern <br>
2) Command Pattern
</p>

***
 
# 1) Adapter Pattern
The Adapter Design Pattern is of class *Structural* and have sub class of both *Object and Class*. It provides the functionality to make one class adapt the interface or other class.

## Intent
Convert one interface to other that is expected by client, Adapter let's those classes work together that otherwise could not due to compatibility problems related to interfaces.

## Also Known As
Wrapper

## Motivation
Let's say that we have a drawing application and it has an interface called the 'Shape' now it can be used by other classes such as 'Circle' and 'Rectangle' but it has compatibility problems regarding the 'Text' class. So, now here comes the question of how we can make the 'Shape' class adaptable by the 'Text' class, so we can do that in the following two ways:
1. Making Interface Implement and Inheriting to the Text Class.
2. Composing 'Text' interface within a 'Text' and Implementing the 'TextShape' in terms of 'Text' class or interface.

## Applicability
Use the Adapter Design Pattern when
* You want to use existing class but its interface does not match the one you needed.
* You want to create a reusable class that corporate with unrelated or unforeseen classes, that is, classes that do not have compatibility issues.
* Object Adapter is required when 
    * Usage of Several Classes is Required.
    * Object Adapt interface of it's parent.

## Consequences
1. How much Adaptation is Required.
2. Pluggable Adapters -> A class is more usable when less classes use it.
3. Usage of two way adapters to create Transparency.

***
# 2) Command Pattern
The Command Design Pattern is of class *Behavioral* and having subclass of *Object Behavioral*. It helps to convert the request to an object so that decoupling between invoker and handler can be done.

## Intent
Encapsulation of request as an object so that client can be parameterized with different requests, queues and logs and support un-doable operations.

## Also Know As
1. Action
2. Transaction

## Motivation
Sometimes it becomes necessary to issue requests to objects without knowing anything about operation being performed. The common example can be in a user interface that a Button has to send a request after being getting clicked, but handling of this request cannot be handled by the Button itself. It is difficult to determine who will handle the response.
Command Pattern can help to handle this scenario by turning request to object itself. This object can be stored and passed around other objects as well.

## Applicability
Use Command Design Pattern When:
1. Callbacks is required in the Object Oriented World.
2. Parametrization of object is required.
3. Specification, Queue and execution of requests at different times is required.
4. Support of undo functionality is required.
