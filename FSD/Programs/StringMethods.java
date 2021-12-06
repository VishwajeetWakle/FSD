public class StringMethods
{
	public static void main(String args[])
	{
		String str1 = new String("Hello Program");
		System.out.println("Original Value Of String is "+ str1);
		System.out.println("The Length Of String is "+ str1.length());
		System.out.println("Is the string is empty "+ str1.isEmpty());
		System.out.println("In this string char at 8th index is "+ str1.charAt(8));
		System.out.println("The index of P is "+ str1.indexOf('P'));
		System.out.println("Is the string starts with Hello "+ str1.startsWith("Hello"));
		System.out.println("Is the string ends with Hello "+ str1.endsWith("Hello"));
		System.out.println("The original value of string after concatinatin is "+ str1.concat(" In java"));
		String str2 = str1.concat(" In java");
		System.out.println("Original Value Of String 1 is "+ str1);
		System.out.println("Original Value Of String 2 is "+ str2);
		System.out.println("After substring "+ str2.substring(17));
		System.out.println("After substring "+ str2.substring(6,13));
		System.out.println("After replace a to A "+ str2.replace('a','A'));
		System.out.println("After replace all Program to String "+ str2.replaceAll("Program","String"));
		System.out.println("To Upper case "+ str2.toUpperCase());
		System.out.println("To lower case "+ str2.toLowerCase());
		String name = "AMIT";
		String name2 = "amit";
		System.out.println("Original Value Of String is "+ name);
		System.out.println("Original Value Of String is "+ name2);
		System.out.println("Are the both strings are equal "+ name.equals(name2));
		System.out.println("Are the string equal when we ignore the case " + name.equalsIgnoreCase(name2));
		
	}
}