import java.util.Scanner;

public class CubeStack {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int cubes=0;
	int level=0;
	for(int i=1;i<=n;i++)
	{
		cubes=cubes+i;
		if((n-cubes)>=0)
		{n-=cubes;
			level++;
		}
	}
	System.out.println(level);
}
}

