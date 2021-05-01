package SuperClass;

public class RedApple extends Apple  { 
  private boolean sugar;
	
	public RedApple() { // constructor for sub class of Apple
		super(); // inherit data from super class with no parameter
		sugar = true;
	}
	
	public RedApple(String n, int q, double p, String clr, String t, boolean s) { //constructor with argument	
		super(n,q,p,clr,t); // inherit data from super class with  parameter
		sugar = true;
		
		setInfo(); //method for overloading with no parameter
		setInfo(n); //method for overloading with 1 parameter
		setInfo(q,p,clr,t,s);//method for overloading
	}
	 
	public String setInfo() { //overriding method without parameter
		return "There is no parameter";
	}
		
	public String setInfo(String n) { //overriding method 1 parameter
		return n ;
	}
	  
	public String setInfo( int q, double p, String clr, String t , boolean s) { //overriding method with many parameter
		return "Price per piece    : RM" + p +
				"\nPurchase quantity  : " + q +
				"\nTotal price        : RM" + total() +
				"\nColour             : " + clr +
				"\nTaste              : " + t +
				"\nIs red apple has higher sugar level compare to green apple? " + s;
		
	}
	
	public boolean getsugar() {
		return sugar;
    }
	
	public String toString() { //overriding method
		  return super.toString() +
					 "\nIs red apple has higher sugar level compare to green apple? " + sugar;
	}
	  
}