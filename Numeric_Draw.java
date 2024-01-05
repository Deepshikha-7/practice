package practice;

public class Numeric_Draw {

	public static void main(String[] args) {
		//1
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		//2
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		//3
		int count=0;
		for(int i=1;i<=5;i++) {  
			for(int j=1;j<=i;j++) { 
				count++; 
				System.out.print(count+" ");
			}
			System.out.println();
		}
		System.out.println();
		//4
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) { 
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		//5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}

}
