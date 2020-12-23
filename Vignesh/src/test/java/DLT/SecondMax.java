package DLT;

public class SecondMax {

	public static void main(String[] args) 
	
	{
		int[] a= {2,65,98,74,55,5,6,6,4,100,150};
		int max=a[0],secondMax=a[1];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]>max)
			{
				secondMax=max;
				max=a[i];				
			}
			else if(a[i]>secondMax)
			{
				secondMax=a[i];
			}
		}
		System.out.println("Second max in the ->"+secondMax);
	}
}
