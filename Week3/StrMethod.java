public class StrMethod {
	public static void main(String[] args) {
		String s1 = "Hello", s2 = "Hello World";
		System.out.println("Given String: " + s1);
		System.out.println("String Length: " + s1.length());
		System.out.println("Substring of " + s1 + " is " + s1.substring(1, 5));
		System.out.println("UpperCase String: " + s1.toUpperCase());
		System.out.println("LowerCase String: " + s1.toLowerCase());
		System.out.println("'o' String Index: " + s1.indexOf("o"));
		System.out.println("'o' String Last Index: " + s1.lastIndexOf("o"));
		s1.concat(" World");
		System.out.println("Concat ' World' to the String: " + s1);
		System.out.println("Is Same Strings: " + s1.equals(s2));
		System.out.println("Is Same Strings: " + s1.equalsIgnoreCase(s2));
		System.out.println("Compare two Strings: " + s1.compareTo(s2));
		System.out.println("String startswith 'H': " + s1.startsWith("H"));
		System.out.println("String endswith 'H': " + s1.endsWith("e"));
		System.out.println("String contains 'ell': " + s1.contains("ell"));
	}
}