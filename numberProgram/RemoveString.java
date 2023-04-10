package numberProgram;

public class RemoveString{
	public static void main(String[]arg){
		String str="@#123viki";
		// replaceAll mean remove the cheracter
	    String result=str.replaceAll("[a-zA-Z1-9]","");
		System.out.println(result);//@#123
	}
}