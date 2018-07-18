public class shipDemo {
public static void main(String[]args) {//main method
	ship[] ship=new ship[3]; //creates an array of 3 objects of ships
	ship[0]= new ship(); // sets the object ship at the index 0 to be a ship
	ship[1]= new cruiseShip(); // sets the object ship at the index 1 to be a cruise ship due to polymorphism
	ship[2]= new cargoShip(); // sets the object ship at the index 2 to be a cargo ship due to polymorphism
	
	for (int i=0; i<3; i++) {
		System.out.println(ship[i]); //print out the 3 ships 
	}
	
}
}
