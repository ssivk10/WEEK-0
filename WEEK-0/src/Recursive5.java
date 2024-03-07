import java.util.Scanner;

public class Recursive5 {
	
	public static String parenthesis(String str) {
		  if(str.length() == 0) return str;
		  if(str.charAt(0) == '(') return str.charAt(0) + str.substring(1, str.indexOf(')')+1);
		  return parenthesis(str.substring(1));
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(parenthesis(s));
	}

}
