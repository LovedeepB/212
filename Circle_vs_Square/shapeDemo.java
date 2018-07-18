import java.util.Random; //need to import the random library 
public class shapeDemo {
public static void main (String[] args) {
	Random r= new Random(); // create a random number generator 
    Circle[] circle= new Circle[2]; //create an array of circle objects
	Square[] square= new Square[2]; //create an array of square objects
		for(int i=0; i<circle.length; i++) { //for loop used to set the radius/ side
			circle[i]=new Circle(r.nextDouble()); //sets the radius to be a random double
			square[i]= new Square(r.nextDouble()); // sets the side to be a random double
		}
		int count=1; // created count to be used for the for loop
		for (int w=0; w<circle.length; w++) {
			System.out.println("The area of circle "+ count+ " is "+ circle[w].area());
			System.out.println("The perimeter of circle " + count+ "is "+ circle[w].perimeter());
			System.out.println("The area of square "+ count+ " is "+ square[w].area());
			System.out.println("The perimeter of square " + count+ "is "+ square[w].perimeter()); 
			count++;
		} //prints out the area and perimeter of the square and circle
		System.out.println("Are the two circles the same: "+ circle[0].compareTo(circle[1])); 
		System.out.println("Are the two squares the same: "+ square[0].compareTo(square[1])); 
		//compares the twos circle objects and compares the two square objects
}
}

