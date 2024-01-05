package practice;

public class SortHeap {
	
	public static void sort(int[] a) {
		
		int n=a.length;
		for(int i=n/2-1;i>=0;i--) {
			heapify(a,n,i);
		}
		for(int i=n-1;i>=0;i--) {
			int swap=a[0];
			a[0]=a[i];
			a[i]=swap;
			heapify(a,i,0);
		}
	}		
	public static void heapify(int[] a, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n && a[l]>a[largest]) {
			largest=l;
		}
		if(r<n && a[r]>a[largest]) {
			largest=r;
		}
		if(largest!=i) {
			int temp=a[i];
			a[i]=a[largest];
			a[largest]=temp;
			heapify(a,n,largest);
		}	
	}

	public static void print(int[] a) {
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a= {23,65,12,76,16,98};
		print(a);
		
		sort(a);
		System.out.println("after sorting");
		print(a);
		
	}
}
