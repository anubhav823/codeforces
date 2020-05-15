import java.util.Scanner;

public class FloodFill {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	int image[][]=new int[N][M];
	int sr=sc.nextInt();
	int s=sc.nextInt();
	int newColor=2;
	
}
static void floodFillUtil(int image[][], int sr,int s,int prevColor,int newColor)
{
	if(sr<0|| sr>=image.length||s<0||s>image[0].length)
		return;
	if(image[sr][s]!=prevColor)
		return;
	
	for(int i=sr+1;i<image.length;i++)
	{
		for(int j=s;j<image[0].length;j++)
			image[i][j]=newColor;
	}
	for(int i=sr-1;i>=0;i--)
	{
		for(int j=s+1;j<image[0].length;j++)
			image[i][j]=newColor;
	}
	for(int i=sr;i<image.length;i++)
	{
		for(int j=s+1;j>=0;j--)
			image[i][j]=newColor;
	}
	for(int i=sr;i>=0;i--)
	{
		for(int j=s-1;j>=0;j--)
			image[i][j]=newColor;
	}
}
static int[][] floodFill(int image[][], int sr, int s, int newColor)
{
	int prevColor=image[sr][s];
	floodFillUtil(image, sr,s, prevColor,newColor);
	return image;
}
}
