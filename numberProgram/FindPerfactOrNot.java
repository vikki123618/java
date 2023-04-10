package numberProgram;
import java.util.Scanner;
public class FindPerfactOrNot {
  public static void main(String[] args){
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter the number");
	  System.out.println("-----------------------");
	  int num=scn.nextInt();
	  int sum=0;
	  for(int i=1;i<num;i++){
		  if(num%i==0){
			  sum=sum+i;
		  }
	  }
	  if(sum==num){
		  System.out.println("perfact number");
	  }
	  else{
		  System.out.println("not perfact number");
	  }
  }
}
