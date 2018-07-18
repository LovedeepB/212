import java.io.PrintWriter;  //import printwriter
import java.io.File; //import file class
import java.util.Scanner; //import scanner
import java.io.FileNotFoundException; //imported the file not found exception
public class file { 
public static void main(String[] args) { //main method
File file= new File("C:\\hello\\");//created a file object called file with the extension to hello folder in the C: drive you will have to change to whatever location you want the file to appear in
Scanner kb= new Scanner(System.in); //created a scanner to be able to read user input

System.out.println("");
System.out.println("Enter the name of the file you would like to create: "); //ask the user to enter in the name of the file
String Fname=kb.next();  //store the name in the Fname string variable
System.out.println("");
System.out.println("Enter in the extension of the file (ex: .txt):"); //ask for the extension of the file they would like to create
String Fname2=kb.next();
Fname=Fname+Fname2; //you can concatenate strings together
String data=null;//set the variable to be null

file= new File("C:\\hello\\"+ Fname);  //create the file and it will appear on the desktop however the Loved will have to be changed if you are running the code somewhere else

PrintWriter print=null;  //create the print writer  
try {//try and catch block
	print= new PrintWriter(file); //try to make the print write, write into the file I created
}catch(FileNotFoundException ex) {
	System.out.println("Error file not found"); //if the file is not found an error occurred and you exit the code
	System.exit(0);
}
if(Fname2.equals(".txt")) { //if you get out of the try catch block and the extension of your file is .txt then this if statement is run
	System.out.println("");
	System.out.println("To a .txt file you can add information to the file through this code would you like to: "); //enter in yes or no
	String ans=kb.next();
	if(ans.equals("yes")) {//if you enter in yes then this if statement runs
		System.out.println("");
		System.out.println("Enter in the line of data you would like to appear in the file: "); //ask you what you want to enter
		data=kb.next();
		print.println(data);//prints the data onto the file
	}
       else{//if no then this line appears
    	   System.out.println("");
		   System.out.println("Okay you wouldn't like to type anything into the file.");
       }
}
System.out.println("");
System.out.println("Your file has been created!");//if everything runs and the code ends this line will appear
print.close();//need to close printwriter
kb.close();//need to close scanner
}
}

