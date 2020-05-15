import java.util.Scanner;

public final class StringConstruct {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++)
	{
		StringBuilder sb=new StringBuilder();
		int a=sc.nextInt();
		int b=sc.nextInt();
		String s="";
		for(int j=0;j<s.length()-a-1;j++)
		{
			
		}
				
	}
}
public static int uniChar(String input) {
    boolean[] isItThere = new boolean[Character.MAX_VALUE];
    for (int i = 0; i < input.length(); i++) {
        isItThere[input.charAt(i)] = true;
    }

    int count = 0;
    for (int i = 0; i < isItThere.length; i++) {
        if (isItThere[i] == true){
            count++;
        }
    }

    return count;
}
}
