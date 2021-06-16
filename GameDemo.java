/**1)Create abstract base class "Game" with 'play()' as abstract method.
From that derive following classes.
Football,Cricket,Tennis
Create a class called as "GamesDemo" (public class)
inside a main method create an array of "Game" (3 elements)
Store objects of Football,Cricket and Tennis respectively.
Now traverse the array and call that Cricket's play() method.
**/

abstract class Game 
{
	abstract void play();
}

class Cricket extends Game 
{
	public void play ()
	{
		System.out.println("Play Cricket");
	}
}

class Football extends Game 
{
	public void play ()
	{
		System.out.println("Play Football");
	}
}

class Tennis extends Game 
{
	public void play ()
	{
		System.out.println("Play Tennis");
	}
}


public class GameDemo 
{
		public static void main(String args[]) 
		{
		Game arr[] = new Game[3];

		arr[0] = new Football();
		arr[1] = new Cricket();
		arr[2] = new Tennis();
		
			for(int i=0;i<=arr.length;i++)
			{
				if(arr[i] instanceof Cricket){
				
					arr[i].play();
					break;
				}				
			}
		}
}