import java.util.Scanner;

class Factorial{
	
	public static int fact(int num) {
		if(num == 1)
			return 1;
		return num * fact(num-1);
	}
	
	public static int fact(int num, int no) {
		if(no == num)
			return num;
		return no * fact(num,no+1);
	}
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		System.out.println(fact(num));
		System.out.println(fact(num,1));
	}
}