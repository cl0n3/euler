package euler;

public class Problem2
{

	public static void main(String[] args)
	{
		int fibn1 = 0;
		int fibn = 1;
		int sum = 0;
		while (fibn < 4000000) {
			int tmp = fibn;
			if ((fibn = fibn + fibn1) % 2 == 0)
				sum += fibn;
			
			fibn1 = tmp;
		}
		System.out.println(sum);
	}
}
