import java.util.Scanner;
public class Recursive1 {
	
	public static String adjacent(String str) {
		  if(str.length()<=1)return str;
		  if(str.charAt(0)==str.charAt(1))return str.charAt(0)+"*"+adjacent(str.substring(1));
		  return str.charAt(0)+adjacent(str.substring(1));
		}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(adjacent(s));
	}

}
