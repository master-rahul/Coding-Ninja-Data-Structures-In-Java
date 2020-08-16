
public class PrintAllPermutation {
	public static void permutations(String input){
		helper(input, "");
	}
    
    static void helper(String input, String out){
        if(input.length() == 0){
            System.out.println(out);
        	return;
        }
        
        for(int i =0; i < input.length(); i++){
            String s = "";
            if(i ==0) s = input.substring(1);
            else s = input.substring(0,i) + input.substring(i+1);
            String s1 = out +  input.charAt(i);
            helper(s,s1);
        }
    }
}
