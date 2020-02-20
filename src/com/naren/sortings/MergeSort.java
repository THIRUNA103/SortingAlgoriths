package com.naren.sortings;

import java.util.stream.IntStream;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] a= {5,4,3,2,1,11,100};
		IntStream.of(a).forEach(System.out::print);
		
		mergeSort(a,0,a.length-1);
		System.out.println();
		IntStream.of(a).forEach(System.out::print);
	}

	private static void mergeSort(int[] a, int l, int r) {
		// TODO Auto-generated method stub
		if(l<r) {
			int mid=(l+r)/2;
			mergeSort(a, l, mid);
			mergeSort(a,mid+1, r);
			merge(a,l,mid,r);
		}
		
	}

	private static void merge(int[] a, int l, int mid, int r) {
		
		int lsize=mid-l+1;
		int rsize=r-mid;
		
		
		int left[]=new int[lsize];
		int right[]=new int[rsize];
		
		for(int i=0;i<lsize;i++) {
			left[i]=a[l+i];
		}
		
		for(int j=0;j<rsize;j++) {
			right[j]=a[mid+1+j];
		}
		
		int i=0;
		int j=0;
		int k=l;
		
		while(i<lsize && j<rsize) {
			if(left[i]<=right[j]) {
				a[k++]=left[i++];
			}else {
				a[k++]=right[j++];
			}
		}
		
		while(i<lsize) {
			a[k++]=left[i++];
		}
		
		while(j<rsize) {
			a[k++]=right[j++];
		}
		
	}
}
