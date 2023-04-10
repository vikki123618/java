package StringProgram;

public class InbulidAllAtringMethod {
   public static void main(String[] args){
	   //charAt
	   String str="vikki";
	   System.out.println(str.charAt(1));
	   System.out.println(str.charAt(2));
	   
	   //length
	   System.out.println(str.length());
	   
	   //tochararray
	   String s1="vikki";
	   char[] ch=s1.toCharArray();
	   for(int i=0;i<ch.length;i++){
		   System.out.println(ch[i]);
	   }
	   //indexOf
	   String s2="vikki";
	   System.out.println(s2.indexOf('i'));
	   System.out.println(s2.indexOf('v'));
	   
	   //uppercase
	   System.out.println(s1.toUpperCase());
	   
	   //lowercase
	   System.out.println(s1.toLowerCase());
	   
	   //substring
	   String s3="developer";
	   System.out.println(s3.substring(2));
	   
	   //trim
	   String s4="  software development";
	   System.out.println(s4.trim());
	   
	   //split
	   String s5="my name is vikki";
	   String[] arr=s5.split(" ");
	   for(int i=0;i<arr.length;i++){
		   System.out.println(arr[i]);
	   }
   }
}
