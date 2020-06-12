
public class CheckPalindrome {
	public static boolean isStringPalindrome(String input) {
		if(input.length() == 0 || input.length() == 1)
            return true;
        if(input.charAt(0) != input.charAt(input.length() -1))
			return false;
        String s = input.substring(1,input.length()-1);
    	return isStringPalindrome(s);
    }
}
