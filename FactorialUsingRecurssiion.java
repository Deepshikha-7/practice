package practice;

public class FactorialUsingRecurssiion {
	int fact=1;
	int calFact(int no) {
		if(no>1) {
			//fact=no*calFact(no-1);
			 return no*calFact(no-1); // recursion 
		}
		return fact;
	}

	public static void main(String[] args) {
		int no=5;
		int ans;
		FactorialUsingRecurssiion f=new FactorialUsingRecurssiion();
		
		ans=f.calFact(no);
		System.out.println(ans);
	}

}
