package array_programs;
class array_formation_zigzag 
{
	public static void main(String[] args) 
	{
	int a[]={1,2,3,4,5,6,7};
	int b[]={8,9,10,11,12};
	int alen=a.length;
	int blen=b.length;
	int c[]=new int [alen+blen];
	int n=alen+blen;
	if(blen<alen)
		{
		int k=0;
		for (int i=0;i<=blen-1 ;i++ )
		{
			c[k]=a[i];
			k++;
			
			c[k]=b[i];
			k++;
		}
		for (int j=blen;j<=alen-1 ;j++ )
		{
			c[k]=a[j];
			k++;
		}
	}

	else if (blen>alen)
	{

         int k=0;
		for (int i=0;i<=alen-1 ;i++ )
		{
			c[k]=a[i];
			k++;
			
			c[k]=b[i];
			k++;
		}
		for (int j=alen;j<=blen-1 ;j++ )
		{
			c[k]=b[j];
			k++;
		}
	}
	else
		{
			int k=0;
			for (int i=0;i<alen-1 ;i++ )
			{
				
			c[k]=a[i];
			k++;
			
			c[k]=b[i];
			k++;

			}

		}
			for (int i=0;i<=n-1;i++ )
			{
				System.out.print(c[i]+" ");
			}
		}
}
