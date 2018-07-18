public class Circle implements Enclosure { //implements the interface so gets access to the variable and abstract method
private double radius; // declare a private double variable called radius
public Circle() {
	radius=1; //default constructor 
}
public Circle (double rad) { // one parameter constructor, which means if user inputs a number it calls this constructor
	if (rad <=0) // checks to see if the radius is zero or below and if yes then executes print statement
		System.out.println("This number is invalid");
	radius=rad;
}
public double perimeter() { //the method we got from the interface is filled in here based on the class
	return 2*radius*PI;
} 
public boolean compareTo(Circle other) { //compare method with another circle
	return(radius==other.radius);
}

public double area() { // the other method we got form the interface
	return (radius*radius)*PI; 
}
public double getRadius() { //getter returns radius and it allows us access to the private variable
	return radius;
}
public void setRadius(double rad) { //setter basically used to allow us to change the private variable in this class 
	if (rad <=0)
		System.out.println("This number is invalid");
	radius = rad;
}
}
