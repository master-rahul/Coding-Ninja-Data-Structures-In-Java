import java.util.Scanner;
public class FibinacciNumber {

	public static int fibo(int num) {
		if(num <= 1)
			return num;
		return fibo(num-1) + fibo(num-2);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		s.close();
		System.out.println(fibo(num));
	}  
}
