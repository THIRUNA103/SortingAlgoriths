public class Main
{
	public static void main(String[] args) {
		System.out.println("Bubble Sort");
		/*
		Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.

        Best Case Time Complexity: O(n). Best case occurs when array is already sorted.

        Auxiliary Space: O(1)

        Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.

        Sorting In Place: Yes

        Stable: Yes

        Due to its simplicity, bubble sort is often used to introduce the concept of a sorting algorithm.
        In computer graphics it is popular for its capability to detect a very small error (like swap of 
        just two elements) in almost-sorted arrays and fix it with just linear complexity (2n). For example, 
        it is used in a polygon filling algorithm, where bounding lines are sorted by their x coordinate at a 
        specific scan line (a line parallel to x axis) and with incrementing y their order changes (two elements are swapped) 
        only at intersections of two lines
		*/
		int[] unsortedArray = {2,3,1,5,4,7,9,6,0};
		System.out.println("Unsorted Array:");
		printArray(unsortedArray);
		int noOfSwaps = 0;
		int k = 1;
		do{
		    noOfSwaps = 0;
    		for(int i=0;i<unsortedArray.length-k;i++){
    		    if(unsortedArray[i]>unsortedArray[i+1]){
    		        swapArrayElements(unsortedArray,i,i+1);
    		        noOfSwaps++;
    		    }
    		}
    		k++;
		}while(noOfSwaps!=0);
		System.out.println("Sorted Array:");
		printArray(unsortedArray);
	}
	
	public static void printArray(int[] arrayToPrint){
	    for(int i = 0; i < arrayToPrint.length; i++){
	        System.out.print(arrayToPrint[i]+" ");
	    }
	    System.out.println();
	}
	
	public static void swapArrayElements(int[] arrayToSwap, int firstIndex, int secondIndex){
	    int temp = arrayToSwap[firstIndex];
	    arrayToSwap[firstIndex] = arrayToSwap[secondIndex];
	    arrayToSwap[secondIndex] = temp;
	}
}
