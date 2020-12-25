package DLT;

public class Permutation 
{

	
public static void main(String[] args) 

{	
	String str="xyz";
	int n=str.length();
	System.out.println("Total length -> "+n);
	permute(str, 0, n-1);	
	

}
public static String swap(String a, int i,int j)
{

	char[] ch = a.toCharArray();
	char temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;	
//	System.out.println("->"+String.valueOf(ch));	
	return String.valueOf(ch);
}

public static void permute(String str, int l,int r)
{	
	if(l==r)
		System.out.println(str);
	else
	{
		for (int i = l; i <=r; i++) 
		{
			str=swap(str, l, i);
			permute(str, l+1, r);
		}
	}
	
}
}
