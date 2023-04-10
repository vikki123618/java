package numberProgram;

public class PerfactNumber1To100 {
  public static void main(String[] args){
	  int start=1;
	  int end=100;
	  while(start<=end){
		  int sum=0;
		  int num=start;
		  for(int i=1;i<num;i++){
			  if(num%i==0){
				  sum=sum+i;
			  }
		  }
		  if(sum==num){
			  System.out.println(start);
		  }
		  start++;
	  }
  }
}
