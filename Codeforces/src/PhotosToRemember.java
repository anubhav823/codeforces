import java.util.Scanner;

public class PhotosToRemember {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[][]=new int[n][2];
	int sum=0;
	int first=0;
	int second=0;
	int firstPos=0;
	int secondPos=0;
	for(int i=0;i<n;i++)
	{
		arr[i][0]=sc.nextInt();
		sum+=arr[i][0];
		arr[i][1]=sc.nextInt();
		if(arr[i][1]>first) 
        { 
            second = first; 
            secondPos=firstPos;
            first = arr[i][1]; 
            firstPos=i;
        } 
	}
	System.out.println(second+" "+secondPos);
	
}
}
