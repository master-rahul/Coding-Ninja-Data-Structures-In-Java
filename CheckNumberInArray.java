
public class CheckNumberInArray {
	public static boolean checkNumber(int input[], int x) {
		if(input.length == 0)
            return false;
        int array[] = new int[input.length - 1];
        for(int i = 1; i < input.length; i++)
            array[i-1] = input[i];
        
        if(input[0] == x)
            return true;
        boolean ans = checkNumber(array, x);
        if(!ans)
            return false;
        else 
            return ans;
	}
}
