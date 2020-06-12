import java.util.Scanner;
public class CheckSorted {
	
	static boolean checkSorted(int[] array){
		if(array.length == 1)	return true;
		int array1[] = new int[array.length - 1];
		for(int i = 0; i < array.length - 1; i++)	array1[i] = array[i + 1];
		boolean ans = checkSorted(array1);
		if(!ans)	return false;
		if(array[0] > array1[0])	return false;
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int num = s.nextInt();
		int array[] = new int[num];
		for(int i = 0; i < num; i++)
			array[i] = s.nextInt();
		s.close();
		System.out.println(checkSorted(array));
	}
}
