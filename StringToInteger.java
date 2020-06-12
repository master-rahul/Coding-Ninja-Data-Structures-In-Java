
public class StringToInteger {
	public static int convertStringToInt(String input){
        if(input.length() == 0)
            return 0;
        return (input.charAt(0)-'0')*(int)Math.pow(10,input.length()-1)+convertStringToInt(input.substring(1));

	}
}
