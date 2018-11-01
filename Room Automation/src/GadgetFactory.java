
public class GadgetFactory {
	static String s1 = "Television";
	static String s2 = "Speakers";
 	
	
	public static Gadgets decide(String s)
	{
		if(s.equals(s1))
		{
			return new Television();
		}
		
		if(s.equals(s2))
		{
			return new Speakers();
		}
		
		return new Gadgets();
	}
}
