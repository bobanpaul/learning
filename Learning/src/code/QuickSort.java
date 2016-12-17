package code;

import java.util.Arrays;

public class QuickSort {
	
	/**
	 * Quick Sort Sample
	 * @param args
	 */

	public static void main(String[] args) {

		
		int[] a = {37,33,4,37,55,37,3};
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
		
		int pivot = a[start]+1;
		int left = start;
		int right = end;
		

		while(left<=right){
			
			if(a[left]<=pivot)
				left++;
			if(a[right]>pivot)
				right--;
			
			if(left<right){
				swap(a,left,right);
			}
			
			
		}
		swap(a,right,start);
				
		return right;
	}
	
	private static void swap(int a[],int b1, int b2){
		
		int temp = a[b1];
		a[b1] = a[b2];
		a[b2] = temp;
		
	}

}
