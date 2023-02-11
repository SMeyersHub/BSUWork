import java.util.Random;

/**
 * Generate random integers in the range [0...99]. The program prints FAIL if
 * either 0 or 99 is generated (along with a count of how many times). Otherwise it
 * prints PASS.
 */

/**
 * @author amit
 *
 */
public class RandomTest {
	
	public static final int RANGE = 100;
	public static final int LOWER_BOUND = 1;
	public static final int UPPER_BOUND = 98;
	public static Random generator = new Random();

	
	public static int runTest(int numTests) 
	{
		int count = 0;
		for (int i = 0; i < numTests; i++) {
			int value = generator.nextInt(RANGE);
			if (value < LOWER_BOUND || value > UPPER_BOUND)
				count++;
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: java RandomTest <numTests>");
			System.exit(1);
		}
		int numTests = Integer.parseInt(args[0]);
		int count = runTest(numTests);
		if (count > 0) {
			System.out.println("FAIL" + " " + count);
		} else {
			System.out.println("PASS");
		}
	}

}
