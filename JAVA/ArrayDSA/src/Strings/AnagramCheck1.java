package Strings;

public class AnagramCheck1 {

	public static void main(String[] args) {
		
		String a = "aab";
		String b = "abc";
		boolean visited [] = new boolean[b.length()];
		boolean isAnagram = false;
		
		if(a.length() == b.length()) {
			
			 for(int i=0; i<a.length(); i++) {
				 for(int j=0; j<b.length(); j++) {
					 if(b.charAt(j) == a.charAt(i) && !visited[j] ) {
						 visited[j] = true;
						 isAnagram = true;
						 break;
				     }
				 }
				 if(!isAnagram) {
						break;
				 }
		   }

	 }
		 
		 if(isAnagram) {
			 System.out.println("NO, strings are not Anagrams");
		 }
		 else {
			 System.out.println("Yes strings are Anagrams");
		 }

	}

}
