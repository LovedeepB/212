import java.util.Random;
public class cruiseShip extends ship { //Inheritance bc of extends ship
private int MAX_passengers; // create private int variable 
public cruiseShip() { // no parameter constructor
	super("Titanic", "8975"); //need super first bc of inheritence
	Random r=new Random();
	int pass=Integer.parseInt(super.getYear()); //use parseInt to set string to Integer
	pass=(r.nextInt(30)+9);
	setMAX_passengers(pass-(r.nextInt(4))); 
}
public int getMAX_passengers() {//getter
	return MAX_passengers;
}
public void setMAX_passengers(int mAX_passengers) { //setter
	MAX_passengers = mAX_passengers;
} 
public String toString() { //to string method to make all the information in this class easy to understand
	return "The name of the ship is "+ super.getName()+
			" and the maximum number of passengers are "+ getMAX_passengers();
}
}
