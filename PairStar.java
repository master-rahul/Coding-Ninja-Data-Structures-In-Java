
public class PairStar {
	public static String addStars(String s) {
		if(s.length() == 0)
            return "";
        if(s.length() > 1){
			if(s.charAt(0) == s.charAt(1))
                return s.charAt(0) +"*"+addStars(s.substring(1));
        }
        return s.charAt(0) + addStars(s.substring(1));
	}
}
