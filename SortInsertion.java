package practice;

public class SortInsertion {

	public static void main(String[] args) {
		
	//int [] a= {43,2,76,23,98,3,7};
	
	//int temp,j;
//	for(int i=1;i<a.length;i++) {
//		temp=a[i];
//		j=i;
//		while(j>0 && a[j-1]>temp) {
//			a[j]=a[j-1];
//			j--;
//		}
//		a[j]=temp;
//	}
//	for(int i=0;i<a.length;i++) {
//		System.out.print(a[i]+" ");
//	}
	
	String[] a= {"raj", "geet","loke","deep","annu","agk"};
	String temp;
	for(int i=1;i<a.length;i++) {
		for(int j=i;j>0;j--) {
			if(a[j].compareTo(a[j-1])<0) {
				temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
 }

}
