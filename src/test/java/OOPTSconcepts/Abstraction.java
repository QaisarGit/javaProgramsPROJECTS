package OOPTSconcepts;

import org.testng.annotations.Test; 

abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();

    // Concrete method (with body)
    public void eat() {
        System.out.println("This animal is eating.");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    // Provides implementation for the abstract method
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

// Another subclass
class Cat extends Animal {
    // Provides implementation for the abstract method
    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}


public class Abstraction {
	@Test(description="Example using an Abstract Class")
	public void abstratClass() {
		
		 Animal myDog = new Dog();
	        Animal myCat = new Cat();

	        // Call the methods; the implementation of makeSound() is abstracted
	        myDog.makeSound(); // Output: Woof woof
	        myDog.eat();       // Output: This animal is eating.

	        myCat.makeSound(); // Output: Meow meow
	        myCat.eat();       // Output: This animal is eating.
	}
 
}

/////////////

abstract class Shape{
    String color;

    // these are abstract methods
    abstract double area();
    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String color){
        
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // this is a concrete method
    public String getColor(){
        
        return color;
        
    }
}
class Circle extends Shape{
    
    double radius;

    public Circle(String color, double radius){

        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    @Override double area(){
        
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public String toString(){
        
        return "Circle color is " + super.getColor()
            + "and area is : " + area();
    }
}
class Rectangle extends Shape{

    double length;
    double width;

    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    @Override double area() { return length * width; }

    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}
 class Tests {
	
	@Test
    public  void absTest()
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);

        System.out.println(s1.toString()); 
        System.out.println(s2.toString());
    }
}
