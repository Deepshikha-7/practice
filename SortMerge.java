package practice;

public class SortMerge {
	
	public static void mergeSort(int[] a, int f, int r) { // a,0,5
		
		if(f<r) { // 3<5 5<5
			int mid=(f+r)/2; //2 , 4
			//System.out.println("f:"+f+" mid:"+mid);
			mergeSort(a,f,mid);  	//a,0,2  //a,0,1 // a,0,0
			//System.out.println("f:"+f+" mid:"+mid);
			mergeSort(a,mid+1,a.length-1);	//a,3,5 // a,5,5
			//System.out.println("mid+1:"+mid+1+" mid:"+mid);
			merge(a,0,mid,a.length-1); // a,0,2,5 // a,0,1,2 // a,
			
		}
	}
	
	public static void merge(int[] a, int f, int mid, int r) { 
		int n1=mid-f+1; // 2-0+1 =3
		int n2=r-mid;	// 5-2=3 
		
		int la[] =new int[n1]; //3
		int ra[] =new int[n2]; 				// {23,65,12,76,16,98}
		 				
		// storing element in left arr
		for(int i=0;i<n1;i++) { //i=0 <3 
			la[i]=a[f+i]; // [0+0]  la= 23,65,12
		}
		//storing element in right arr
		for(int i=0;i<n2;i++) { //i=2 <3
			ra[i]=a[mid+1+i]; // [2+1+2] ra=76,16,98
		}
		int x=0,y=0;
		int k=f; //0,1,2,3
		
		while(x<n1 && y<n2) { // 0<3 && 0<3
			if(la[x]<=ra[y]) { // la[0]<=ra[0] // 23<=76
				a[k]=la[x]; 	// a[k]=23,65,12
				x++; //1
				k++; //
			}
			else {
				a[k]=ra[y];
				y++;
				k++;
			}
		}
		//  add left values as it is in the arr
		while(x<n1) { // 3<3
			a[k]=la[x];
			x++;
			k++;
		}
		while(y<n2) {  			//ra=76,16,98
			a[k]=ra[y]; 		// a[5]=ra[2]
			y++; // 3
			k++;	// 6			// a[k]=23,65,12,76,16,98
		}
	}

	public static void main(String[] args) {
		int[] a= {23,65,12,76,16,98};
		
		for(int n: a) {
			System.out.print(n+" ");
		}
		System.out.println();
		mergeSort(a,0,a.length-1);
		
		System.out.println("after sorting");
		for(int n:a) {
			System.out.print(n+" ");
		}
		
	}

}
