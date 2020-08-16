
public class ReturnAllPermutations {
	public static String[] permutationOfString(String input){
		if(input.length() == 0) return new String[]{""};
        String smallAns[] = permutationOfString(input.substring(1));
		String ans[] = new String[input.length() * smallAns.length];
        int k = 0;
        for(int i = 0; i < smallAns.length; i++){
            for(int j = 0; j <= smallAns[i].length(); j++){
                ans[k++] = smallAns[i].substring(0,j) + input.charAt(0) + smallAns[i].substring(j,smallAns[i].length());   
            }
        }
        return ans;
	}
}
