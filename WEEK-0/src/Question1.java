import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		double x1,x2,y1,y2,x3,y3,x4,y4;
		double b1,b2,m1,m2,x,y;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter start points of L1: ");
		x1=s.nextInt();
		y1=s.nextInt();
		System.out.println("Enter end points of L1: ");
		x2=s.nextInt();
		y2=s.nextInt();
		System.out.println("Enter start points of L2: ");
		x3=s.nextInt();
		y3=s.nextInt();
		System.out.println("Enter end points of L2: ");
		x4=s.nextInt();
		y4=s.nextInt();
		m1=(y2-y1)/(x2-x1);//slope of line 1
		m2=(y4-y3)/(x4-x3);//slope of line 2
		if(m1==m2)//Parallel
			System.out.println("Does not intersect.");
		else
		{
			b1=y1-(m1*x1);//intercept of line 1
			b2=y3-(m2*x3);//intercept of line 2
			x=(b2-b1)/(m1-m2);//since x and y for both lines must be same for an intersection
			y=(m1*x)+b1;
			if(x>=Math.min(x1,  x2) && x<=Math.max(x1, x2) && x>=Math.min(x3,  x4) && x<=Math.max(x3, x4) &&
					y>=Math.min(y1, y2) && y<=Math.max(y1,  y2) && y>=Math.min(y3, y4) && y<=Math.max(y3,  y4))
				System.out.println("Intersects.");
			else
				System.out.println("Does not intersect");
		}
		
	}

	
}
