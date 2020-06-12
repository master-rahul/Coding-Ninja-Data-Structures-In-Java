
public class GeometricSum {
	public static double findGeometricSum(int k){
		return helper(k,1.0);
	}
    static double helper(int k, double i){
        if(k == 0)
            return 1/i;
        return 1/i + helper(k -1, i*2);
    }
}
