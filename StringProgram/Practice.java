package StringProgram;
import java.util.Scanner;
public class Practice {
   public static void main(String[] args){
	     Scanner scn=new Scanner(System.in);
	     System.out.println("enter the number");
	     String str=scn.nextLine();
	     System.out.println("reverse string");
	     System.out.println("-------------------------");
	     int i=str.length();
	     while(i>0){
	    	 System.out.println(str.charAt(i-1));
	    	 i--;
	     }
   }
}
