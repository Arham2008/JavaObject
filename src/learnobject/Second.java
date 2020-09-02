package learnobject;

public class Second {

	
		// non static variable
		String text= "Imran khan is PM of Pakistan";
		int  cd= 123;
		float myprice=7.99f;
	    char mySize='w';
	    boolean myCredit=true;
	    long myaccount=12344556667l;
	    double bookCoast=178.99;
	     
	

    public static void main(String[] args) {
    	// non static variable and method should call by objectName
    	// className objectName =new ConstructorOfClass();
    	Second tv=new Second();
        System.out.println(tv.text);
        
        Second ac=new Second();
    	System.out.println(ac.cd);
    	
    	Second ad=new Second();
    	System.out.println(ad.myprice);
    	
    	
    	Second ae=new Second();
    	System.out.println(ae.mySize);
    	
    	
    	Second play=new Second();
    	System.out.println(play.myCredit);
    	
    	
    	Second game=new Second();
    	System.out.println(game.myaccount);
    	
    	Second cricket=new Second();
    	System.out.println(cricket.bookCoast);
    }
}