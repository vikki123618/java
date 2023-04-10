package numberProgram;

public class Swap1numberToLast {
  public static void main(String[] args){
	  int[]arr={1,2,3,4,5};
	  int c=arr[0];
	  for(int i=0;i<arr.length-1;i++){
		  arr[i]=arr[i+1];
	  }
	  arr[arr.length-1]=c;
	  for(int i=0;i<arr.length;i++){
		  System.out.println(arr[i]);
	  }
  }
}
