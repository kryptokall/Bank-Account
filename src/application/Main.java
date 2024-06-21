package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter account number: ");
	int accNumber = sc.nextInt();
	System.out.print("Enter agency number: ");
	sc.nextLine();
	String agencyNumber = sc.nextLine();
	System.out.print("Enter account holder: ");
	String holderName = sc.nextLine();
	System.out.print("Is there an initial deposit (y/n)? ");
	char resp = sc.next().charAt(0);
	
	double initialDeposit = 0.0;
	if (resp == 'y') {
		System.out.print("Enter inicial deposit value: ");
		initialDeposit = sc.nextDouble();
	}
	
	Customer customer = new Customer(accNumber, agencyNumber, holderName, initialDeposit);
	
	System.out.println();
	System.out.println("Account data: ");
	System.out.println(customer);
	
	System.out.println();
	System.out.print("Enter a deposit value: ");
	double value = sc.nextDouble();
	customer.deposit(value);
	
	System.out.println("Updated account data:");
	System.out.println(customer);
	
	System.out.println();
	System.out.print("Enter a withdraw value (beware there is a $5.0 tax to each withdraw): ");
	value = sc.nextDouble();
	customer.withdraw(value);
	
	System.out.println("Updated account data:");
	System.out.println(customer);
	
	sc.close();
	}

}
