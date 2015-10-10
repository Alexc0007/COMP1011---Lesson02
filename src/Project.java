
public class Project
{

	public static void main(String[] args)
	{
		//instantiate Hero
		StrongMan hero = new StrongMan("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		//instantiate Villain
		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
		
		//instantiate Vigilante
		
		Vigilante vigilante = new Vigilante("Ms. Savage");
		vigilante.run();
		vigilante.steals();
		vigilante.dealJustice();
		vigilante.showAbilities();
	
		//STOPPED AT END OF LESSON3 PART1 - assignment done!
	}

}
