package PatternProgram;

public class ReversePattern {
  public static void main(String[] args) {
	int n=5;
	//int count=5;
	for(int i=1;i<=n;i++){
		for(int j=n;j>=i;j--){
			System.out.print(j);
		}
		System.out.println();
	}
}
}
