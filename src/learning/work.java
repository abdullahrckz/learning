package learning;
import java.util.HashMap;
import java.util.Map.Entry;
public class work {	
	public void engineering()
	{
	String r ="engineering";
	char[] m =r.toCharArray();
	int i=1,j=1;	
	HashMap<Character,Integer> h=new HashMap<Character,Integer>();
	for(char c : m)
	{
		if(h.containsKey(c))
		{
				int count = h.get(c);
				count++;
				h.put(c,count);
		}
		else{
		h.put(c,1);			
		}	
	}
	//DUPLICATES VALUES
	for(Entry<Character, Integer> n :h.entrySet())
	{ 
		if(n.getValue()>1)
		{			
			if(i==1){
				System.out.println("DUPLICATE VALUES");
				i++;
			}		
			System.out.println("No of Character " +""+n.getKey()+"="+n.getValue());			
		}
	}
	System.out.println("");System.out.println("");
	
	//DUPLICATES VALUES
	for(Entry<Character, Integer> n :h.entrySet())
	{ 
		if(n.getValue()==1)
		{
			if(j==1){
				System.out.println("UNIQUE VALUES");
				i++;			
			}
			System.out.println("No of Character " +""+n.getKey()+"="+n.getValue());
			
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		work eng= new work();
		eng.engineering();

	}
}

	