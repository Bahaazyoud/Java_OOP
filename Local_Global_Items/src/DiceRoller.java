import java.util.Random;

public class DiceRoller {
	Random random;
	int x;
	DiceRoller(){
		random = new Random();
		roll();
	}
	
	
	void roll() {
		x = random.nextInt(6)+1;
		System.out.println(x + " random number");
	}
}
