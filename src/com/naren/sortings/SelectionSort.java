public class Main
{
	public static void main(String[] args) {
		System.out.println("Selection Sort");
		/*
		Time Complexity: O(n2) as there are two nested loops.

		Auxiliary Space: O(1)
        	The good thing about selection sort is it never makes more than O(n) 
        	swaps and can be useful when memory write is a costly operation.
		*/
		int[] unsortedArray = {2,3,1,5,4,7,9,6,0};
		System.out.println("Unsorted Array:");
		printArray(unsortedArray);
		int[] sortedArray;
		for(int i=0;i<unsortedArray.length;i++){
		    int minimumElementsIndex = i;
		    for(int j = i + 1; j < unsortedArray.length; j++){
		        if(unsortedArray[minimumElementsIndex]>unsortedArray[j]){
		            minimumElementsIndex = j;
		        }
		    }
		    if(unsortedArray[i] != unsortedArray[minimumElementsIndex]){
    		    int temp = unsortedArray[i];
    		    unsortedArray[i] = unsortedArray[minimumElementsIndex];
    		    unsortedArray[minimumElementsIndex] = temp;
		    }
		}
		System.out.println("Sorted Array:");
		printArray(unsortedArray);
	}
	
	public static void printArray(int[] arrayToPrint){
	    for(int i = 0; i < arrayToPrint.length; i++){
	        System.out.print(arrayToPrint[i]+" ");
	    }
	    System.out.println();
	}
}
