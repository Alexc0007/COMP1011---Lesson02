

public class Hero extends Entity 
{
	//INSTANCE VARIABLES+++++++++++++++++++++++++++++++++
	protected int _strength;
	protected int _speed;
	private int _health;
	public String _name;
	
	
	//GETTERS SECTOR++++++++++++++++++++++++++++++++++++++
	public int getStrength() {
		return _strength;
	}
	
	public int getSpeed() {
		return _speed;
	}


	public int getHealth() {
		return _health;
	}
	
	//CONSTRUCTOR++++++++++++++++++++++++++++++++++++++++
	public Hero(String name)
	{
		_name = name;
		generateAbilities();
	}
	
	
	//PRIVATE METHODS++++++++++++++++++++++++++++++++++++
	private void generateAbilities()
	{
		_strength = (int)(Math.random()*100+1); //generate a random number between 1 and 100 for all abilities
		_speed = (int)(Math.random()*100+1);
		_health = (int)(Math.random()*100+1);
	}
	
	
	//PUBLIC METHODS+++++++++++++++++++++++++++++++++++++
	public void showAbilities() // this is the show method requested in the assignment
	{
		System.out.println("*******************************");
		System.out.println("Strength: "+ _strength);
		System.out.println("Speed: "+ _speed);
		System.out.println("health: "+ _health);
		System.out.println("*******************************");

	}
	
	
	public void fight()//the method will call the hitAttempt method - if hitAttempt is true - then will call the hitDamage method and damage will be displayed on console
	{
		System.out.println(_name + " is Fighting");
		if(this.hitAttempt())
			System.out.println("the damage done is: " +this.hitDamage());
	}
	
	public void run()
	{
		System.out.println(_name + " is Running");
	}

	private boolean hitAttempt() //will hit 20% of the time
	{
		int random = (int)(Math.random()*100)+1;
		if(random <= 20)
			return true; //hit successfully
		return false; //failed to hit
	}
	
	private int hitDamage()
	{
		//calculating the range: (max - min)+1
		int RANGE = 6; //calculated range
		int damage = _strength*((int)(Math.random()*RANGE)+1); //the damage output
		return damage;
	}
	
	
	

	






	

	

	
}
