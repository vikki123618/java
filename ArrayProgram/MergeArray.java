package ArrayProgram;

public class MergeArray {
  public static void main(String[] args){
	  int[] a1={1,2,3};
	  int[] a2={4,5};
	  int[] a3=new int[a1.length+a2.length];
	  for(int i=0;i<a1.length;i++){
		  a3[i]=a1[i];
	  }
	  int j=0;
	  for(int i=a1.length;i<a3.length;i++){
		  a3[i]=a2[j];
		  j++;
	  }
	  System.out.println("mergeArray");
	  System.out.println("------------------------------");
	  for(int i=0;i<a3.length;i++){
		  System.out.print(a3[i]+" ");
	  }
  }
}
