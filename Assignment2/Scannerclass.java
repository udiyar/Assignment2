package Assignment2;

import java.util.Scanner;
public class Scannerclass {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please provide the name of trainer");
		
		String name=sc.nextLine();
		
		System.out.println("Please provide the department of trainer");
		
		String department=sc.nextLine();
		
		System.out.println("Please provide the email of trainer");
		
		String email=sc.nextLine();
		
		System.out.println("Please provide the id of trainer");
		
		int id=sc.nextInt();
		
		System.out.println("Name is:" +name);
		System.out.println("Department is:" +department);
		System.out.println("Email is:" +email);
		System.out.println("ID is:" +id);
		
		sc.close();
	}

}
