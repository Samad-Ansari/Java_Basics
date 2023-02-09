public class Operators {
	public static void main(String[] args){
		// int x = 1;
		// int y = x++;
		// System.out.println(x);
		// System.out.println(y);
		// int x = 1;
		// int y = ++x;
		// System.out.println(x);
		// System.out.println(y);

		// Compound Assignment Operator
		int x = 1, y = 2, z = 3;
		x += 1; // x = x+1;
		y *= 3;
		z -= 1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		double result = (double)5/(double)3;
		System.out.println(result);

		int res = 3*(2-1);
		System.out.println(res);

		// AND Operators
		int temp = 20;
		boolean warm = temp >= 20 && temp < 30;
		System.out.println(warm);

		// OR Operators
		boolean hasIncome = true, hasCredit = true, criminalRecord = false;
		boolean eligible = (hasCredit || hasIncome) && !criminalRecord;
		System.out.println(eligible);









	}
}