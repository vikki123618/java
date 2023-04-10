package StringProgram;

public class PolindromOrNot {
  public static void main(String[] args){
	  String str="malayalam";
	  Boolean status=true;
	  for(int i=0;i<str.length()/2;i++){
		  if(str.charAt(i)!=str.charAt(str.length()-i-1)){
			  status=false;
			  break;
		  }
	  }
	  if(status==true){
		  System.out.println("this is polindrom");
	  }
	  else{
		  System.out.println("not polindrom");
	  }
  }
}
