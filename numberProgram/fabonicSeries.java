package numberProgram;

public class fabonicSeries {
   public static void main(String[] args){
	   int n=5;
	   int fab1=0;
	   int fab2=1;
	   int fab3=fab1+fab2;
	   while(n>=0){
		   System.out.println(fab1);
		   fab1=fab2;
		   fab2=fab3;
		   fab3=fab1+fab2;
		   n--;
	   }
   }
}
