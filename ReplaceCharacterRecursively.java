
public class ReplaceCharacterRecursively {
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length() == 0)	return "";
        if(input.charAt(0) == c1)
            return c2 + replaceCharacter(input.substring(1),c1,c2);
        return input.charAt(0) + replaceCharacter(input.substring(1),c1,c2);
	}
}
