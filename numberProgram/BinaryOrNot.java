package numberProgram;
import java.util.Scanner;
public class BinaryOrNot {
	public static void main(String[] ags){
		int r=0,c=0,num,b;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the number");
		num=scn.nextInt();
		b=num;
		while(num>0)
		{
			if((num%10==0)||(num%10==1))
			{
				r++;
				c++;
				num=num/10;
			}
		}
		if(r==c)
		{
			System.out.println("binary number");
		}    
		else 
		{
			System.out.println("not binary number");
		}
}
}
