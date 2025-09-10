package com.tka.aug1;

public class StringLogical {

	public static int countVowels(String s) {
		int count = 0;
		for(int i = 0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
			{
				count++;
			}
		}
		return count;
	}
	
	
	

	public static void countVowelsArray(String[] names) {
		for(String n : names)
		{
			int count = 0;
			count = StringLogical.countVowels(n);
			System.out.println("Number of Vowels in " + n + " is "+count);
		}
		
	}

	public static StringBuffer rev(String s) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = s.length()-1 ; i>=0 ; i--)
		{
			sb.append(s.charAt(i));
		}
		System.out.println("Original String :" +s);
		System.out.println("Reversed String :"+sb);
		return sb;
		
	}
	
	
	
	public static void rev2(String s) {
		String rev = "";
		for(int i = s.length()-1 ; i>=0 ; i--)
		{
			rev += s.charAt(i);
		}
		System.out.println("Original String :" +s);
		System.out.println("Reversed String :"+rev);
		
	}

	
	
	public static void capital(String[] names) {
		for(String n : names)
		{
			System.out.println(n.toUpperCase() + " ----> " +n.length());
		}
		
	}

	

	public static void pallindrome(String s) {
		 StringLogical.rev(s);
		if(s.equalsIgnoreCase(s))
		{
			System.out.println("String is Pllindrome.");
		}
		else
		{
			System.out.println("String is not Pllindrome.");
		}
		
	}
	
	
	
	public static void wordsInSentence(String sentence)
	{
        String[] words = sentence.split(" ");
		int count = 0;
		for(String word : words)
		{
			System.out.println(word);
			count++;
		}
		System.out.println(count);
	}



	public static void replaceSpaces(String st) {
		String newString = st.replace(" ", "-");
		System.out.println(newString);
		
	}



	public static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder(s.length());
        boolean[] seen = new boolean[256];
             // Traverse through all characters
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // Check if s[i] is present before it  
            if (!seen[c]) {
                sb.append(c);
                seen[c] = true;
            }
        }
        return sb.toString();	
	}
	
	 static boolean isAnagram(String a, String b) {
	        if (a.length() != b.length()) 
	        {
	            return false;
	        }

	        a = a.toLowerCase();
	        b = b.toLowerCase();

	        int[] charCounts = new int[26]; 

	        for (int i = 0; i < a.length(); i++) {
	            charCounts[a.charAt(i) - 'a']++;
	        }

	        for (int i = 0; i < b.length(); i++) {
	            charCounts[b.charAt(i) - 'a']--;
	            if (charCounts[b.charAt(i) - 'a'] < 0) {
	                return false;
	            }
	        }
	        return true;
	    }




	 public static void mostFrequentCharacter(String str) {
		 if (str == null || str.isEmpty()) {
	            throw new IllegalArgumentException("Input string cannot be null or empty.");
	        }
	        int[] charCounts = new int[256]; // Assuming ASCII characters
	        // Count character frequencies
	        for (char c : str.toCharArray()) {
	            charCounts[c]++;
	        }
	        char mostFrequentChar = ' ';
	        int maxCount = -1;
	        // Find the character with the maximum count
	        for (int i = 0; i < charCounts.length; i++) {
	            if (charCounts[i] > maxCount) {
	                maxCount = charCounts[i];
	                mostFrequentChar = (char) i;
	            }
	        }
	        System.out.println("Most frequent character: "+mostFrequentChar);
		
	 }

}
