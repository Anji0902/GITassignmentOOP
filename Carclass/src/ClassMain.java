

public class ClassMain {

	    public static void main(String[]args) {

	    	//calling from get/set method for car1 
		//create a object of a class
	  Car car1=new Car(); 
	  car1.setSpeed(240); 
	  System.out.println("Car1 Speed:" +car1.speed);
	  //car1.getSpeed();
	  
	  car1.setBrand("Mitsubishi"); 
	  System.out.println("Car1 Brand name:" +car1.brand);
	  //car1.getBrand(); 
	  
	  car1.setModel("Lancer"); 
	  System.out.println("Car1 Model name:" +car1.model);
	  //car1.getModel();
	  
	  car1.setAmountOfFuel(50); 
	  System.out.println("Car1 Fuel on the tank:" +car1.amountOfFuel);
	  
	  
	  car1.accelerate(); 
	  System.out.println("Car1 Fuel on the tank:" +car1.amountOfFuel);
	  car1.accelerate();
	  System.out.println("Car1 Fuel on the tank:" +car1.amountOfFuel);
	  
	  car1.refuel(5);
	  //public Car(int speed, int amountOfFuel, String   brand, String model) 
	  Car car2=new Car(400, 60,"Bugatti","Divo"); 
	  System.out.println("Car2 Brand:" +car2.brand);
	  System.out.println("Car2 Model:" +car2.model);
	  System.out.println("Car2 Speed:" +car2.speed);
	  System.out.println("Car2 Fuel on the tank:" +car2.amountOfFuel);
	    
	    
	    
	 }
	    
	    
	    
}
        

		

	
	
	
