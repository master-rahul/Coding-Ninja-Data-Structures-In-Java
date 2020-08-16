
public class ContinousSubString {
	
	static String[] continousSubString(String str, int index, char check) {
		if(str.length() == index) return new String[0];
		char val = '1';
		if(index < str.length()-2) val = str.charAt(index+2);
		String[] smallAns = continousSubString(str, index+1, val);
		String[] ans;
		if(check == '1') {
			ans = new String[smallAns.length + 1];
			for(int i = 0; i < smallAns.length; i++) ans[i] = smallAns[i];
			ans[smallAns.length] = String.valueOf(str.charAt(index));
		}
		else {
			int count = 0;
			for(int i =0; i < smallAns.length; i++)
				if(smallAns[i].charAt(0) == check) count++;
			ans = new String[smallAns.length + count + 1];
			int k =0;
			for(int i =0; i < smallAns.length; i++) ans[k++] = smallAns[i];
			for(int i =0; i< smallAns.length; i++) {
				if(smallAns[i].charAt(0) == check)
					ans[k++] = str.charAt(index) + smallAns[i]; 
			}
			ans[k] = String.valueOf(str.charAt(index));
		}
		return ans;
	}
	
	public static void main(String[] args) {
		String arr[], str = "world";
		if(str.length()>1) arr = continousSubString(str,0,str.charAt(1));
		else arr = continousSubString(str,0,'1');
		for(String i : arr)
			System.out.println(i);
	}

}
