import java.util.ArrayList;
import java.util.Scanner;

public class Cards {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int Sereja=0;
	int other=0;
	ArrayList<Integer> arr=new ArrayList<>();
	for(int i=0;i<a;i++)
	{
		arr.add(sc.nextInt());
	}
	int i=0;
	while(arr.size()-i-1>=0){
		if(arr.size()==1)
		{
			Sereja+=arr.get(0);
			break;
		}
		else{
		if(arr.get(0)>arr.get(arr.size()-i-1))
		{
			Sereja+=arr.get(i);
			arr.remove(0);
		}
		else
			{
			Sereja+=arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
			}
		if(arr.get(0)>arr.get(arr.size()-1))
		{
			other+=arr.get(0);
			arr.remove(0);
			}
		else
		{
			other+=arr.get(arr.size()-1);
			arr.remove(arr.size()-1);
			}
		}
	}
	
	System.out.println(Sereja+" "+other);
	}
}

