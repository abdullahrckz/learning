package learning;

public class arraysort {
	public void sorting()
	{
	int [] a={6,4,9,3,1,5,8};
	int c=0;

	for(int i=0;i<a.length;i++)
	{
		
		for(int j=i+1;j<a.length;j++)
		{
		
			if(a[i]>a[j])
				{
					c =a[i];
					a[i]=a[j];
					a[j]=c;
				}				
		}
	}
	for(int d:a)
		{
			System.out.print("  "+d);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraysort s= new arraysort();
		s.sorting();

	}

}
