
public class MergeSortCode {
	public static void mergeSort(int[] input){
		helperMergeSort(input, 0, input.length-1);
    }
    public static void helperMergeSort(int[] input, int s, int e){
		if(s >= e) return;
        int m = (s+e)/2;
		helperMergeSort(input, s , m);
        helperMergeSort(input, m+1,e);
        merge(input, s, e);
    }
    public static void merge(int[] input, int s, int e){
		int i = s, m = (s + e)/2, j = m+1, pos = 0, array[] = new int[e-s+1];
        while(i <= m && j <= e ){
            if(input[i] >= input[j]) array[pos++] = input[j++];
            else array[pos++] = input[i++];
        }
        while(i <= m) array[pos++] = input[i++];
        while(j <= e) array[pos++] = input[j++];
        for(int k = s; k <= e; k++) input[k] = array[k-s];
    }
}
