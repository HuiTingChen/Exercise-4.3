package SuperClass;

public class Avocado extends Fruit {
	private double fats;
	private double weight;
	private boolean heart_healthy;
	
	public Avocado() { //constructor for sub class of Fruit
		super();
		fats = 0;
		weight = 0;
		heart_healthy = true;
	}
	
	public Avocado(String n, double f, double w, boolean h){ //constructor with argument	
		super(n);// inherit data from super class with 1 parameter
		fats = f;
		weight = w;
		heart_healthy = h;
		
		setInfo(); //method for overloading with no parameter
		setInfo(n); //method for overloading with 1 parameter
		setInfo(f,w,h); //method for overloading
    }
	  
	public String setInfo() { //overriding method without parameter
		return "There is no parameter";
	}	
	
    public String setInfo(String n) { //overriding method 1 parameter
		return "Fruit Name         : " + n ;
	}
	  
    public String setInfo(double fats, double w, boolean heart_healthy) { //overriding method with many parameter
		return "Is avocado contain heart healthy fatty acid? " + heart_healthy +
				"\nWeight             : " + w +
				"\nFat Amount (" + fats + ")  : " + totalFats() + "g";
		
	}
		
	  public double getFats() {
		  return fats;
	  }
	  
	  public double getWeight() {
			return weight;
	    }
	
	  public boolean getCompare() {
			return heart_healthy;
	    }
	  public double totalFats() {
		  return fats * weight;
	  }
	  
	  public String toString() { //overriding method
		  return super.toString() + 
				 "\nIs avocado contain heart healthy fatty acid? " + heart_healthy +
		  		 "\nFat Amount (" + fats + ")  : " + totalFats() + "g";
	  }
	 
}