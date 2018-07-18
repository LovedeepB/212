public class testDemo {
public static void main(String[] args) throws Exception{
       int[] gscores= {92,-98,92,98}; 
       int[] bscores= {-3,54,36,95}; 
       try {// try this block of code first and if the exception is caught then print out the message
    	  TestScores ts = new TestScores(gscores); 
    	  int sum=ts.sum(gscores);
    	  System.out.println("The average of the good scores is: "+ ts.average(sum)); //print out the average 
       }catch(InvalidTestScore ex) {
    	   System.out.println(ex.getMessage());
       }
       try { //you try this first and if you catch the exception you print out the message
     	  TestScores ts = new TestScores(bscores); 
     	  int sum1= ts.sum(bscores);
     	 System.out.println("The average of the bad scores is: "+ ts.average(sum1));//print out the average
        }catch(InvalidTestScore ex) { //catch this exception
     	   System.out.println(ex.getMessage()); //print out the message
        } 
}
}
