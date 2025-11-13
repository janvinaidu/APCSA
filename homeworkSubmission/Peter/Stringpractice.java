public class StringPractice 
{
    public String makeOutWord(String out, String word) 
    {
        String front = out.substring(0, 2);
        String back = out.substring(2);
        return front + word + back;
    }


    public String withoutEnd(String str) 
    {
        return str.substring(1, str.length() - 1);
    }

    
    public boolean hasBad(String str)
    {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) 
        {
            return true;
        } 
        else if (str.length() >= 4 && str.substring(1, 4).equals("bad"))
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}
