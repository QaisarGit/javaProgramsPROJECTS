package OOPTSconcepts;

import org.testng.annotations.Test;

public class absIterface {

	
	
	@Test(description="using interface")
	public void interfaceAbs() {
		
		
		
		 Vehicle v1 = new Car();
	        Vehicle v2 = new Bike();
	        
	        v1.start(); 
	        v1.stop();

	        v2.start();
	        v2.stop();

	}
		

interface Vehicle {
    void start();
    void stop();
}

// Class implements the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a key");
    }

    @Override
    public void stop() {
        System.out.println("Car stops using brakes");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick start or button");
    }

    @Override
    public void stop() {
        System.out.println("Bike stops using hand and foot brakes");
    }
}

// Main class to run the interface example
 
   



	
}
