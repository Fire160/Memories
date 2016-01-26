
public class BoardMaker
	{

	public static void printBoard()
		{
		for(int i = 0; i < Runner.words.length; i++)
			{
			for(int c = 0; c < Runner.words[0].length; c++)
				{
				if(i % (Runner.words.length + 1) == Runner.words.length)
					{
					System.out.println("| " + Runner.words[i][c] + " | ");
					}
				else
					{
					System.out.print("| " + Runner.words[i][c] + " ");
					}
				}
			for(int b = 0; b < Runner.words.length; b++)
				{
				if(i % (b + 1) == b)
					{
					System.out.println("+-------+");
					}
				else
					{
					System.out.print("+-------+");
					}
				}
			}
		}
	}
