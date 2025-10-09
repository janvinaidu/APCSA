public class CodingLab 
{

	public boolean cigarParty(int cigars, boolean isWeekend)
	{
		if(isWeekend)
		{
			if(cigars >= 40)
      {
        return true;
      }
		}
    return false;
		else if(cigars >= 40 && cigars <= 60)
		{
			return true;
		}
    else
    {
      return false;
    }
		
	}
	
	public int dateFashion(int you, int date)
	{
		if(you <= 2 || date <= 2)
		{
			return 0;
		}
		else if(you >= 8 || date >= 8)
		{
			return 2;
		}
		else
		{
			return 1;
		}
	}
	
	public boolean squirrelPlay(int temp, boolean isSummer)
	{
		if(isSummer)
		{
			if(temp >= 60 && temp <= 100)
      {
        return true;
      }
		}
    return false;
		else if(temp >= 60 && temp <= 90)
		{
			return true;
		}
    else
    {
      return false
    }
	}
	
	public int caughtSpeeding(int speed, boolean isBirthday)
	{
		if(isBirthday)
		{
			speed -= 5;
		}
		if(speed <= 60)
		{
			return 0;
		}
		else if(speed <= 80)
		{
			return 1;
		}
		else
		{
			return 2;
		}
	}
	
	public boolean makeBricks(int small, int big, int goal)
	{
		int maxBricks = goal / 5;
		int bigUsed = Math.min(big, maxBricks);
		int leftOver = goal - bigUsed * 5;
		return small >= leftOver;
	}
	
	public String makeOutWord(String out, String word)
	{
		String first = out.substring(0, 2);
		String second = out.substring(2);
		return first + word + second;
	}
	
	public String withoutEnd(String str)
	{
		return str.substring(1, str.length() - 1);
	}
	
	public boolean hasBad(String str)
	{
		if(str.length() >= 3)
		{
			if(str.substring(0, 3).equals("bad") || (str.length() > 3 && str.substring(1,4).equals("bad")))
			{
				return true;
			}
		}
		return false;
	}

}
