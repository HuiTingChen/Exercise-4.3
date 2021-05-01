package SuperClass;

public class Apple extends Fruit{
	protected int quantity;
	protected double price;
	protected String colour;
	protected String taste;
	
	public Apple() { //constructor for sub class of Fruit
		super(); // inherit data from super class with no parameter
		quantity = 0;
		price = 0;
		colour = " ";
		taste = " ";
	}
	  
	public Apple(String n, int q, double p, String clr, String t) { //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		quantity = q;
		price = p;
	    colour = clr;
		taste = t;
		
		setInfo(); //method for overloading with no parameter
		setInfo(n); //method for overloading with 1 parameter
		setInfo(q,p,clr,t); //method for overloading with many parameter
	}
	
	public String setInfo() { //overriding method without parameter
		return "There is no parameter";
	}
		
	public String setInfo(String n) { //overriding method 1 parameter
		return "Fruit Name         : " + n ;
	}
	  
	public String setInfo(int q, double p, String clr, String t) { //overriding method with many parameter
		return "Price per piece    : RM" + p +
				"\nPurchase quantity  : " + q +
				"\nTotal price        : RM" + total() +
				"\nColour             : " + clr +
				"\nTaste              : " + t ;
	}
	
	public int getQuantity() {
		return quantity;
    }
	
	public double getPrice() {
		return price;
    }
	  
	public String getColour() {
		return colour;
    }
	
	public String getTaste() {
		return taste;
    }
	  
	public double total() {
		return quantity* price;
	} 
	  
	  
	public String toString() { //overriding method
	    return  super.toString() + 
	    		"\nPrice per piece    : RM" + price + "\n" +
	    		"Purchase quantity  : " + quantity + "\n" + 
	    		"Total price        : RM" + total() + "\n" + 
	    		"Colour             : " + colour + "\n" + 
	    		"Taste              : " + taste;
	  }
}