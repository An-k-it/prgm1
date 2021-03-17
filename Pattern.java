package pattern;
import java.util.Scanner;
public class Pattern {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
	System.out.print("Enter the size of pattern");
	int a=sc.nextInt();
	for(int i=1;i<=a;i++) {
		for(int j=1;j<=i*j;j++) {
			System.out.print(j);
			System.out.print(" ");
		}
	System.out.print("\n");
	
	}
	

}
}