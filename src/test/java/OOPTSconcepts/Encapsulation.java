package OOPTSconcepts;

import org.testng.annotations.Test;

public class Encapsulation {
	
	 private String name;
	    private String id;
	    private double salary;

	    // Public getter method for name (read access)
	    public String getName() {
	        return name;
	    }

	    // Public setter method for name (write access)
	    public void setName(String name) {
	        this.name = name;
	    }

	    // Public getter method for ID
	    public String getId() {
	        return id;
	    }

	    // Public setter method for ID
	    public void setId(String id) {
	        this.id = id;
	    }

	    // Public getter method for salary
	    public double getSalary() {
	        return salary;
	    }

	    // Public setter method for salary with validation (controlled access)
	    public void setSalary(double salary) {
	        if (salary >= 0) { // Example of validation logic
	            this.salary = salary;
	        } else {
	            System.out.println("Error: Salary cannot be negative.");
	        }
	    }
	    
	    @Test
	    public void encap() {
	    	
	    	Encapsulation emp = new Encapsulation();

	         // Set values using public setter methods
	         emp.setName("Jane Doe");
	         emp.setId("E12345");
	         emp.setSalary(75000.00);

	         // Attempting to directly access a private variable would cause a compile error:
	         // emp.name = "John Doe"; // Error: name has private access in Employee

	         // Get and display values using public getter methods
	         System.out.println("Employee Details:");
	         System.out.println("Name: " + emp.getName());
	         System.out.println("ID: " + emp.getId());
	         System.out.println("Salary: $" + emp.getSalary());

	         // Attempting to set an invalid value (validation in setter prevents this)
	         emp.setSalary(-1000.00);
	    	
	    }

}
