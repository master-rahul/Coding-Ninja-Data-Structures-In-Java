import java.util.Scanner;
public class PrintKeypad {
	public static String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		printKeypad(num,"");
	}
	public static void printKeypad(int num, String out) {
		if(num == 0) {
			System.out.println(out);
			return;
		}
		String s = keys[num%10];
		for(int i =0; i< s.length(); i++) {
			printKeypad(num/10,s.charAt(i)+out);
		}
	}

}
