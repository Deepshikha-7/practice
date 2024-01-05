package practice;

public class SortQuick {
	
	private static int partition(int[] a, int low, int high) { // 12,16,23,65,76,98 // low=1 high=2 //(a,1,2)
		int pivot=a[(low+high)/2];		// pivot[1]=16
		while(low<=high) { 		// 1<=2
			while(a[low]<pivot) {	// a[1]=16 < 16
				low++;		// low=1
			} 
			while(a[high]>pivot) { 	// a[1]=16 > 16
				high--;		// high=1
			}
			if(low<=high) { // 1<=1
				int temp=a[low]; //16
				a[low]=a[high];	// a[low]=16
				a[high]=temp;		// a[high]=16 	// 12,16,23,65,76,98
				low++; //low=2
				high--; 	//high=0
			}
		}	
		return low; // 2
	}
	
	public static void quickSort(int[] a, int low, int high) {
		int pi=partition(a,low,high); // (a,1,5)// (a,1,3) // (a,1,2) // pi=2
		if(low<pi-1) { 		//  1< 1
			quickSort(a,low,pi-1); 	// (a,1,2)
		}
		if(pi<high) {		// 2<2
			quickSort(a,pi,high); 		// (a,1,5)
		} 
	}
	
	public static void print(int[] a) {
		for(int n: a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] a= {23,65,12,76,16,98};
		System.out.println("before sorting");
		print(a);
		
		quickSort(a,0,a.length-1);
		System.out.println("after sorting");
		print(a);

	}	

}
