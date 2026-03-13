package OOPTSconcepts;

import org.testng.annotations.Test;

public class Polymorphism {
	// Base class Person
	class Person {

		// Method that displays the
		// role of a person
		void role() {
			System.out.println("I am a person.");
		}
	}

	// Derived class Father that
	// overrides the role method
	class Father extends Person {

		// Overridden method to show
		// the role of a father
		@Override
		void role() {
			System.out.println("I am a father.");
		}
	}

	@Test
	public void poly() {

		Person p = new Father();
		p.role();

	}
}
