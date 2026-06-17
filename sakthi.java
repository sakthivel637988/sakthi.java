package sakthivel;
import java.util.Scanner;
public class sakthi {

	public static void main(String[] args) 
	{
//		int a=1;
//		do
//		{
//			System.out.println(a);
//			a++;
//		
//		}
//		while (a>=10);
		
//		
//		for (int i=1;i<=10;i++)
//				{
//			System.out.println(i);
//			if( i==5)
//			{
//				break;
//			}
//				}
		
		int odd=0;
		int even=0;
		for (int i=1;i<=10;i++) 
		{
			if(i%2!=0)
			{
				odd+=i;
			}
			else
			{
				even+=i;
			}
			
		}
		System.out.println(odd+" "+even);
			
		
	}}
