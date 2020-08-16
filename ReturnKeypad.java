
public class ReturnKeypad {
	public static String[] keys = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	
    public static String[] keypad(int n){
		if(n == 0) return new String[]{""};
        String[] out = keypad(n/10);
        String s = keys[n%10];
        String[] out1 = new String[s.length() * out.length];
        int k =0;
        for(int i =0; i < s.length(); i++)
            for(int j =0; j <out.length; j++)
                out1[k++] =  out[j] + Character.toString(s.charAt(i));
        return out1;
	}
    public static void main(String args[]) {
    	String output[] = keypad(234);
    	for(int i =0; i < output.length; i++)
    		System.out.println(output[i]);
    }
}
