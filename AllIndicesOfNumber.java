
public class AllIndicesOfNumber {
	public static int[] allIndexes(int input[], int x) {
		return helper(input,x,new int[0], 0);
	}
    
    static int[] helper(int input[], int x, int arr[], int index){
        if(index == input.length)
            return arr;
        if(input[index] == x){
            int arr1[] = new int[arr.length + 1],i;
            for(i =0; i<arr.length; i++)
                arr1[i] = arr[i];
            arr1[i] = index;
            return helper(input,x,arr1,index+1);
        }
        else
            return helper(input,x,arr,index+1);
    }
}
