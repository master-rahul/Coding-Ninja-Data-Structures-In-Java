
public class Multiplication {
	public static int multiplyTwoIntegers(int m, int n){
		if(n == 1)
            return m;
        return m + multiplyTwoIntegers(m, n-1);
	}
}	
