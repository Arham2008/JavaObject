package learnobject;

public class Fifth {
	
	//non static method
	
	public void home() {
	
	System.out.println("we have a one faimly home");
	
	
	
	}
	
	public void home1() {
		
		System.out.println(" we have four bedroom");	
	}
	
	public void home2() {
	System.out.println("my home has alaram system");
	}
	
	public  void home4() {
	System.out.println(" it has very good location ");
	}
	public void home3() {
	System.out.println( "home sweet home");
	}
 public static void main( String []args) {
	 Fifth malverne=new Fifth();
	malverne.home();
	
	Fifth brooklyn=new Fifth();
	brooklyn.home1();
	
	Fifth astoria= new Fifth();
	astoria.home2();
	
	Fifth bronx =new Fifth();
	bronx.home4();
	
	Fifth statenIsland =new Fifth();
	statenIsland.home3();
	
}
 }