package practice;

public class NumericPattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		int count=0;
		for(int i=1;i<5;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
					System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1;k>=1;k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		for(int i=1;i<=5;i++) {
			int no=i;
			for(int j=1;j<=i;j++) {
				System.out.print(no+" ");
				no=no+5-j;
			}
			System.out.println();
		}
		System.out.println("----------------------------");
		
		int temp=0;
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
			for(int j=1;j<=3;j++) {
				temp=temp+1;
				System.out.print(temp+" ");
			}
			}
			else {
				int temp1=temp+1;
				for(int j=temp+3;j>=temp1;j--) {
					temp=temp+1;
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
	}

}
