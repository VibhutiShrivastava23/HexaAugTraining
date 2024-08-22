package com.hexa.task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class CustomerTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> customer=new ArrayList<>();
		
	//	Add 10 records and print using foreach method
		
		customer.add (new Customer(1,"Vibhuti","Bhopal",75000,new Date(102,1,23)));
		customer.add (new Customer(2,"Smita","Jaipur",15000,new Date(103,3,24)));
		customer.add (new Customer(3,"Samriddhi","Delhi",65000,new Date(101,4,10)));
		customer.add (new Customer(4,"Sachin","Pune",34000,new Date(105,5,22)));
		customer.add (new Customer(5,"Meetu","Nagpur",85000,new Date(103,2,13)));
		customer.add (new Customer(6,"Aditi","Mumbai",95000,new Date(102,8,15)));
		customer.add (new Customer(7,"Shreyansh","Agra",94000,new Date(104,5,27)));
		customer.add (new Customer(8,"Ritu","Manali",44000,new Date(101,06,9)));
		customer.add (new Customer(9,"Shreyam","Delhi",75000,new Date(100,9,05)));
		customer.add (new Customer(10,"Zeenat","Delhi",30000,new Date(103,0,04)));
		
		
		System.out.println("All Records of Customer");
		customer.forEach(y ->{
			System.out.println(y);
		});
	
		System.out.println("*********************************************");
	// display records whose premium > 80000
		
		System.out.println("Customer Whose premium > 80,000.....");
		customer.stream()
        .filter(y -> y.getPremium() > 80000)
        .forEach(y -> System.out.println(y));
		
		System.out.println("*********************************************");
	// display who belongs to city delhi
		
		System.out.println("Customer who belongs to delhi....");
		customer.stream()
        .filter(y -> "Delhi".equals(y.getCity()))
        .forEach(y -> System.out.println(y));
		
		System.out.println("*********************************************");
	// display sorted by dateofbirth
		System.out.println("Customer sort by Date of Birth....");
		Collections.sort(customer, (e1, e2) -> {
			return e1.getDateOfBirth().compareTo(e2.getDateOfBirth());
		});
		customer.forEach(y -> {
			System.out.println(y);
		});
		
		System.out.println("*********************************************");
	
	// display sorted by custName
		System.out.println("Customer sorted Alphabetically....");
		Collections.sort(customer, (e1, e2) -> {
			return e1.getCustName().compareTo(e2.getCustName());
		});
		customer.forEach(y -> {
			System.out.println(y);
		});

	}

}
