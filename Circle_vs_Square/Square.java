public class Square implements Enclosure{//implements the interface
private double side; 
public Square() { //default constructor
	side=1.0; 
}
public Square(double s) { //one parameter constructor
	if (s <=0) //checks to make sure side isn't zero or negative
		System.out.println("This number is invalid");
	side=s;
}
public double perimeter() { // method obtained from the interface class
	return 4*side; 
}
public boolean compareTo(Square other) { //compares two squares
	return(side==other.side); 
}
public double area() { // method obtained by the interface class for the area
	return side*side; 
}
public void setSide(double side) { //setter 
	if (side <=0)
		System.out.println("This number is invalid");
	this.side=side; 
}
public double getSide() { //getter to return the value of the variable side
	return side; 
}



































}
