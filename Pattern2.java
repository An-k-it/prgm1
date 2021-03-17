package pattern;

public class Pattern2 {
	public static void main(String args[]) {
		for(int i=0;i<=10;i++) {
			for(int j=0;j<=i;j++)
				
			{
			if(i==10) {
				break;
			}
			 System.out.print(j*i);
			 System.out.print(" ");
			}System.out.print("\n");
		}
	

}
}
