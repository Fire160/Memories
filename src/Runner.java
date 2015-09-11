import java.util.ArrayList;
import java.util.Scanner;

public class Runner
	{
	static String words[][];
	static String w2[][];
	static String cords;
	static Scanner things;
	static String cords1;
	static String cords2;
	static ArrayList<NewArrays> checkList = new ArrayList<NewArrays>();
	public static void main(String[] args)
		{
		NewArrays.memeLord();
		things = new Scanner(System.in);
		words = new String[4][4];
		for(int row = 0; row < words.length; row++)
			{
			for(int column = 0; column < words[0].length; column++)
				{
				words[row][column] = "     ";
				}
			}
		boolean running = true;
		while(running == true)
			{
			printMap();
			System.out.println(" Input cordinates!");
			cordScanner();
			cords1 = Runner.cords;
			printMap();
			System.out.println("Inport a second cordinate!");
			cordScanner();
			cords2 = Runner.cords;
			if(cords1)
				{
				System.out.println("Correct!");
				}
			else
				{
				System.out.println("WRONG!!!!");
				CordScanners.Remover();
				}
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
	public static void cordScanner()
		{
		cords = things.nextLine().toLowerCase();
		if(cords.contains("a"))
			{
			int temp = Integer.parseInt(cords.substring(1,2)) - 1;
			words[0][temp] = w2[0][temp];
			}
		if(cords.contains("b"))
			{
			int temp = Integer.parseInt(cords.substring(1,2)) - 1;
			words[1][temp] = w2[1][temp];
			}
		if(cords.contains("c"))
			{
			int temp = Integer.parseInt(cords.substring(1,2)) - 1;
			words[2][temp] = w2[2][temp];
			}
		if(cords.contains("d"))
			{
			int temp = Integer.parseInt(cords.substring(1,2)) - 1;
			words[3][temp] = w2[3][temp];
			}
		}
	}
