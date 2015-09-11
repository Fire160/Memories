import java.util.ArrayList;

public class NewArrays
	{
	private String word;
	public NewArrays(String p)
		{
		word = p;
		}
	public static void memeLord()
		{
		ArrayList<NewArrays> dankMemes = new ArrayList<NewArrays>();
		Runner.w2 = new String[4][4];
		dankMemes.add(new NewArrays("doge "));
		dankMemes.add(new NewArrays("SoWow"));
		dankMemes.add(new NewArrays("Shia "));
		dankMemes.add(new NewArrays("LeBuf"));
		dankMemes.add(new NewArrays("skrub"));
		dankMemes.add(new NewArrays("#Rekt"));
		dankMemes.add(new NewArrays("Sanic"));
		dankMemes.add(new NewArrays("Fast "));
		dankMemes.add(new NewArrays("Spood"));
		dankMemes.add(new NewArrays("erMan"));
		dankMemes.add(new NewArrays("Just "));
		dankMemes.add(new NewArrays("Do It"));
		dankMemes.add(new NewArrays("Dorit"));
		dankMemes.add(new NewArrays("o MLG"));
		dankMemes.add(new NewArrays("Troll"));
		dankMemes.add(new NewArrays("lolol"));
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
		}
	private String getWord()
		{
		return word;
		}
	public static void cakeMastah()
		{
		
		}
	}
