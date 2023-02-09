import java.util.Scanner;

public class InputRead {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// byte age = scanner.nextByte();
		// System.out.println(age);

		// int number = scanner.nextInt();
		// System.out.println(number);

		String name = scanner.next();
		System.out.println(name);

		String fullName = scanner.nextLine();
		System.out.println(fullName);
	}
}