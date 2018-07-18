import java.util.Random;
public class cargoShip extends ship{ //inherits ship 
private int tonnage; //private int variable 
public cargoShip() { //no parameter constructor
	super("Red Hood", "45697"); //need super first bc of inheritence
	Random r=new Random(); //random number generator
	int num2=Integer.parseInt(super.getYear());
	num2=(r.nextInt(40)+7);
	setTonnage(num2-r.nextInt(4)); 
}
public int getTonnage() { //getter
	return tonnage;
}
public void setTonnage(int tonnage) { //setter
	this.tonnage = tonnage;
}
public String toString() { //to string method that makes all the info in this class easy to understand
	return "The name of the ship is "+ super.getName()+
			" and the ship's cargo capacity is "+getTonnage();
}
}
