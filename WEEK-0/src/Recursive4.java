import java.util.Scanner;

public class Recursive4 {
	
	public static boolean nestedParen(String str) {
		  if(str.length()==0)
		  return true;
		  if(str.charAt(0)=='(' && str.charAt(str.length()-1)==')')
		  return nestedParen(str.substring(1,str.length()-1));
		  return false;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(nestedParen(s));
	}

}
