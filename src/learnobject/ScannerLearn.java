package learnobject;

import java.util.Scanner;


public class ScannerLearn {
	
	
	// Scanner: Working for input purpose
	public static void main(String[] args) {
		
		
		// className objectName =new constructorOfClass();
		
	     Scanner lesson = new Scanner (System.in);
		
	     
	     
		System.out.println("How many page read in one day: ");
		int page = lesson.nextInt();
		System.out.println( "I read " + page+" page in one day");
		
		
	    System.out.println("Enter your book name");
		String line=lesson.nextLine();
        System.out.println("my book"+line+"book"); 
	    
        
        System.out.println("how many chapter in book");
        double chapter=lesson.nextDouble();
        System.out.println("i have"+chapter+" chapter");
         
		// className objectName =new constructorOfClass();
		Scanner abc = new Scanner(System.in);
		String name = abc.nextLine();
		System.out.println("Enter your age");
		int age=abc.nextInt();
		System.out.println("Enter your salary");
		double salary=abc.nextDouble();
		System.out.println("My Name is "+name +" and age is "+age);
		System.out.println("My salary is "+salary);
		
		
		
		
		Scanner bank =new Scanner(System.in);
		System.out.println("how is my credit");
		String credit=bank.nextLine();
		System.out.println(bank+"how is my credit");
	
		
		System.out.println("where is my bank");
		String location=bank.nextLine();
		System.out.println("my bank location"+location+"location");
		
		
		System.out.println("Enter my bank name");
		String citi=bank.nextLine();
		System.out.println("my bank name"+citi+"citi");
		
		
		System.out.println("how much money i have?");
		int money=bank.nextInt();
		System.out.println("i have"+money+"money");
		
		System.out.println("enter your bank account number");
		double account=bank.nextDouble();
		System.out.println("my bank"+account+"account");
		
		
		
		Scanner home=new Scanner(System.in);
		
		System.out.println("how many room i have");
		String room=home.nextLine();
		System.out.println(" i have many room"+room);
		
		
	    System.out.println("how many door i have");
	      int door=home.nextInt();
		System.out.println("i have "+door+" doors");
	   
		
	   System.out.println("how many light do i have?");
		int light=home.nextInt();
	   System.out.println("i have"+light+"lights");
		
		System.out.println("what is the color of the fan?");
		String fan=home.nextLine();
		System.out.println("my fan"+fan+"colors");
		
		
		System.out.println("what is the coast of the home?");
		double price=home.nextDouble();
		System.out.println("The price is"+ price+"home");
		
		System.out.println( "enter window of nyour home" );
		int window=home.nextInt();
		System.out.println("i have"+window+"window");
		
		System.out.println("how man bathromm in my home?");
		int bathroom=home.nextInt();
		System.out.println("we have"+bathroom+"bathrooms");

		
		
		 Scanner car = new Scanner (System.in);
		
		 System.out.println("enter your car model");
		 String model=car.nextLine();
		 System.out.println("i have"+model+"model");
		 
		 System.out.println("what is the value of the car?");
		 double value=car.nextDouble();
		System.out.println("my car price"+value+"value");
		 
		System.out.println("enter the system of the car");
		String system=car.nextLine();
		System.out.println("my car"+system+"system");
		
		System.out.println("how many wheel in my car");
		int wheel=car.nextInt();
		System.out.println("my car has"+wheel+"wheels");
		
		
		System.out.println("do you have child seat in car ");
		String seat=car.nextLine();
		System.out.println( "yes i have child"+seat+"seats");
		
		
		
	}
	
	}
	
	
	
	
	
	
	


