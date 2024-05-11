package pertemuan11;

import java.io.IOException;
import java.util.Scanner;

public class PostFixApp {
	 public static void main(String[] args) throws IOException {
		 String input;
		 int output;
		 
		 while(true) {
			 System.out.println("Enter Posfix: ");
			 System.out.flush();
			 input = getString();
			 if (input.equals("")) break;
			 
			 ParsePost aParse = new ParsePost(input);
			 output = aParse.doParse();
			 System.out.println("Hasil Operasi: " + output);
		 }

	 }
	 
	 public static String getString() throws IOException{
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 return s;
	 }
}
