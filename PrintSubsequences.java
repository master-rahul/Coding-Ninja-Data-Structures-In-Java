import java.util.Scanner;

public class PrintSubsequences {

	public static void printSubsequences(String input, String out) {
		if(input.length() == 0) {
			System.out.println(out);
			return;
		}
		
		printSubsequences(input.substring(1),out);
		printSubsequences(input.substring(1),out+input.charAt(0));
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		printSubsequences(str,"");
	}

}
