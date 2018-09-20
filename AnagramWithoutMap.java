package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramWithoutMap {
	
	 static boolean isAnagram(String s1, String s2) {
		 
		 boolean isAna=true;
		 
		 if(s1.length()!=s2.length()) {
			 isAna=false;
		 }else {
		 char[] a = s1.toLowerCase().toCharArray();
		 char[] b = s2.toLowerCase().toCharArray();
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 for(int i=0;i<a.length;i++) {
			 if(a[i]!=b[i]) {
				 isAna=false;
			 }
		 }
		 
		 } return isAna;
	 }

	public static void main(String[] args) {
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
