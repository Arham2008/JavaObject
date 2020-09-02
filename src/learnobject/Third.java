package learnobject;

public class Third {
	
	//non static method
		 public void country() {
			 
			    System.out.println(" i am going to karachi");
			    
		 }
	public void car () {
		System.out.println(" java is fun");
		 
		 }
	public void car1() {
		
		System.out.println("pakistan is great country");
		
	}
	
	public void car2() {
		
		System.out.println("ny is good place to live");
		
		}
	
	
	public void car3() {
		
		 System.out.println(" cricket is great game ");
	}
	
	public static void car4() {
	
	System.out.println(" PNT is my school");	
	
	}
	
	public static void main(String[]args){
		// non static variable and method should call by objectName
    	// className objectName =new ConstructorOfClass();
		// objectname.methodname();
		Third usa=new Third();
		usa.country();
		
		Third toyota = new Third();
		toyota.car();
		
		
		Third honda =new Third();
		honda.car1();
		
		
		Third bmw = new Third();
		bmw.car2();
		
		Third benz =new Third();
		benz.car3();
		
		Third.car4();
		
}
	
	
	
	
}	
	
	
	


