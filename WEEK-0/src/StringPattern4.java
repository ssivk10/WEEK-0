import java.util.Scanner;
public class StringPattern4 {

	public static void main(String[] args) {
		int d=0, t=0, i=0,j=0, ch=0, x=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = s.nextLine();
		System.out.println("Enter rows: ");
		int n = s.nextInt();
		char[][] a = new char[n][str.length()/2+1];
		t=n;
		while(ch<str.length())
		{
			System.out.println("Hello "+i+" "+j+" X "+x+ " T "+t);
			System.out.println("d: "+d);
			a[i][j]=str.charAt(ch++);
			
		
			if(x==t)
			{
				x=1;
				if(d==0) 
				{
					d=1; 
				 //t=n-1;
				
				}
				else {d=0; t=n; i=0; }
			}
			
			switch(d)
			{
			case 0: i++;break;
			case 1: i--;j++;break;
			}
			
			
			x++;
		}
		//////////////////////////////////////////////
		for(i=0;i<n;i++)
		{
			System.out.println();
			for(j=0;j<str.length()/2+1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}

}
