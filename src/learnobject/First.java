package learnobject;

public class First{
	
	//  static variable
	
	public static int   ram= 109;
	public static double myprice=234.88;
	public static long   mysize=23676768678687l;
	public static boolean myjava=true;
	 
	 
	 //non static variable
	
	 char    mycarer='D';
	 float  mynumber =5.99f;
	 String mytext=  "java is good";	  
	
	 
	 
	 
	
	public static void main (String[]args) {
		
		  
		
		
		
		System.out.println(First.ram);
		System.out.println(First.myprice);
		System.out.println(First.mysize);
		System.out.println(First.myjava);
		
		// non static variable call by object name
		
		First astoria= new First();
		System.out.println(astoria.mycarer);
	
		First queens=new First();
		System.out.println(queens.mynumber);
		
		First manhattan=new First();
	    System.out.println(manhattan.mytext);
	}
}


