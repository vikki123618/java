package numberProgram;
import java.util.Scanner;
public class EligibleVolt {
  public static void main(String[] args){
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter the your age");
	  int age=scn.nextInt();
	  if(age>=18){
		  System.out.println("you are eligible for volt");
	  }
	  else{
		  System.out.println("not eligible for volt");
	  }
  }
}
