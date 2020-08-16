
public class PrintSubsetsSumToK {
	public static void printSubsetsSumTok(int input[], int k) {
		helper(input, 0, k, new int[0]);
	}
    
	static void helper(int[] input, int index, int k, int[] sum){
        if(input.length == index){
			if(k == 0){
                for(int i : sum)
					System.out.print(i+" ");
                System.out.println();
                return;
            }
            else return;
        }
        int[] arr = new int[sum.length+1];
    	for(int i = 0; i < sum.length; i++)
            arr[i] = sum[i];
        arr[sum.length] = input[index];
        helper(input, index+1, k - input[index], arr );
        helper(input, index+1, k, sum );
    }
}
