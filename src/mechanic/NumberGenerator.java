package mechanic;

import java.util.Random;

public class NumberGenerator {
	
	private Random random;
	
	public NumberGenerator() {
		
	}
	
	public int getRandomNumber(int aantalDobbelstenen) {
		Random rand = new Random();
		int num = rand.nextInt(6) + 1;
		return num;
	}

}
