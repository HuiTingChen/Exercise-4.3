package SuperClass;

public class GreenApple extends Apple{
	private boolean makepie;
	
	public GreenApple() { // constructor for sub class of Apple
		super(); // inherit data from super class with no parameter
		makepie = true;
	}
	
	public GreenApple(String n, int q, double p, String clr, String t, boolean pie) { //constructor with argument	
		super(n,q,p,clr,t); // inherit data from super class with  parameter
		makepie = true;
		
		setInfo(); //method for overloading with no parameter
		setInfo(n); //method for overloading with 1 parameter
		setInfo(q,p,clr,t,pie);//method for overloading
	}
	 
	public String setInfo() { //overriding method without parameter
		return "There is no parameter";
	}
	
	public String setInfo(String n) { //overriding method 1 parameter
		return "Fruit Name         : " + n ;
	}
	  
	public String setInfo(int q, double p, String clr, String t , boolean pie) { //overriding method with many parameter
		return "Price per piece    : RM" + p +
				"\nPurchase quantity  : " + q +
				"\nTotal price        : RM" + total() +
				"\nColour             : " + clr +
				"\nTaste              : " + t +
				"\nIs it suitable for making pie? " + pie;
	}
	
	public boolean getpie() {
		return makepie;
    }
	
	public String toString() { //overriding method
		  return super.toString() +
				 "\nIs it suitable for making pie? " + makepie;
	}
	 
	
	 
}