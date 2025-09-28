package com.lowleveldesign.designpatterns.structural.decorator;

/**
 * The Decorator design pattern is a structural design pattern in object-oriented programming
 * that allows behavior to be added to an individual object dynamically, without affecting
 * the behavior of other objects from the same class. It provides a flexible alternative
 * to subclassing for extending the functionality of an object at runtime.
 *
 * Key Components:
 * Component Interface: Defines the common interface for both the concrete components and the decorators.
 *                      This ensures that decorators can be used interchangeably with the original objects.
 * Concrete Component: The original object to which additional responsibilities can be attached. It implements the Component Interface.
 * Decorator (Abstract Decorator): An abstract class that also implements the Component Interface and holds a reference to a Component object.
 *                     It typically delegates calls to the wrapped component.
 * Concrete Decorator: Concrete implementations of the Decorator. These classes add specific functionalities
 *                     to the wrapped component by overriding methods and potentially calling the superclass's implementation.
 *
 * Example : Pizza Shop - Base Pizza
 *  Adding Topping, Extra Cheese, Mushroom
 *
 *  Why do you need this pattern?
 *   - class explosion
 *
 * Benefits:
 * Flexibility: Allows adding or removing responsibilities dynamically at runtime.
 * Open/Closed Principle: New functionalities can be added without modifying existing code.
 * Avoids Class Explosion: Reduces the need for creating numerous subclasses for every combination of features.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
         System.out.println(tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        System.out.println(tree2.decorate());
    }
}
