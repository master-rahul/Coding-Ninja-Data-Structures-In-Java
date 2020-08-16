
public class PrintSubsetsOfArray {
	public static void printSubsets(int input[]) {
        helper(input,new int[0]);
	}
    
    static void helper(int[] input, int[] out){
        if(input.length == 0){
            for(int i =0; i < out.length; i++)
                System.out.print(out[i]+" ");
            System.out.println();
            return;
        }
        int input1[] = new int[input.length-1];
        for(int i = 1; i < input.length; i++) input1[i-1] = input[i];
        int x = input[0];
        int[] out1 = new int[out.length+1];
        for(int i = 0 ; i < out.length; i++) out1[i] = out[i];
        out1[out.length] = x;
        helper(input1, out);
        helper(input1, out1);
    }
}
