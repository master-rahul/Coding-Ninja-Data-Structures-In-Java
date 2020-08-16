import java.util.Scanner;
public class ReturnSubsequences {
	
	public static String[] returnSubsequences(String str) {
		if(str.length() == 0) return new String[]{""};
		
		String[] smallAns = returnSubsequences(str.substring(1));
		String[] output = new String[smallAns.length * 2];
		for(int i = 0; i < output.length; i++) {
			if(i < smallAns.length) output[i] = smallAns[i];
			else output[i] = str.charAt(0) + smallAns[i- smallAns.length];
		}
		
		return output;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		String array[] = returnSubsequences(str);
		for(int i =0; i < array.length; i++)	System.out.println(array[i]);
	}
}
