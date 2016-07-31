
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String z = "Today is Friday";
		
		String z1 = "Sunday";
		String z2 = "Monday";
		String z3 = "Tuesday";
		String z4 = "";
		String z5 = "     Wednesday     ";
		String z6 = "thursday";
		String z7 = "Sunday";
		
		System.out.println("The value of z3:" +z3);
		System.out.println("Length of the string is: " + z.length());
		System.out.println("Character at index 2 is: " + z.charAt(2));
		System.out.println(z.concat(" This is the appended string"));
		System.out.println("Contains check 1: " + z.contains("is"));
		System.out.println("Contains check 2: " + z.contains("si"));
		System.out.println("Starts with check 1: " + z.startsWith("Today"));
		System.out.println("Starts with check 2: " + z.startsWith("is"));
		System.out.println("Ends with check 2: " + z.endsWith("string"));
		System.out.println("Ends with check 2: " + z.endsWith("is"));
		System.out.println("Check contents are equal: " + z1.equals(z2));
		System.out.println("Check contents are equal: " + z1.equals(z7));
		System.out.println("Index of 'h' is: " + z.indexOf('h'));
		System.out.println("Check if string is empty 1: " + z.isEmpty());
		System.out.println("Check if string is empty 2: " + z4.isEmpty());
		System.out.println("Trim the leading and trailing spaces: " + z5.trim());
		System.out.println("Replace Example: " + z6.replace('t', 'Z'));
		
		System.out.println("Substring Example 1: " + z.substring(5));
		System.out.println("Substring Example 2: " + z.substring(5, 10));
		
		char[] charArray = z.toCharArray();
		for (int i = 0; i<charArray.length; i++) {
			System.out.println("Index " + i + " is: " + charArray[i]);
		}
		
		System.out.println("Lower case: " + z.toLowerCase());
		System.out.println("Upper case: " + z.toUpperCase());
	}
}
		