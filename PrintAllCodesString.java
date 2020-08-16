
public class PrintAllCodesString {
	public static void printAllPossibleCodes(String input) {
		helper(input,"");
	}
    static void helper(String input, String out){
        if(input.length() == 0){
            System.out.println(out);
            return;
        }
        helper(input.substring(1), out + (char)(input.charAt(0)+48) );
        int num =0;
        if(input.length() >= 2){
            num = (input.charAt(0)-'0')*10 + (input.charAt(1)-'0');
            if(num <=  26)
                helper(input.substring(2),out+(char)(96 + num));
        }
    }
}	
