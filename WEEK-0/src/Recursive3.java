import java.util.Scanner;

public class Recursive3 {
	
	public static int power(int base, int n) {
		  if(n==0)return 1;
		  else return base*power(base,n-1);
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a base and an exponent: ");
		int base = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(power(base, n));
	}

}
