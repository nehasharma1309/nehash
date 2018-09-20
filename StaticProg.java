package javaprograms;

import java.util.Scanner;

public class StaticProg {
 	static boolean flag=true;;
    static int B;
    static int H;

	static {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the value of B ");
	    B=sc.nextInt();
	    System.out.println("Enter the value of H ");
	    H=sc.nextInt();
		   sc.close();
	   
	     if((B<=0 && H<=0) || (B<=0 && H>=0) || (B>=0 && H<=0)){
		        flag= false;
		        System.out.println("java.lang.Exception: Breadth and height must be positive");

	     }else {
	    	 flag=true;
	     }
	    	 
	}
	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
	}


