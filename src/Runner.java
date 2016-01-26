import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Runner
	{
	static String words[][];
	static String w2[][];
	static String cords;
	static Scanner things;
	static String cord;
	static String cords1;
	static String cords2;
	static boolean running;
	static int counter;
	static ArrayList<NewArrays> checkList = new ArrayList<NewArrays>();
	public static void main(String[] args) throws IOException
		{
		things = new Scanner(System.in);
		System.out.println("Hello and get ready to test your memory!!!");
		System.out.println("Please select a theme! We currently have: 1) MemeDream 2) Sweets");
		int choices = things.nextInt();
		counter = 0;
		if(choices == 2)
			{
			NewArrays.cakeBoss();
			}
		else
			{
			NewArrays.memeLord();
			}
		int check = 0;
		int check2 = 0;
		words = new String[4][4];
		System.out.println(words.length);
		for(int row = 0; row < words.length; row++)
			{
			for(int column = 0; column < words[0].length; column++)
				{
				words[row][column] = "     ";
				}
			}
		running = true;
		while(running == true)
			{
			printMap();
			counter++;
			System.out.println(" Input cordinates!");
			CordScanners.cordScanner();
			cords1 = Runner.cord;
			printMap();
			System.out.println("Inport a second cordinate!");
			CordScanners.cordScanner();
			cords2 = Runner.cord;
			printMap();
			for(int i = 0; i < checkList.size(); i++)
				{
				if(words[Integer.parseInt(cords1.substring(0,1))][Integer.parseInt(cords1.substring(1,2)) - 1].contains(checkList.get(i).getWord()))
					{
					check = i;
					}
				if(words[Integer.parseInt(cords2.substring(0,1))][Integer.parseInt(cords2.substring(1,2)) - 1].contains(checkList.get(i).getWord()))
					{
					check2 = i;
					}
				}
			if(check % 2 == 0)
				{
				if(check2 == check + 1 || check2 == check)
					{
					System.out.println("Correct!");
					}
				else
					{
					printMap();
					System.out.println("WRONG!!!!");
					try
						{
						TimeUnit.SECONDS.sleep(2);
						} 
					catch (InterruptedException e)
						{
						e.printStackTrace();
						}
					CordScanners.Remover();
					}
				}
			else
				{
				if(check2 == check - 1 || check2 == check)
					{
					System.out.println("Correct!");
					}
				else
					{
					printMap();
					System.out.println("WRONG!!!!");
					try
						{
						TimeUnit.SECONDS.sleep(2);
						} 
					catch (InterruptedException e)
						{
						e.printStackTrace();
						}
					CordScanners.Remover();
					}
				}
			CordScanners.checkForTheWin();
			}
		things.close();
		}
	public static void printMap()
		{
		System.out.println("      1       2       3       4");
		System.out.println("  +-------+-------+-------+-------+");
		System.out.println("A | " + words[0][0] + " | " + words[0][1] + " | " + words[0][2] + " | " + words[0][3] + " |");
		System.out.println("  +-------+-------+-------+-------+");
		System.out.println("B | " + words[1][0] + " | " + words[1][1] + " | " + words[1][2] + " | " + words[1][3] + " |");
		System.out.println("  +-------+-------+-------+-------+");
		System.out.println("C | " + words[2][0] + " | " + words[2][1] + " | " + words[2][2] + " | " + words[2][3] + " |");
		System.out.println("  +-------+-------+-------+-------+");
		System.out.println("D | " + words[3][0] + " | " + words[3][1] + " | " + words[3][2] + " | " + words[3][3] + " |");
		System.out.println("  +-------+-------+-------+-------+");
		}
	}