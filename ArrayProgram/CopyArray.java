package ArrayProgram;

public class CopyArray {
  public static void main(String[] args){
	  int[] a1={1,2,3,4,5};
	  int[] a2=new int[5];
	  for(int i=0;i<a1.length;i++){
		  a2[i]=a1[i];
	  }
	  System.out.println("array 1 element= ");
	  for(int i=0;i<a1.length;i++){
		  System.out.println(a1[i]);
	  }
	  System.out.println();
	  System.out.println("array 2 element=");
	  for(int j=0;j<a1.length;j++){
		  System.out.println(a2[j]);
	  }
  }
}
