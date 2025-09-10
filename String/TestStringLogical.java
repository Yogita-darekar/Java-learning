package com.tka.aug1;

public class TestStringLogical {

	public static void main(String[] args) {
		String s = "Madam";
		
		System.out.println("Count of the vowels in the given string\n");
    	int count = StringLogical.countVowels(s);
		System.out.println("Total number of vowels is "+count);
		System.out.println("---------------------------------------------------\n");
		
		
		String[] names = {"Yogita", "Nikita", "Ankita", "Asmita", "Vedika"};
		System.out.println("Count of the vowels in the each word of gien string array\n");
		StringLogical.countVowelsArray(names);
		System.out.println("---------------------------------------------------\n");
		
		
		System.out.println("To convert the given string to Uppercase\n");
		StringLogical.capital(names);
		System.out.println("---------------------------------------------------\n");
		
		
		System.out.println("Reverse the given string by using append method\n");
		StringLogical.rev(s);
		System.out.println("---------------------------------------------------\n");
		
		System.out.println("Reverse the given string withot using append method\n");
		StringLogical.rev2(s);
		System.out.println("---------------------------------------------------\n");
		
		System.out.println("Check the given number is pallindrome or not\n");
        StringLogical.pallindrome(s);
        System.out.println("---------------------------------------------------\n");
		
        
        System.out.println("To count the words in given sentence\n");
		String sent = "I love my india";
		System.out.println(sent);
		StringLogical.wordsInSentence(sent);
		System.out.println("---------------------------------------------------\n");
		
		
		System.out.println("To replace the spaces in string by other characters \n");
		String st = "Yogita Shivhar Darekar";
		System.out.println(st);
		StringLogical.replaceSpaces(st);
		System.out.println("---------------------------------------------------\n");
		
		
		System.out.println("Remove all duplicate characters from string");
		String name = "Gajanan";
		System.out.println(name);
		String duplicate = StringLogical.removeDuplicates(name);
		System.out.println(duplicate);
		System.out.println("---------------------------------------------------\n");
		
		
		System.out.println("To check the strings are Anagrams or not");
		String s1 = "Yogita";
		String s2 = "tagiyo";
		System.out.println(s1 + "\n" + s2);
		boolean b = StringLogical.isAnagram(s1, s2);
		System.out.println(b);
		System.out.println("---------------------------------------------------\n");
		
		System.out.println("To check the most frequent character in string");
		String m = "thekiranacademy";
		System.out.println(m);
		StringLogical.mostFrequentCharacter(m);
		

	}

}
