package number_guessing_game;
import java.util.Random;
public class RandNumGenerator {
	Random random = new Random(); 
	
	public int generateNum() {
		return random.nextInt(1, 101);
	}
}
