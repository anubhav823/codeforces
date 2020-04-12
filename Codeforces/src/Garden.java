import java.util.Scanner;

public class Garden {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int x1=sc.nextInt();
	int y1=sc.nextInt();
	int x2=sc.nextInt();
	int y2=sc.nextInt();
	//check slope
	int deno=x2-x1;
	//int x1, y1, x2, y2;
    if (x1 != x2 && y1 != y2 && Math.abs(x1 - x2) != Math.abs(y1 - y2))
        System.out.println("-1");
    else if (x1 == x2)
        System.out.println(x1 + Math.abs(y1 - y2)+" "+y1+" "+(x2 + Math.abs(y1 - y2))+" "+y2);
    else if (y1 == y2)
        System.out.println(x1+" "+(y1 + Math.abs(x1 - x2))+" "+x2+" "+(y2 + Math.abs(x1 - x2)));
    else
        System.out.println(x1+" "+y2+" "+x2+" "+y1);
}
}
