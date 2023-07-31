package kvaluentTest;

import java.util.*;

public class Q4_stepstoDestination {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,max=0, maxi=0;
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int count=0;
		int[] arr = new int[len];
		for(i=0;i<len;i++)
		{
			arr[i] = sc.nextInt();
		}
		i = 0;
		{ max = 0;
			for(j=i;j<arr[i];j++)
			{
				if(max<arr[j])
				{
					max = arr[j];
				}
			}
			i+=max;
			count++;

	}
		System.out.println(count);}}
