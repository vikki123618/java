package PatternProgram;

public class NumberSamerow {
  public static void main(String[] args) {
	int n=5;
	for(int i=1;i<=n;i++){
		for(int j=1;j<=i;j++){
			//if u enter i print col wise same number displayed,if u enter j row wise displayed same number
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
}
