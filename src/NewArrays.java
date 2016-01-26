import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

public class NewArrays
	{
	private String word;
	static int rows;
	static int columns;
	public NewArrays(String p)
		{
		setWord(p);
		}
	public static void memeLord() throws IOException
		{
		//Scanner stuff = new Scanner(System.in);
		ArrayList<NewArrays> dankMemes = new ArrayList<NewArrays>();
		//System.out.println("How many rows would you like?");
		//4 = stuff.nextInt();
		//System.out.println("How many columns?");
		//columns = stuff.nextInt();
		Runner.w2 = new String[4][4];
		System.out.println(Runner.w2.length);
		Scanner memes = new Scanner(new File("memeThem.txt"));
		for(int i = 0; i < 4 * 4; i++)
			{
			dankMemes.add(new NewArrays(memes.nextLine()));
			}
		for(int i = 0; i < dankMemes.size(); i++)
			{
			String temp = dankMemes.get(i).getWord();
			Runner.checkList.add(new NewArrays(temp));
			}
		for(int r = 0; r < Runner.w2.length; r++)
			{
			for(int c = 0; c < Runner.w2.length; c++)
				{
				int ran = (int) (Math.random() * dankMemes.size());
				Runner.w2[r][c] = dankMemes.get(ran).getWord();
				dankMemes.remove(ran);
				}
			}
		memes.close();
		}
	public static void cakeBoss() throws IOException
		{
		ArrayList<NewArrays> dankCake = new ArrayList<NewArrays>();
		Runner.w2 = new String[4][4];
		Scanner treats = new Scanner(new File("SweetTreat.txt"));
		for(int i = 0; i < 16; i++)
			{
			dankCake.add(new NewArrays(treats.nextLine()));
			}
		for(int i = 0; i < dankCake.size(); i++)
			{
			String temp = dankCake.get(i).getWord();
			Runner.checkList.add(new NewArrays(temp));
			}
		for(int r = 0; r < Runner.w2.length; r++)
			{
			for(int c = 0; c < Runner.w2.length; c++)
				{
				int ran = (int) (Math.random() * dankCake.size());
				Runner.w2[r][c] = dankCake.get(ran).getWord();
				dankCake.remove(ran);
				}
			}
		treats.close();
		}
	public String getWord()
		{
		return word;
		}
	public void setWord(String word)
		{
		this.word = word;
		}
	}
