
public class Car {
	int speed,amountOfFuel;
	String brand,model;
	
	
	  //default constructor 
	public Car() { this.speed=0; this.amountOfFuel=0;
	  this.brand=""; this.model="";
	  
	  }
	  
	
	  //parameterized constructor 
	public Car(int speed, int amountOfFuel, String
	  brand, String model) 
	{ this.speed=speed; this.amountOfFuel=amountOfFuel;
	  this.brand=brand; this.model=model;
	  }
	
	
	//set and get method
	
	  public void setSpeed(int speed) { this.speed=speed; } public void getSpeed()
	  { System.out.println(this.speed); }
	  
	  public void setAmountOfFuel(int amountOfFuel) {
	  this.amountOfFuel=amountOfFuel; 
	  } 
	  public void getAmountOfFuel() { 
		  System.out.println(this.amountOfFuel); 
	  }
	  
	  public void setBrand(String brand) { this.brand=brand; 
	  } 
	  public void getBrand() { 
		  System.out.println(this.brand); 
	  }
	  
	  public void setModel(String model) { this.model=model; 
	  } 
	  public void getModel() 
	  { 
		  System.out.println(this.model); }
	 
	  
	public void brake() {
		System.out.println("Car is braking");
	}
	
	
	public void accelerate() {
		if (amountOfFuel >0) {
		System.out.println("Car is accelerating");
		this.amountOfFuel -=1;}
		else 
			System.out.println("no fuel");
	}
	
	
	  public void refuel(int refuelAmount) { 
		  System.out.println("Fuel on the tank:" + amountOfFuel); 
			  System.out.println("Refuel:"+refuelAmount);
			  System.out.println("Fuel on the tank after the refuel:"+(amountOfFuel+refuelAmount)); 
	  }
	  
	  
	  public void printData(){
	  
	  System.out.println("Brand: " + brand); System.out.println("Model: " + model);
	  System.out.println("Fuel: " + amountOfFuel);
	  }
	 
	
	
}
