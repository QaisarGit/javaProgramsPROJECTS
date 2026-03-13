package OOPTSconcepts;

import org.testng.annotations.Test;

public class Inheritance {
	
	class Animal {
	    void makeSound() {
	        System.out.println("The animal makes a sound");
	    }
	}

	// Subclass (Child Class)
	class Dog extends Animal {
	    @Override
	    void makeSound() {
	        super.makeSound(); // Call the superclass method
	        System.out.println("The dog barks");
	    }
	    
	    void bark() {
	        System.out.println("Dog barking");
	    }
	}
@Test
public void inheri() {
	
	Animal a= new Dog();
	a.makeSound();
	Dog d= new Dog();
	d.bark();
	d.makeSound();
}

}
