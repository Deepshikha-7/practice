package practice;

public class SortSelection {

	public static void main(String[] args) {
		/* int[] a= {12,4,6,65,1,45};
		int min,temp=0;
		int count=0;
		int val=0;
		int tem=0;
		for(int i=0;i<a.length;i++) {
			min=i;
			val++;
			int flag=0;
			for(int j=i+1;j<a.length;j++) { 
				tem++;
				if(a[j]<a[min]) {
					min=j;
					flag=1;
				}
			}
			if(flag==1) {
			count++;
			temp=a[min];
			a[min]=a[i];
			a[i]=temp;
			}else {
				break;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+ " ");
		}
		System.out.println("count= "+count);
		System.out.println("valcount= "+val);
		System.out.println("tem="+tem); */
		
		String[] a= {"raj","geet","loke","deep","annu"};
		String temp="";
		int min;
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j].compareTo(a[min])<0) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
