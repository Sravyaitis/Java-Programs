import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MathRandom {

	public static void main(String[] args) {

		Random random = new Random();
		
		int randomInt  = random.nextInt();
		System.out.println("Random number: "+randomInt);
		
		int randomIntRange=random.nextInt(100);
		System.out.println("Random number (0-99): "+randomIntRange);
		
		double randomDouble=random.nextDouble();
		System.out.println(randomDouble);
		
		boolean randomBoolean = random.nextBoolean();
		System.out.println(randomBoolean);
		
		
		double randomDouble1=Math.random();
		System.out.println(randomDouble1);
		
		int randomInt1=(int)(Math.random()*100);
		System.out.println(randomInt1);
		
		
				
	}
}
