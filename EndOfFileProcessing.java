package javaprograms;

import java.util.Scanner;

public class EndOfFileProcessing {
	
	public static void main(String[] args) {
		int line=1;
				
		Scanner sc = new Scanner(System.in);
	
		while (sc.hasNext()) {
			System.out.println(line+" "+sc.nextLine());
			line++;
		}
		 sc.close();
	
	}

}
