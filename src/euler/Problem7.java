package euler;

public class Problem7
{

	public static void main(String[] args)
	{
		long target = 1;
		int nth = 1;
		while (nth <= 10002) {
			if (isPrime(target)) {
				System.out.println(target + " is the " + nth + "th prime");
				nth++;
			}
			
			target++;
		}
			
		
	}

	private static boolean isPrime(long target)
	{
		if (target < 4)
			return true;
		
		for (long upto = 2; upto < Math.round(Math.sqrt(target) + 0.5); upto++) {
			if (target % upto == 0) {
				return false;
			}
		}
		return true;
	}	
}
