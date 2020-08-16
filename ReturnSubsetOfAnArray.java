
public class ReturnSubsetOfAnArray {
	public static int[][] subsets(int input[]) {
		if(input.length == 0) {
            int[][] out = new int[1][0];
            return out;
        }
        int input1[] = new int[input.length-1];
        for(int i = 1; i < input.length; i++) input1[i-1] = input[i];
        int smallAns[][] = subsets(input1);
        int output[][] = new int[2*smallAns.length][];
        for(int i =0; i < output.length; i++){
            if(i < smallAns.length)
                output[i] = new int[smallAns[i].length];
            else
                output[i] = new int[smallAns[i-smallAns.length].length+1];
        }
        
        for(int i = 0; i < smallAns.length; i++)
            output[i] = smallAns[i];
        for(int i = smallAns.length; i < output.length; i++)
            output[i][0] = input[0];
        for(int i = smallAns.length; i <output.length; i++)
            for(int j = 1; j < output[i].length; j++)
                output[i][j] = smallAns[i-smallAns.length][j-1];
        
        return output;
	}
}
