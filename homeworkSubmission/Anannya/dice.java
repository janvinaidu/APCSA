(#1) 
package castingPractice;

public class Point 
{
	private int x; 
	private int y;
	
	public Point(int pointX,int pointY)
	{
		x = pointX; 
		y = pointY; 			
	}
	public int getX()
	{
		return x; 
	}
	public int getY()
	{
		return y; 
	}
	
	public double translatePoint(Point new)
	{
		int dx = new.getX() - x; 
		int dy = new.getY() - y; 
		return Math.sqrt(dx * dx + dy * dy); 
	}
	
	
}

(#2)

public class Dice {
    public static void main(String[] args) 
{
        Dice dice1 = new Dice();
        Dice dice12 = new Dice();

        int roll1 = dice1.roll();
        int roll2 = dice2.roll();

        System.out.println("Dice 1: " + roll1);
        System.out.println("Dice 2: " + roll2);
        System.out.println("Sum: " + (roll1 + roll2));
    }
}

(#3) 

import java.util.Scanner;

public class StringPractice
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        String string1 = k.nextLine();
        
        str = "\"" + str + "\"";
        
        System.out.println(string1);
    }
}

Input : CS Rocks! (Worked!) 

(#4) 

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) 
{
        Scanner k = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        
        String string = k.nextLine();
        
        int middle = string.length() / 2;
        
        System.out.println("The middle character of " + string + " is " + middle);
    }
}

(#5) 

import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Type in a sentence with a space: ");
        String string1 = k.nextLine();

        int spaceIndex = string1.indexOf(' ');
        String before = string1.substring(0, spaceIndex);
        String after = string1.substring(spaceIndex + 1);

        System.out.println("The part before the space is: " + before);
        System.out.println("The part after the space is: " + after);
    }
}

(#6)

import java.util.Scanner;

public class RandomCharacter {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        
        System.out.print("Type in a word or sentence: ");
        String string1 = k.nextLine();

        int random1Index = (int)(Math.random() * string1.length());
        System.out.println("Here’s a random character from what you typed: " + string1 + random1Index));
    }
}

(#7) 

    {
        Scanner k = new Scanner(System.in);
       
      System.out.print("Enter a word with at least two e's: ");
        String string1 = k.nextLine();

        int first = string1.indexOf('e');
        int second = string1.indexOf('e', first + 1);

        System.out.println("The second 'e' is at index: " + second);
    }

(#8) 

import java.util.Scanner;

public class StringEqual 
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = new String(k.nextLine());

        System.out.print("Enter the second string: ");
        String string2 = new String(k.nextLine());

        System.out.println(string1 + " equals " + string2 + " is " + string1 == string2);
    }
}

(#9) 

import java.util.Scanner;

public class FirstLetter 
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string1 = k.nextLine();

        char first = string1.charAt(0);
        char last = string1.charAt(string1.length() - 1);

        System.out.println("The first letter: " + first);
        System.out.println("The last letter: " + last);
        System.out.println(first + " equals " + last + " is " + (first == last));
    }
}

(#10)

import java.util.Scanner;

public class CompareString
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = k.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = k.nextLine();

        System.out.println("The result of the compareTo method: " + sting1 + string2;?
    }
}

(#11) 

import java.util.Scanner;

public class IntegarDistance {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = k.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = k.nextInt();

        int distance;
        if (num1 > num2) {
            distance = num1 - num2;
        } else {
            distance = num2 - num1;
        }

        System.out.println("The distance between " + num1 + " and " + num2 + " is " + distance);
    }
}

(#12) 
import java.util.Scanner;

public class RandomItrv
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = k.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = k.nextInt();

        int random1 = (int)(Math.random() * (num2 - num1 + 1)) + num1;

        System.out.println("A random number in the interval of [" + num1 + ", " + num2 + "]: " + random1);
    }
}


(#13) 

import java.util.Scanner;

public class CalcPower
{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = k.nextDouble();

        System.out.print("Enter the exponent: ");
        int exp = k.nextInt();

        double result = 1;
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println(base + " ^ " + exp + " = " + result);
    }
}
