
public class LastIndexOfNumber {
	public static int lastIndex(int input[], int x) {
		return helper(input,x,input.length - 1);
	}
    
    public static int helper(int input[], int x , int index){
        if(index == -1) return -1;
        if(input[index] == x) return index;
        return helper(input,x,index-1);
    }

}
