import java.util.Arrays;

public class ArraysType {
	public static void main(String[] args){
		int[] numbers = new int[5];
		// numbers[10] = 3;
		numbers[0] = 1;
		numbers[1] = 3;
		// System.out.println(numbers[10]);
		// System.out.println(Arrays.toString(numbers));
		// 1D
		int[] newNum = {10,22,13};
		Arrays.sort(newNum);
		System.out.println(Arrays.toString(newNum));

		// 2D
		int[][] matrix = new int[2][3];
		System.out.println(Arrays.deepToString(matrix));
	
		int[][] newMatrix = {{1,2,3}, {4,5,6}};
		System.out.println(Arrays.deepToString(newMatrix));

		// 3D
		int[][][] tensor = new int[1][2][3];
		System.out.println(Arrays.deepToString(tensor));

		final float PI = 3.14F;
		// PI  = 1;
		System.out.println(PI);


	}
}