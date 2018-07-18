public class Demo {
public static void main (String [] args) { //my main method
MyList<Integer> list = new MyList<>(); //create an object for a generic class who is getting inputed an Integer values
list.add(123);//added to the arraylist
list.add(74); // added to the arraylist
list.add(98);//added to the arraylist

MyList<Double> sList = new MyList<>(); //create another object for the generic class who is getting inputed Double values
sList.add(394.2);// added to the arraylist for doubles
sList.add(97.34); // added to the arraylist for doubles
sList.add(57.1);// added to the arraylist for doubles

System.out.println("The smallest number for the integers are "+ list.smallest()); //calls the smallest method from the generic class for the integer object arraylist
System.out.println("The largest number for the integers are "+ list.largest());//calls the largest method from the generic class for the integer object arraylist
System.out.println("The smallest number for the Doubles are "+ sList.smallest());//calls the largest method from the generic class for the double object arraylist
System.out.println("The largest number for the Doubles are "+ sList.largest());//calls the smallest method from the generic class for the double object arraylist
}
}