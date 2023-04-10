package numberProgram;

public class FindevanOrNot {
 public static void main(String[] args){
	 int evan=0;
	 int odd=0;
	 int[]arr={1,2,3,4,5,6,7,8,9,10};
	 for(int i=0;i<arr.length;i++){
		 if(arr[i]%2==0){
			 evan++;
		 }
		 else
		 {
			 odd++;
		 }
	 }
	 System.out.println("evan count="+evan);
	 System.out.println("odd count="+odd);
 }
}
