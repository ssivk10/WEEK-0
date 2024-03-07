import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Largest_Lexicographically5 {

	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter number of strings: ");
		int n = c.nextInt();
		System.out.println("Enter string(s): ");
		String [] s = new String[n];
		for(int i=0;i<n;i++)
		{
			//System.out.println(s[i]+ " "+i);
			
			s[i]=c.next();
			//System.out.println(s[i]+ " ---- "+i);
		}
		StringBuilder[]sb = new StringBuilder[n];
		for(int i=0;i<n;i++)
		{
			char[] ar = s[i].toCharArray();
			Arrays.sort(ar);
			sb[i]=new StringBuilder(new String(ar));
			sb[i].reverse();
		}
		System.out.println("Lexicographically, the largest strings are: ");
		for(int i=0;i<n;i++)
		 System.out.println(sb[i]);
	}

}
