import java.util.Arrays;
import java.util.Scanner;

public class Patrick {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int d[]=new int[3];
	for(int i=0;i<3;i++)
		d[i]=sc.nextInt();
	Arrays.sort(d);
	if(d[0]+d[1]<=d[2])
		System.out.println(2*(d[0]+d[1]));
	else
		System.out.println(d[0]+d[1]+d[2]);
}
}
