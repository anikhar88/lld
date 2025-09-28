package com.lowleveldesign.designpatterns.structural.bridge;

/**
 * The Bridge design pattern is a structural design pattern that decouples an abstraction from its implementation,
 * allowing both to vary independently. This pattern is particularly useful when dealing with systems
 * that have multiple variations of an abstraction and corresponding implementations, and where changes in one should not affect the other.
 *
 * Abstraction: This defines the high-level interface for the client. It contains a reference to an Implementor object and delegates the implementation-specific calls to it. The abstraction can have different refined abstractions (subclasses) that extend its functionality without changing the underlying implementation.
 * Implementor: This defines the interface for the implementation classes. It declares the operations that the Abstraction can delegate to.
 * Concrete Abstraction: These are specific implementations of the Abstraction interface. They might add or modify the behavior defined in the Abstraction but still rely on the Implementor for the low-level details.
 * Concrete Implementor: These are specific implementations of the Implementor interface. They provide the actual, low-level functionality.
 *
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape square = new Square(new RedColour());
        System.out.println(square.draw());

        Shape colour = new Square(new BlueColour());
        colour.draw();
        System.out.println(colour.draw());
    }
}
