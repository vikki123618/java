 package StringProgram;
import java.util.Scanner;
public class RevereseWhile {
  public static void main(String[] args){
	  String str;
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter the string");
	  str=scn.nextLine();
	  System.out.println("reverse string");
	  System.out.println("----------------------------");
	  int i=str.length();
	  while(i>0){
		  System.out.println(str.charAt(i-1));
		  i--;
	  }
	  
  }
}
