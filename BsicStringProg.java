package javaprograms;


import java.io.*;
import java.util.*;

public class BsicStringProg {

 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String 1");
	        String A=sc.next();
	        System.out.println("Enter String 2");
	        String B=sc.next();
	        
	        int len = A.length()+B.length();
	        System.out.println(len);
	        
	        char[] str1 = A.toCharArray();
	        char[] str2 = B.toCharArray();
	        
	        if(Integer.valueOf(str1[0])>Integer.valueOf(str2[0])) {
	        	System.out.println("Yes");
	        }else {
	        	System.out.println("No");
	        }
	        
	        String str3=(A.substring(0,1).toUpperCase()).concat(A.substring(1, A.length()).toLowerCase());
	        String str4=(B.substring(0,1).toUpperCase()).concat(B.substring(1, B.length()).toLowerCase());

	        
	        System.out.println(str3 +" "+str4);
	        sc.close();
	        
	        
	        

	        
	    }
	}



