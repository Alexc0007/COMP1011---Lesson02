
public class StrongMan extends Hero 
{
	//CONSTRUCTOR+++++++++++++++++++++++++++++++++++++++++++++
	public StrongMan(String name)
	{
		super(name);
		boostStrength();
	}

	
	private void boostStrength()
	{
		_strength +=50;
		if(_strength >100)
		{
			_strength = 100;
		}
	}
	
	
	
	
}
