
public class SumOfArray {
	public static int sum(int input[]) {
		if(input.length == 1)
            return input[0];
        int arr[] = new int[input.length -1];
        for(int i = 1; i < input.length; i++)
        	arr[i-1] = input[i];
        return input[0] + sum(arr);
	}
}
