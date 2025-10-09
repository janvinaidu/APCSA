package apclass;

public class Dice {
	private int numSides;
	private int faceValue;
	
	public Dice() {
		numSides = 6;
		faceValue = 1;
	}
	
	public Dice(int sides) {
		numSides = sides;
		faceValue = 1;
	
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public int faceValue() {
		return faceValue;
	}
	
	public int roll() {
		faceValue = (int)(Math.random() * numSides) + 1;
		return faceValue;
	}
	
	public String toString() {
		return "" + faceValue;
	}
	public static void main(String[] agrs) {
		Dice d1 = new Dice();
		Dice d2 = new Dice();
		
		d1.roll();
		d2.roll();
		
		System.out.println("Dice 1 face value" + d1.faceValue());
		System.out.println("Dice 2 face value" + d2.faceValue());
		System.out.println("Sum of dice:" + (d1.faceValue() + d2.faceValue()));
	}

}
