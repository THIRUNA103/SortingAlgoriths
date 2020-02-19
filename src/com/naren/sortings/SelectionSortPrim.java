package com.naren.sortings;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SelectionSortPrim {
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		
		IntStream.of(a).forEach(System.out::print);
		for(int i=0;i<=a.length-2;i++) {
			int min=i;
			for(int j=i+1;j<=a.length-1;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			if(min !=i) {
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		System.out.println();
		IntStream.of(a).forEach((b)->{System.out.print(b);});
	}

}
