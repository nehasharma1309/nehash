package javaprograms;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramProg {
	
	 static boolean isAnagram(String s1, String s2) {
		 HashMap<Character,Integer> map1= new HashMap<Character,Integer>();
		 HashMap<Character,Integer> map2= new HashMap<Character,Integer>();
		 
		 
		 char[] s1Char=s1.toCharArray();
		 int x=1;

		 for(int i =0;i<s1Char.length;i++) {
			 if(map1.containsKey(s1Char[i])) {
			map1.put(s1Char[i], map1.get(s1Char[i])+1);
			 }else {
				 map1.put(s1Char[i], x);
			 }
		 }
		 char[] s2Char=s2.toCharArray();
		 int y=1;

		 for(int i =0;i<s2Char.length;i++) {
			 if(map2.containsKey(s2Char[i])) {
			map2.put(s2Char[i], map2.get(s2Char[i])+1);
			 }else {
				 map2.put(s2Char[i], y);
			 }
		 }
		 
		 
	 		System.out.println("map1 is"+map1.toString()); 
	 		System.out.println("map2 is"+map2.toString());
	 		
	 		if(map1.equals(map2)) {
	 			return true;

	 		}else {
	 			return false;
	 		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String s1;
		String s2;
		boolean val;
		System.out.println("enter string 1");
		s1=sc.nextLine();
		System.out.println("enter string 2");
		s2=sc.nextLine();
		
		val= isAnagram(s1,s2);
		if(val==true) {
			System.out.println("The strings are anagrams ");
		}else {
			System.out.println("The strings are not anagrams ");
		}
		sc.close();
	}

}
