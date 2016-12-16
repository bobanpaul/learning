package code;

import java.util.Arrays;

public class QuickSort {
	
	/**
	 * Quick Sort Sample
	 * @param args
	 */

	public static void main(String[] args) {

		
		int[] a = {2,33,4,37,55,32,3};
		quicksort(a,0,a.length-1);
		
		System.out.println(Arrays.toString(a));;

	}
	
	
	private static void quicksort(int a[],int start,int end){
		
		if(start>end)
			return;
		int pivot = getpivot(a,start,end);
		
		quicksort(a,start,pivot-1);
		quicksort(a,pivot+1,end);
		
		
	}
	
	private static int getpivot(int a[],int start, int end){
		
		int pivot = a[start];
		int left = start;
		int right = end;
		
		while(left<right){
			
			while(a[left]<pivot)
				left++;
			while(a[right]>pivot)
				right--;
			
			if(left<right){
				swap(a,left,right);
			}
			
			
		}
				
		return left;
	}
	
	private static void swap(int a[],int b1, int b2){
		
		int temp = a[b1];
		a[b1] = a[b2];
		a[b2] = temp;
		
	}

}
