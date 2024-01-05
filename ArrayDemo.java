package practice;

public class ArrayDemo {

	public static void main(String[] args) {
		int a[]=new int[3];
		a[0]=6;
		a[2]=7;
		//System.out.println(a[0]+" " +a[1]+" "+a[2]);
		
		int[] b= {10,30,20,40,60};
		for(int i=0;i<b.length;i++) {
			//System.out.print(b[i]+" ");
		}
		System.out.println();
		for(int i:b) {
			//System.out.print(i+" ");
		}
		
		//int[][] e= {{1,2,3},{4,5,6}};
		int[][] c= new int[2][3];
		c[0][0]=1;c[0][1]=2;c[0][2]=3;
		c[1][0]=4;c[1][1]=5;c[1][2]=6;
		/* int[][] d= new int[2][];
		d[0]=new int[2];
		d[1]=new int[3]; */
		int[][] f={{1,2,3},{8,9},{4,5,6}};
		for(int i=0;i<f.length;i++) {
			for(int j=0;j<f[i].length;j++) {
				System.out.print(f[i][j]+" ");
			}
			System.out.println();
		}
	}

}
