public class TestScores {
	private int testScores[]; 
	public TestScores(int [] testScores) throws InvalidTestScore { //throws the expception here 
	this.testScores=new int [testScores.length]; 
	for(int i=0; i<testScores.length;i++) {
		if(testScores[i]<0 || testScores[i]>100)//if this if statement is run then you throw the invalid test score expcetion
			throw new InvalidTestScore();
}
}
	public void setTestScores(int [] testScores) { //setter
		this.testScores=testScores; 
	}
	public int[] getTestScores() { //getter
		return testScores; 
	}
	public int sum(int [] a) { //you figure out the sum here
		int total=0;
		for(int i=0;i<a.length;i++) {
			total+=a[i];
		}
		int ftotal=total;
		return ftotal;
	}
	public int average(int s) { //does the average here
		return s/testScores.length; 
	}
}
