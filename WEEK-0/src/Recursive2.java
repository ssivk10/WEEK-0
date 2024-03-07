import java.util.Scanner;

public class Recursive2 {
	
	public static int hi(String str) {
		  if(str.length()<=1)return 0;
		  if(str.length()==2 && str.equals("hi")) return 1;
		  if( str.length()>=3 && str.substring(0,2).equals("hi")) return 1+hi(str.substring(2));
		  return hi(str.substring(1));
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		System.out.println(hi(s));
	}

}
