***
<p align="center">
🎉 Lab 9! 🎉
</p>
<p align="center">
1) Facade Pattern <br>
2) Proxy Pattern
</p>

***
 
# 1) Facade Pattern
The Facade Design Pattern is of class *Structural* and having subclass of *Object Structural*. It provides the single door to the subsystem using a single interface.

## Intent
* Provides the unified Interface to a set of Interfaces in a subsystem.
* Facade Defines a Higher Level Interface that makes subsystems easier to use.

## Motivation
Let's say we want to provide a main and only access point to subclasses but client has nothing to do with the subclasses and the functionality provided by any subclass, this also provides the intent to make a central gate through which the subsystem can be accessed, and the process of communication can become simpler.
For example, let's say we have a 'Compiler', and there exists the implementation of different functionality such as 'Tokenizing' and 'Parsing' not 'Compiler' Class acts as a Facade for the further functionalities. This makes the usage of the subsystem easy to understand as well as easy to use.

## Applicability
Use Facade Design Pattern when:
1. There is a need for a simple Interface to a complex subsystem, as subsystems can become complex by the passage of time.
2. Decoupling of subsystems from its clients and other subsystems is required.
3. If there exists layers in subsystems, use a Facade to define entry point to each subsystem.

## Consequences
* Shields client from subsystem components by limiting the number of objects.
* It promotes the weak coupling between subsystems and clients.
* It does not prevent client to use subsystem classes directly.

***

# 2) Proxy Pattern
The Proxy Design Pattern is of class *Structural* and having subclass of *Object Structural*. It provides the facility of lazy loading objects on demand.

## Also Known As
**Surrogate**

## Intention
Provide a placeholder for another object to control access to it.

## Motivation
Let's say that we have a Document Editor and when Document is opened if everything is loaded on the first time including large images, it would take a long time to become usable. So, we have to handle the loading of the images on demand, so that the opening time of the document can be decreased. We can handle this problem by creating an image proxy object that will call _Draw()_ method that will render the images of the document instead of the placeholder image.

## Applicability
Use Proxy Design Pattern When:
1. More Versatile or sophisticated reference to an object is required than a simple pointer.
2. **Remote Proxy:** Local Representation for an object is required in different address.
3. **Virtual Proxy:** Creation of Expensive Objects is required on Demand.
4. **Protection Proxy:** Controlling Access to Object is Required.  
