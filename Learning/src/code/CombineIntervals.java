package code;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Combine Intervals together
 * @author bobanpaul
 *
 */
public class CombineIntervals {
    
    private static class Interval{
        private int start;
        private int end;
        

	private Interval(int start,int end){
            this.start = start;
            this.end = end;
            
        }
	
	@Override
	public String toString(){
		
		return (this.start+" - "+this.end);
	}
        
  }
    
   private static Stack<Interval> combineIntervals(List<Interval> arr){
    	
    	Stack<Interval> interval = new Stack<>();
    	if(arr.size()==0)
    		return interval;
    	
    	interval.push(arr.get(0));
    	
    	for(int i=1;i<arr.size();i++){
    	Interval top = interval.peek();
    	
    	if(top.end<arr.get(i).start){
    		interval.push(arr.get(i));
    	}else{
    		if(top.end<arr.get(i).end){
    			top.end = arr.get(i).end;
    			interval.pop();
    			interval.push(top);
    		}
    	}
    		
    	}
    	
    	return interval;
    	
    	
    }
public static void main(String args[] ) throws Exception {
	
	java.util.List<Interval> lst = new ArrayList<>();
	lst.add(new Interval(1,3));
	lst.add(new Interval(2,5));
	lst.add(new Interval(6,9));
	lst.add(new Interval(9,10));
	lst.add(new Interval(3,5));
	
	
	Collections.sort(lst, new Comparator<Interval>(){

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start-o2.start;
		}
		});
	
	Stack<Interval> interval = combineIntervals(lst);
	
	for(Interval intval:interval){
		
		System.out.println(intval);
	}
	
}

}