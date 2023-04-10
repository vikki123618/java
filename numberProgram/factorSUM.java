package numberProgram;

public class factorSUM {
  public static void main(String[] args){
	  int num=10;
	  int count=0;
	  int sum=0;
	  for(int i=1;i<=num;i++){
		  if(num%i==0){
		  sum=sum+i;
		  count++;
		  }
	  }
		  System.out.println("count="+count);
		  System.out.println("sum="+sum);

	  
  }
}
