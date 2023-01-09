package org.emp;

public class Employee {
	private void employeName() {
		System.out.println("emp name is Tamil");
	}
	private void employeID() {
		System.out.println("emp id is 1234");
		
	}
	private void employeeDoj() {
		System.out.println("emp date of birth is 28.10.1993");
		
	}
	private void employeePhoneNumber() {
	    System.out.println("emp phone number is 8807120019");
	}
	private void employeeEmail() {
		System.out.println("emp mailid is kuttytamil.com");
		
	}
    private void employeeAddress() {
    	System.out.println("emp add is No 12 13 th street gopalapuram chennai -72");
    }
    public static void main(String[] args) {
    	Employee empClass=new Employee();
    			empClass.employeName();
    			empClass.employeID();
    	        empClass.employeePhoneNumber();
    	        empClass.employeeEmail();
    	        empClass.employeeAddress();
    }
    
}
