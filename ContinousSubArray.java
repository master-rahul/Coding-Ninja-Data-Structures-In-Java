
public class ContinousSubArray {

	public static void main(String[] args) {
		int[] arr = {1,2,2,4,5};
		int[][]out;
		if(arr.length > 1)
			out = subArray(arr,0,arr[1]);
		else out = subArray(arr,0,-1);
		for(int i =out.length-1; i>= 0; i--) {
			for(int j =0; j<out[i].length; j++)
				System.out.print(out[i][j]+" ");
			System.out.println();
		}
	}
	
	static int[][] subArray(int[] input, int index, int check){
		if(input.length == index) return new int[0][0];
		int val = 0;
		if(index < input.length - 2) val = input[index+2];
		else val = -1;
		int[][] smallAns = subArray(input, index+1, val);
		int[][] ans;
		if(check == -1) {
			ans = new int[smallAns.length+1][];
			int k = 0;
			for(int i =0; i < smallAns.length; i++ )
				ans[k++] = smallAns[i]; 
			ans[k] = new int[]{input[index]};
		}
		else {
			int count =0;
			for(int i =0; i < smallAns.length; i++) if(smallAns[i][0] == check) count++;
			ans = new int[smallAns.length+count+1][];
			int k =0;
			for(int i =0; i<smallAns.length; i++)	ans[k++] = smallAns[i];
			for(int i =0; i < smallAns.length; i++) {
				if(smallAns[i][0] == check) {
					ans[k] = new int[smallAns[i].length+1];
				
					ans[k][0] = input[index];
					for(int j = 0; j< smallAns[i].length; j++)
						ans[k][j+1] = smallAns[i][j];
					k++;
				}
			}
			ans[k] = new int[] {input[index]};
		}
		return ans;
	} 
}
