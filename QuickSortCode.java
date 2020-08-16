
public class QuickSortCode {
	public static void quickSort(int[] input) {
        helperQuickSort(input, 0, input.length -1);
	}
    
    public static void helperQuickSort(int[] input, int st, int en){
        if(st >= en)
            return;
        int pivotPos = partition(input, st, en);
        helperQuickSort(input, st, pivotPos-1);
        helperQuickSort(input,pivotPos+1, en);
    }
    
    public static int partition(int[] input, int st, int en){
        int pivot = input[st], count = 0, i = st, j = en;
        for(int k = st+1; k <= en; k++)
            if(input[k] <= pivot)
                count++;
        int pivotPos = st + count;
        input[st] = input[pivotPos];
        input[pivotPos] = pivot;
        while(i < pivotPos && j > pivotPos){
             if(input[i] <= pivot)
                i++;
            else if(input[j] > pivot)
                j--;
            else{
                int temp =input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        return pivotPos;
    }
}

