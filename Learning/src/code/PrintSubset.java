package code;
/**
 * Find the subsets by masking
 * @author bobanpaul
 *
 */

/*
 * 
How this works for the current example
for i in 0 to n

for j in 1 to 3

do i & (1 << j) > 0


i=000
j=001,010,100
 all output are 0
 
 i=001
 j=001,010,100
 
o/p -> a[0]-> a[0] -> a
 
i=010
j=001,010,100

o/p -> a[1] -> b

i=011
j=001,010,100

o/p -> a[0] -> a
o/p -> a[1] -> b
 
 This goes on
 */

public class PrintSubset {

	static void printSubsets(char set[])
    {
        int n = set.length;
        // Run a loop for printing all 2^n
        // subsets one by one
 // instead if Math.pow , we can also use 1<<n
        for (int i = 0; i < Math.pow(2, n); i++)
        {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i&(1<<j)) > 0)
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
    }
	
	 public static void main(String[] args)
	    {
	        char set[] = {'a', 'b', 'c'};
	        printSubsets(set);
	    }

}
