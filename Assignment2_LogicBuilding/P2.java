class P2
 {
	public static void main(String [] args)
	{
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
 }
 
	/* output
		A
		A B
		A B C
		A B C D
		A B C D E
	*/
// one more comment