package numberProgram;
import java.util.Scanner;
public class primefactor {
  public static void main(String[] args){
	  int num,temp,i=2;
	  Scanner scn=new Scanner(System.in);
	  System.out.println("enter the number");
	  num=scn.nextInt();
	  temp=num;
	  while(temp>0){
			  if(temp%i==0){
				  System.out.print(i+",");
				  temp=temp/i;
				  
			  }
			  else{
				  i++;
			  }
		  }
	  }
	  
  }

