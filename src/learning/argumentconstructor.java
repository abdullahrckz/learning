package learning;

public class argumentconstructor extends checkoverride{

	
	argumentconstructor(int a,int b)
	{
		this();
		int c=a+b;
		System.out.println("This is Arugument based Constructor");
		System.out.println("Value of A is :" + a);
		System.out.println("Value of B is :" + b);
		System.out.println("Total="+c);
		//overridecheck();
		
	}
	argumentconstructor()
	{
		
		System.out.println(" Hi This is Default Constructor");
		System.out.println("I am Abdullah ");
		System.out.println("");
	}
	

	public void override() {
		
		super.over();
	
	}
	@Override
	public void overridecheck() {
		// TODO Auto-generated method stub
		super.overridecheck();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		argumentconstructor s = new argumentconstructor(5,10);
		checkoverride c=new checkoverride();
		//s.overridecheck();
		s.overridecheck();

	}

}
