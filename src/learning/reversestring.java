package learning;

public class reversestring {
	
	
	
	public void reverse()
	{
		StringBuilder name1=new StringBuilder("my name is salahudeen");
		String name2= "my name is abdullah";
		
		System.out.println("name1 is reversed by using STRINGBUILDER");
		System.out.println(name1.reverse());
		
		System.out.println("");
		
		System.out.println("");
		char[] reversename= name2.toCharArray();
		System.out.println("name2 is reversed by using STRING");
		for(int i=reversename.length-1;i>=0;i--)
		{
		System.out.print(reversename[i]);
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversestring s= new reversestring();
		s.reverse();

	}

}
