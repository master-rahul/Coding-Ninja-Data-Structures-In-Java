
public class RemoveX {
	static int index = 0;
	public static String removeX(String input){
		if(input.length() == index)
            return input;
        if(input.charAt(index) == 'x'){
            String s = input.substring(0,index);
            s += input.substring(index+1, input.length());
            return removeX(s);
        }
        index = index+1;
        return removeX(input);
	}
}
