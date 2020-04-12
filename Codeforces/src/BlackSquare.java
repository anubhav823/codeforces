import java.util.Scanner;

public class BlackSquare {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[4];
	int sum=0;
	for(int i=0;i<4;i++)
		arr[i]=sc.nextInt();
	String a=sc.next();
	int[] results = new int[a.length()];
	for (int i = 0; i <results.length; i++) {
		{
			results[i] = Character.digit(a.charAt(i), 10);
			if(results[i]==1)
				sum+=arr[0];
			else if(results[i]==2)
				sum+=arr[1];
			else if(results[i]==3)
				sum+=arr[2];
			else if(results[i]==4)
				sum+=arr[3];
			}
	}
	System.out.println(sum);
}
}
