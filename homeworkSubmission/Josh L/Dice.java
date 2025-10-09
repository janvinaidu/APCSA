public class Dice
{
    private int numSides;
    private int faceValue;
    
    public Dice()
    {
        numSides = 6;
        faceValue = 1;
        
    }
    public Dice(int sides)
    {
        numSides = sides;
        faceValue = 1;
    }
    public int getNumSides()
    {
        return numSides;
    }
    public int getFaceValue()
    {
        return faceValue;
    }
    public int roll()
    {
        faceValue =
            (int) (Math.random() * numSides) + 1;
        return faceValue;
    }
    
    public String toString()
    {
        return "" + faceValue;
        
    }
    
    
}
