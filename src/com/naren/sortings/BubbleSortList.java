package com.naren.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortList {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>(Arrays.asList(5,4,3,2,1,10));
		
		for(int i=0;i<l.size()-1;i++) {
			for(int j=0;j<l.size()-i-1;j++) {
				
				if(l.get(j)>l.get(j+1)) {
					Integer temp=l.get(j+1);
					l.set(j+1,l.get(j));
					l.set(j, temp);
				}
			}
		}
		
		l.stream().forEach(System.out::print);
		
	}

}
