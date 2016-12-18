package code;

import java.util.Arrays;

/**
 * Merge Sort with 2 arrays only
 * @author bobanpaul
 *
 */
public class MergeSort {

	private static int b[];
	public static void main(String[] args) {
		int a[] = {22,33,3,4,23,78,9,33};
		int b[] = new int[a.length];
		
		sort(0,a.length-1,a);
		
		System.out.println(Arrays.toString(a));
	}
	
	private static void sort(int start, int end, int[] a){
		
		if(start>=end)
			return;
			
		int middle = (start+end)/2;
		
		
		sort(start,middle,a);

		sort(middle+1,end,a);
		
		
		merge(start,end,middle,a);
	}
	
	private static void merge(int start, int end, int middle, int[] a){
	
		b = Arrays.copyOf(a, a.length);
		int j = middle+1;
		int i = start;
		int k=start;
		
		while(i<=middle && j<=end){
			if(b[i]<b[j]){
				a[k++]=b[i++];
			}else{
				a[k++]=b[j++];
			}
		}
			
			while(i<=middle){
				a[k++]=b[i++];
				
			}
			
			while(j<=end){
				a[k++]=b[j++];
				
			}
			
		
	}

}
