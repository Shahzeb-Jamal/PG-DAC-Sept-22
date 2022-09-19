class P10
 {
	public static void main(String [] args)
	{
		
		int alp= 64;
		for(int i=5;i>=1;i--)
		{
			
			
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=5;j++)
			{
				
				System.out.print((char)(alp+j)+" ");
				
				
			}
			
			System.out.println();
		}
	}
 } 
 
 /*
    E
   D E
  C D E
 B C D E
A B C D E
*/
