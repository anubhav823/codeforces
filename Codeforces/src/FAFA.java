		import java.util.Scanner;
		
		public class FAFA {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int count=1;
			for(int i=2;i<=a/2;i++)
			{
				if((a-i)%i==0)
					count++;
			}
			
			System.out.println(count);
		}
		}
