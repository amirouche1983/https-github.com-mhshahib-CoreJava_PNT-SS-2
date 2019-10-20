package oop.abstraction;

public interface Car {

	// Interface
	// In an interface, you can't instantiate variable and create an object.
	// The interface cannot contain concrete(with implementation) methods
	// In Interface only one specifier is used- Public.

	//
//	A Java class can implement multiple Java Interfaces. It is necessary that the class must implement all the methods declared in the interfaces.
//	Class should override all the abstract methods declared in the interface
//	The interface allows sending a message to an object without concerning which classes it belongs.
//	Class needs to provide functionality for the methods declared in the interface.
//	All methods in an interface are implicitly public and abstract
//	An interface cannot be instantiated
//	An interface reference can point to objects of its implementing classes
//	An interface can extend from one or many interfaces. Class can extend only one class but implement any number of interfaces
//	An interface cannot implement another Interface. It has to extend another interface if needed.
//	An interface which is declared inside another interface is referred as nested interface
//	At the time of declaration, interface variable must be initialized. Otherwise, the compiler will throw an error.
//	The class cannot implement two interfaces in java that have methods with same name but different return type.

//	When to use Interface and Abstract Class?
//			Use an abstract class when a template needs to be defined for a group of subclasses
//			Use an interface when a role needs to be defined for other classes, regardless of the inheritance tree of these classes

	public void carStart();

	public void carStrop();

	public void carEngine();

	public void carWheel();

}
