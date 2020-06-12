import java.util.Scanner;
public class SumOfNaturalNumbers {
	public static int sum(int num) {
		if(num == 1)
			return 1;
		return num + sum(num-1);
	}
	
	public static int sum(int num, int no) {
		if(no == num)
			return num;
		return no + sum(num, no +1);
	}
	
	public static void main(String[] args) throws ArithmeticException {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		try {
			if(num < 0) {
				ArithmeticException e = new ArithmeticException();
				throw e;
			}
		}
		catch(Exception e) {
			System.out.println("Exception caught "+ e);
			return;
		}

		System.out.println(sum(num));
		System.out.println(sum(num,1));

	}

}
