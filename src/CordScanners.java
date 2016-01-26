import java.util.Scanner;

public class CordScanners
	{
	public static void Remover()
		{
		Runner.words[Integer.parseInt(Runner.cords1.substring(0,1)) - 1][Integer.parseInt(Runner.cords1.substring(1,2)) - 1] = "     ";
		Runner.words[Integer.parseInt(Runner.cords2.substring(0,1)) - 1][Integer.parseInt(Runner.cords2.substring(1,2)) - 1] = "     ";
		}
	public static void cordScanner()
		{
		boolean guess = false;
		Scanner stuff = new Scanner(System.in);
		while(guess == false)
			{
			Runner.cords = stuff.nextLine().toLowerCase();
			if(Runner.cords.length() < 2)
				{
				System.out.println("You need cordinates you idiot!");
				}
			else
				{
				int temp = Integer.parseInt(Runner.cords.substring(0,1)) - 1;
				int temp2 = Integer.parseInt(Runner.cords.substring(1,2)) - 1;
				Runner.words[temp][temp2] = Runner.w2[temp][temp2];
				Runner.cord = Runner.cords.substring(0,2);
				guess = true;
				}
			}
		}
	public static void checkForTheWin()
		{
		for(int r = 0; r < Runner.words.length; r++)
			{
			for(int c = 0; c < Runner.words[0].length; c++)
				{
				if(Runner.words[r][c].equals("     "))
					{
					r = Runner.words.length;
					c = Runner.words[0].length;
					}
				if(r == Runner.words.length - 1 && c == Runner.words[0].length - 1)
					{
					Runner.running = false;
					System.out.println("Yay, you won! But was it really worth it?");
					System.out.println("You did it in " + Runner.counter + " moves!");
					}
				}
			}
		}
	}
