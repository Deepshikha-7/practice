package practice;

public class SortBubble {

	public static void main(String[] args) {
		
		/* int[] a= {21,52,38,41,15,26,17}; 
		int temp;
		int count=0;
		System.out.println("before sorting :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<a.length;i++) { 
			int flag=0;
			count++;
			for(int j=0;j<a.length-1-i;j++) {  
				
				if(a[j]>a[j+1]) { 
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp; 
					flag=1; 
				}
			}
			if(flag==0) {
				break;
			}
		}
		System.out.println("after sorting :");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\niteration="+count); */
		
		 /*char[] a= {'r','g','l','d','a'};
		char temp;
		for(int i=0;i<a.length;i++) {
			int flag=0;
			for(int j=0;j<a.length-1-i; j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}  */
		
		
		String[] a= {"raj", "geet","loke","deep","annu","agk"};
		String temp;
		int flag=0;
		int count=0;
		for(int i=0;i<a.length;i++) { 
			count++;
			for(int j=0;j<a.length-1-i;j++) { 
				
				if(a[j].compareTo(a[j+1])>0) { 
					temp=a[j];					
					a[j]=a[j+1];
					a[j+1]=temp; 
					flag=1;
				}
			}
			
			if(flag==0) {
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("count="+count);
	} 

}
