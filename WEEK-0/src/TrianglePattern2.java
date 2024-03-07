import java.util.Scanner;
public class TrianglePattern2 {
	
	static void v(int x, int y, int t1, int n, int[][] a)
	{
		for(int j = y-1;j>n-x;j--)
		{
			a[x][j]=t1++;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter: ");
		int n = s.nextInt();
		int [][] a = new int [n][n];
		int i=0, j=0, c=1, x=1,t,d=0;
		int max=(n*(n+1))/2;
		
		t=n;
		while(c<=max)
		{
			a[i][j] = c++;

			if(x==t)
			{
				x=0;
				t--;
				if(d==2)
					d=0; 
				else 
					d++; 
				
			}
			switch(d){
			case 0:
				i++;
				j++;
				break;
			case 1: i--; break;
			case 2: j--; break;
			}
			x++;
		}
		//Output
		for(i=0;i<n;i++)
		{
			System.out.println();
			for(j=0;j<n;j++)
			{
				if(j>=i)
					System.out.print("  "+a[i][j]+"  ");
				else System.out.print("     ");
			}
		}
	}

}
