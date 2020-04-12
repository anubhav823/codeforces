import java.util.Scanner;

public class Zoma {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	String s=sc.next();
	int leftCount=0;
	int rightCount=0;
	for(int i=0;i<t;i++)
	{
		if(s.charAt(i)==('L'))
			leftCount++;
		else
			rightCount++;
	}
	System.out.println(leftCount+rightCount+1);
}
}
