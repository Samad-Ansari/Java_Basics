public class Strings {
	public static void main(String[] args){
		String message = "Hello" + "!!";
		System.out.println(message);
		System.out.println(message.endsWith("!"));
		System.out.println(message.startsWith("!"));
		System.out.println(message.length());
		System.out.println(message.indexOf("e"));
		System.out.println(message.indexOf("llo"));
		System.out.println(message.indexOf("bye"));

		System.out.println(message.replace("!", "#"));
		System.out.println(message);

		String newMessage1 = "\tHello\n \"Samad\"";
		System.out.println(newMessage1);

	}
}