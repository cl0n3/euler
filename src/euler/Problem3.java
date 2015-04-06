package euler;

public class Problem3
{

	public static void main(String[] args)
	{
		long target = 600851475143L; // 5, 7, 13 and 29.
		for (long i = 1; i < Math.sqrt(target); i++) {
			if (target % i == 0)
				System.out.println(i + " " + ( ((double)i / Math.sqrt(target)) * 100) + "%");
			
		}
	}
}
