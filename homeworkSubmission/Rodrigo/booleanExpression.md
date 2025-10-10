problem 1:

public class CigarPartylol 
{
	private boolean partyCanBeDone;
	public boolean cigarParty(int cigars, boolean isWeekend)
	{
		if ((cigars >= 40 && cigars <= 60) && (isWeekend == true))
		{
			return partyCanBeDone = true;
		}
		else 
		{
			return partyCanBeDone = false;
		}
	}
	public String toString() 
	{
		return "Can the party be done? " + partyCanBeDone;
	}
	public static void main(String [] args) 
	{
		CigarPartylol a1 = new CigarPartylol();
		System.out.println("Can the party be done? " + a1.cigarParty(20, true));
	}
}

problem 2:

public class fashion 
{
	private int fashionScore;
	public int dateFashion(int you, int date)
	{
		if ((you <= 2) || (date <= 2))
		{
			return fashionScore = 0;
		}
		else if ((you >= 8) || (date >= 8)) 
		{ 
			return fashionScore = 2;
		}
		else
		{
			return fashionScore = 1;
		}
	}
	public static void main(String [] args) 
	{
		fashion a2 = new fashion();
		System.out.println("You and your date's fashion score is " + a2.dateFashion(1,8));
	}
}

problem 3:

public class squirrel 
{
	private boolean squirrelCanPlay;
	public boolean squirrelPlay(int temp, boolean isSummer)
	{
		if (isSummer == true)
		{
			if ((temp >= 60) && (temp <= 100))
			{
				return squirrelCanPlay = true;
			}
			else
			{
				return squirrelCanPlay = false;
			}
		}
		else
		{
			if ((temp >= 60) && (temp <= 90))
			{
				return squirrelCanPlay = true;
			}
			else
			{
				return squirrelCanPlay = false;
			}
		}
	}
	public static void main(String [] args) 
	{
		squirrel a3 = new squirrel();
		System.out.println("Can the squirrel play outside? " + a3.squirrelPlay(75, true));
	}
}

problem 4:

public class speed 
{
	public int caughtSpeeding(int speed, boolean isBirthday)
	{
		if (isBirthday == true)
		{
			if ((speed <= 65))
			{
				return 0;
			}
			else if ((speed >= 66) || (speed <= 85))
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
		else
		{
			if ((speed <= 60))
			{
				return 0;
			}
			else if ((speed >= 61) || (speed <= 80))
			{
				return 1;
			}
			else
			{
				return 2;
			}
		}
	}
	public static void main(String [] args) 
	{
		speed a4 = new speed();
		System.out.println("Speeding ticket size: " + a4.caughtSpeeding(83, true));
	}
}

problem 5:

public class bricks 
	{
    public boolean makeBricks(int small, int big, int goal) {
        int maxBig = goal / 5;
        int useBig = Math.min(big, maxBig);
        int remaining = goal - (useBig * 5);
        return remaining <= small;
    }
    public static void main(String[] args) {
        bricks a5 = new bricks();
        System.out.println("Possible to make the goal? " + a5.makeBricks(83, 64, 100));
    }
}
