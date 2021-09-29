package learning;

public class twodimensionalarray {
	
	//int[][] TDA= new int [5][5];
	public void twodimensionalarray()
	{
	
	int[][] twodim={{10,11,12,13,14},{20,21,22,23,24},
					{30,31,32,33,34},{40,41,42,43,44},
					{50,51,52,53,54}};
	int i,j;
	for(i=0;i<5;i++)
	{
		for(j=0;j<5;j++)
		{
			System.out.print(" " + twodim[i][j]);
			
		}
		System.out.println("");
	}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twodimensionalarray s= new twodimensionalarray();
		s.twodimensionalarray();

	}

}
