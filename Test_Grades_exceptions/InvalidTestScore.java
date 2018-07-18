public class InvalidTestScore extends Exception { //extend the exception class
public InvalidTestScore() { 
	super("Error: Invaid test Score"); //super gives you access to the exception class and when this class is called this message is what will appear
} 

}
