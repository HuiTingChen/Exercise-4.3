package SuperClass;

public class Fruit {
	private String name;
	
	public Fruit() { //constructor without argument
		name = " ";		
	}
	
	public Fruit(String n) { //constructor with 1 argument	
		name = n;
		
		setInfo();
		setInfo(n); //call method
	}
	
	public String setInfo() { //overriding method with parameter
		return "There is no parameter";
	}
	
	public String setInfo(String n) { //overriding method with parameter
		return "Fruit Name         : " + n ;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() { //overriding method
		return name + " contructor is invoked" +
			   "\nFruit Name         : " + name ; 
	}
}