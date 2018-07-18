public class ship {
private String name; //create a private string variable
private String year; //create a private string variable
public ship() { //no parameter constructor
	setName("The Great Water"); //set the name 
	setYear("2018"); //set the year
}
public ship(String x, String y) { // 2 parameter constructor
	setName(x);
	setYear(y);
}
public String getName() { //getter
	return name;
}
public void setName(String name) { //setter
	this.name = name;
}
public String getYear() { //getter
	return year;
}
public void setYear(String year) { //setter
	this.year = year;
}
public String toString() { //tostring method that return all the data in this class in a way you can understand it
	return "The "+getName()+" was bulit in "+ getYear(); 
}

}
