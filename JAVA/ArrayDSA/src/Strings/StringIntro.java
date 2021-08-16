package Strings;

public class StringIntro {

	public static void main(String[] args) {
		// String declaration by object
		String newName = new String ("Reet");
		
		// String declaration through literals
		String name = "shekharsharma0818@gmail.com";
		System.out.println(name);
		System.out.println(name.charAt(2));
		System.out.println(name.length());
		System.out.println(name.substring(24));
		System.out.println(name.substring(0, 7));
		System.out.println(name.contains("@"));
		System.out.println(name.equals(newName));
		System.out.println(name.isEmpty());
		System.out.println(newName.concat(" Batra"));
		String name2 = "Shekhar";
		name2 = name2 + " Sharma";
		System.out.println(name2);
		
		
		
		
		
		

	}

}
