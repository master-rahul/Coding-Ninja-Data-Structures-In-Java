
public class ReturnAllCodesString {
	public static  String[] getCode(String input){
		if(input.length() == 0){
            String s1[] = {""};
        	return s1;
        } 
        String[] arr1 = getCode(input.substring(1));
        String[] arr2 = new String[0];
        int num = 0;
        if(input.length() > 1){
            num = ((input.charAt(0)-'0')*10) + input.charAt(1)-'0';
            if(num <= 26)
            	arr2 = getCode(input.substring(2));
        }
        String ans[] = new String[arr1.length + arr2.length];
        int k = 0;
        for(int i =0; i < arr1.length; i++) ans[k++] = (char)(input.charAt(0) + 48) + arr1[i];
        for(int i =0; i < arr2.length; i++) ans[k++] = (char)(96 + num) + arr2[i];
        return ans;

    }
}
