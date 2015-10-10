
public class Villain extends Hero 
{
	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++
	public Villain(String name) 
	{
		super(name);
		
	}

	//PUBLIC METHODS*********************************
	public void steals()
	{
		System.out.println(_name + " is Stealing");
	}
	
	public void kills()
	{
		System.out.println(_name + " is goin' around Killing");
	}

}
