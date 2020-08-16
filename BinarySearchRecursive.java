
public class BinarySearchRecursive {
	public static int binarySearch(int input[], int element) {
		return helper(input, element, 0, input.length-1);
	}
    
    static int helper(int input[], int element, int s, int e){
        if(s > e) return -1;
        int m = (s+e)/2;
        if(input[m] == element) return m;
        if(input[m] > element)	
           return helper(input,element,s,m-1);
        else 
            return helper(input,element, m+1, e);
    }
}
