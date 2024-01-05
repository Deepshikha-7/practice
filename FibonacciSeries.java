package practice;
// printing fibonacci
public class FibonacciSeries {

	public static void main(String[] args) {
		
		/* int a=0,b=1;
		int fibo;
		System.out.println(a+ " "+b);
		
		for(int i=1;i<=8;i++) {
			fibo=a+b;
			System.out.print(" " +fibo);
			a=b;
			b=fibo;
		} */
		
		int last = 0, pre = 1;
		int find = 10;
		int curr = pre - last;

		System.out.print(last + " " + pre + " ");
		for (int i = 1; i <= find - 2; i++) {
			curr = pre + last;
			if (curr <= find) {
				System.out.print(curr + " ");
				last = pre; // 1
				pre = curr; // 1
			}
		}
	}	
}
