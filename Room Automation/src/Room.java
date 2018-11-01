
public class Room {
	
	static int num = 0; 
	Gadgets[] g1 = new Gadgets[10];
	
	public void AddElements(String s)
	{
		int num2 = num;
		g1[num2] =  GadgetFactory.decide(s);		
	}
	
}

