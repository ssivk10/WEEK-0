import java.util.Scanner;

public class Recursive6 {
	
	public static boolean contains6(int[] nums, int index) {
		  if(index==nums.length)
		  return false;
		  else if(nums[index]==6) return true;
		  else return contains6(nums,index+1);
		}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = sc.nextInt();
		System.out.println("Enter array: ");
		int [] a = new int [n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter an index: ");
		int index = sc.nextInt();
		String s = sc.nextLine();
		System.out.println(contains6(a, index));
	}

}
