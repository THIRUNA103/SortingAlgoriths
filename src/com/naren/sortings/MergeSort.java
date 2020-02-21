/******************************************************************************

T(n) = 2T(n/2) + \Theta(n)
The above recurrence can be solved either using Recurrence Tree method or Master method. It falls in case II of Master Method and solution of the recurrence is \Theta(nLogn).
Time complexity of Merge Sort is \Theta(nLogn) in all 3 cases (worst, average and best) as merge sort always divides the array into two halves and take linear time to merge two halves.

Auxiliary Space: O(n)

Algorithmic Paradigm: Divide and Conquer

Sorting In Place: No in a typical implementation

Stable: Yes

External sorting is a class of sorting algorithms that can handle massive amounts of data. 
External sorting is required when the data being sorted do not fit into the main memory of a 
computing device (usually RAM) and instead they must reside in the slower external memory, 
usually a hard disk drive. Thus, external 
sorting algorithms are external memory algorithms and thus applicable in the external memory model of computation.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Merge Sort");
		int a[] = {2,1,4,3,8,6,5,7,0};
		printArray(a,"unsorted");
		mergeSort(a,0,a.length-1);
		printArray(a,"sorted");
	}
	
	public static void mergeSort(int a[], int l, int r){
	    if(l<r){
	        int mid = (l+r)/2;
	        
	        mergeSort(a,l,mid);
	        mergeSort(a,mid+1,r);
	        
	        int left[] = new int[mid-l+1];
	        int right[] = new int[r-mid];
	        
	        for(int i=0;i<left.length;i++){
	            left[i] = a[l+i];
	        }
	       // printArray(left,"left");
	        for(int i=0;i<right.length;i++){
	            right[i] = a[mid+1+i];
	        }
	       // printArray(right,"right");
	        
	        int indexA = l;
	        int i = 0;
	        int j = 0;
	        while(i<left.length && j<right.length){
	            if(left[i]<right[j]){
	                a[indexA++] = left[i++];
	            }
	            else{
	                a[indexA++] = right[j++];
	               // Inversion Count : swaps += (m + 1) - (l + i);
	            }
	        }
	        
	        while(i<left.length){
	            a[indexA++] = left[i++];
	        }
	        
	        while(j<right.length){
	            a[indexA++] = right[j++];
	        }
	        
	    }
	}
	
	public static void printArray(int a[],String name){
	    System.out.println(name);
	    for(int i=0; i<a.length;i++){
	        System.out.print(a[i]+" ");
	    }
	    System.out.println();
	}
	
}
