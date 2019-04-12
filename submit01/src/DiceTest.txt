class Dice {
	private int value;
	
	public Dice() {
		value = 0;
	}
	
	int roll() {
		int random = (int)(Math.random()*6)+1;
		return random;
	}
	
	void setValue(int value) {
		this.value = value;
	}
	int getValue() {
		return value;
	}

}


public class DiceTest {

	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		
		int sum;
		int count = 0;
		
		
		
		while (true) {
			
			count++;
			
			int random1 = dice1.roll();
			int random2 = dice2.roll();
			System.out.println("주사위1="+random1+" 주사위2="+random2);
			
			dice1.setValue(random1);
			dice2.setValue(random2);
			
			sum = dice1.getValue() + dice2.getValue();
			
			if (sum == 2)
				break;
			
		}
		
		System.out.println("(1,1)이 나오는데 걸린 회수="+count);
	}
}
	