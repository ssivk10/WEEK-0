import java.util.Scanner;
public class Jumbled3 {

	public static void main(String[] args) {
		int n,dig,t;
		Scanner s = new Scanner(System.in);
		System.out.println("n: ");
		n=s.nextInt();
		String str="Jumbled";
		t=n;
		while(t>=10)
		{
			dig=t%10;
			t/=10;
			if(Math.abs(dig-t%10)!=1)
			{
				str="Not Jumbled";
				break;
			}
			else
				continue;
		}
		System.out.println(str);
	}

}

