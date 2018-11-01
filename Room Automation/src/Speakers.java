

public class Speakers extends Gadgets{

	public Speakers()
	{
		turnon = 0;
	}
	
	@Override
	public void turnOn() {
		if(turnon == 1)
		{
			System.out.println("television already on");
		}
		else
		{
			System.out.println("television turned off");
			turnon = 0;
		}
		
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		if(turnon == 0)
		{
			System.out.println("television turned on");
			turnon = 1;
		}
		else
		{
			System.out.println("television already off");
		}
		
	}
		
	
}
