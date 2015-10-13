//ASSIGNMENT #2


public class SuperHero extends Hero
{
	//PROPERTIES++++++++++++++++++++++++++++++++++++++++++++++
	private String superPowers[] = new String[3];
	
	//CONSTRUCTOR+++++++++++++++++++++++++++++++++++++++++++++
	public SuperHero(String name)
	{
		super(name);
		this.generateRandomPowers();
		
	}
	
	//PRIVATE METHODS++++++++++++++++++++++++++++++++++++++++++
	//this method should generate 3 out of 6 superPowers
	// 1. Super Speed
	// 2. Super Strength
	// 3. Body Armor
	// 4. Flight
	// 5. Fire Generation
	// 6. Weather Control
	//each power should be selected once
	//HINT: create a loop that picks superPower 3 times
	// check that power is not repeating itself 
	
	public void generateRandomPowers()
	{
		String temp [] = {"Super Speed" , "Super Strength" , "Body Armor" , "Flight" , "Fire Generation" , "Weather Control"}; //create a temp array with the superPowers to choose from
		int range = 5;
		int setValue = 0;// the cell number value of the superPowers[] for power to be inserted to
		for(int i = 0 ; i < 3 ; i++)
		{
			int pickPower = (int)(Math.random()*range);
			if(temp[pickPower] != "") //if value inside temp[] is not "" - add power to superPowers[]
			{
				superPowers[setValue] = temp[pickPower];
				setValue++;
				temp[pickPower] = "";
			}
			else i--; //if stepped on "" while generating random pick, make another loop iteration
		}
	}
	
	//PUBLIC METHODS++++++++++++++++++++++++++++++++++++++++++
	
	
	//a method that will go to the superPowers array and display
	//the superPowers that stored inside
	public void showPowers()
	{
		for(int i = 0 ; i < 3; i++)
		{
			System.out.println("The" + i+1 + "Super Power is: " + superPowers[i]);
		}
	}
	
	//implement a main method , create superHero
	//call the showPowers()
	//call fight() that is inherited from Hero
}
