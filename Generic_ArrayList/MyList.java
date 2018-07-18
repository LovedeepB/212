import java.util.ArrayList;
public class MyList<T extends Number>{ //created a generic class
ArrayList<T> list = new ArrayList<>(); //made a generic arraylist
public void add(T x) { //add method to add to the arraylist
	list.add(x);
} 
public T largest() { //the largest method returns the largest value
	T ans=list.get(0);
	for(int i=1; i<list.size(); i++) {
		T nextNum = list.get(i); 
		if(nextNum.doubleValue() > ans.doubleValue()) { //checks if the next numbers in the arraylist are bigger than the number in the zero index
			ans=nextNum; //if yes then sets ans to be the highest number
		}
		//if the if statement isn't run than it returns the number at the zero index
}
	return ans;
}
public T smallest() {  //returns the smallest value
	T ans=list.get(0);
	for(int i=1; i<list.size(); i++) {
		T nextNum = list.get(i); 
		if(nextNum.doubleValue() < ans.doubleValue()) { //checks if the next numbers in the arraylist are smaller than the number in the zero index
			ans=nextNum; //if yes then sets ans to be the smallest number
		}
		//if the if statement isn't run than it returns the number at the zero index
}
	return ans;
}
} 


