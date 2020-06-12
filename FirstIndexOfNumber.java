
public class FirstIndexOfNumber {
	static int count = 0;
	public static int firstIndex(int input[], int x) {
		if(input.length == 0) return -1;
		int arr[] = new int[input.length -1];
		for(int i =1; i<input.length; i++)
			arr[i-1] = input[i];
		if(input[0] == x)
			return count;
		count++;
		int ans = firstIndex(arr,x);
		if(ans == -1) return -1;
		return ans;
		
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3,3,5,5};
		System.out.println(firstIndex(arr,0));
	}
}	
