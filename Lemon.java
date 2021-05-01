package SuperClass;

public class Lemon extends Fruit {
	private double vitaminC;
	private double weight;
	private boolean compare;
	
	  public Lemon() { //constructor for sub class of Fruit
		super();
		vitaminC = 0;
		weight = 0;
		compare = true;
	  }
	
	  public Lemon(String n, double vitC, double w, boolean c) { //constructor with  argument	
		super(n);// inherit data from super class with 1 parameter
		vitaminC = vitC;
		weight = w;
		compare = c;
		
		setInfo(); //method for overloading with no parameter
		setInfo(n); //method for overloading with 1 parameter
		setInfo(vitC,w,c); //call method
	  }
	  
	  public String setInfo() { //overriding method without parameter
			return "There is no parameter";
	  }
			
	  public String setInfo(String n) { //overriding method 1 parameter
			return "Fruit Name         : " + n ;
		}
		  
	  public String setInfo(double vitC, double w, boolean c) { //overriding method with many parameter
			return "Is lemon has higher vitamin C? " + c +
					"\nWeight             : " + w +
					"\nVitamin C (" + vitC + ")   : " + totalvitC();
			
		}
	  
	  public double getvitaminC() {
			return vitaminC;
	    }
	  
	  public double getWeight() {
			return weight;
	    }
		
	  public double totalvitC() {
		  return vitaminC * weight;
	  }
	  
	  public boolean getCompare() {
			return compare;
	    }
	  
	  public String toString() { //overriding method
		  return super.toString() + 
				 "\n\"Is lemon has higher vitamin C? " + compare +
		  		 "\nVitamin C (" + vitaminC + ")   : " + totalvitC() + "mg";
	  }
	  
}