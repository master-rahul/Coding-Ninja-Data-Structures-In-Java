
public class ReturnSubsetsSumToK {
	public static int[][] subsetsSumK(int input[], int k) {
		return helper(input,k,0);
	}
		static int[][] helper(int input[], int k, int p){
			if(input.length == p){
				if(k == 0) return new int[1][0];
				else return new int[0][0];
			}
			int v =input[p];
			int[][] arr1 = helper(input, k, p+1);
            int[][] arr2 = helper(input, k -v , p+1);
			int[][] arr = new int[arr1.length + arr2.length][];
            int l =0;
			for(int i=0; i< arr1.length; i++) arr[l++] = arr1[i];
            for(int i = 0; i<arr2.length; i++){
                arr[l] = new int[arr2[i].length+1];
                arr[l][0] =v;
                for(int j =0; j < arr2[i].length; j++)
                    arr[l][j+1] = arr2[i][j];
                l++;
            }
            return arr;
		}
}
