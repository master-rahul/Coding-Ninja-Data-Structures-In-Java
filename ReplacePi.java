
public class ReplacePi {
	public static String replace(String input){
        String output = "";
        return helper(input, output, 0);
	}
    static String helper(String input, String output, int index){
        if(index >= input.length())
            return output;
        if(input.length()-index > 1){
			if(input.charAt(index) == 'p' && input.charAt(index+1) == 'i'){
                output += "3.14";
            	return helper(input,output,index+2);
            }
        }    
        output += Character.toString(input.charAt(index));
        return helper(input,output,index+1);
    }
}
