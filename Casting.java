public class Casting {
	public static void main(String[] args){
		// Implicit Casting from small to larger data type (widening)
		// byte > short > int > float > double
		byte x = 2;
		int y = x + 2;
		System.out.println(y);
		double d = 3;
		double z = d + 2; // 2.0;
		System.out.println(z);

		// Explicit Casting from larger to small data type (shortning);
		// byte < short < int < float < double
		double db = 5.0;
		int ans = (int)db + 2;
		System.out.println(ans);

		String sdb = "2.43";
		int res = (int)Double.parseDouble(sdb) + 5;
		System.out.println(res);
	}
}