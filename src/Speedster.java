
public class Speedster extends Hero
{
	//CONSTRUCTOR*********************************************
	public Speedster(String name)
	{
		super(name);
		boostSpeed();
	}
	
	//PRIVATE METHODS****************************************
	private void boostSpeed()
	{
		_speed +=50;
		if(_speed >100)
		{
			_speed = 100;
		}
	}

}
