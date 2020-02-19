package com.naren.sortings;

import java.util.ArrayList;
import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1,5,4,3,2,1,10));
		
		for(int i=0;i<=l.size()-2;i++) {
			int min=i;
			for(int j=i+1;j<=l.size()-1;j++) {
				if(l.get(min)>l.get(j)) {
					min=j;
				}
			}
			if(min != i) {
				Integer temp=l.get(min);
				l.set(min, l.get(i));
				l.set(i, temp);
			}
		}
		
		l.stream().forEach(System.out::print);
	}

}
