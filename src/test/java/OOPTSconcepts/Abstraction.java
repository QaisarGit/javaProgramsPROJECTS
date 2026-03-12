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



