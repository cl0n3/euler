package euler;

public class Problem5
{

	public static void main(String[] args)
	{
		int num = 1;
		int highest = 1;
		for (int i = 1; i <= 20; i++) {
			if (num % i == 0) {
				if (i > highest) {
					highest= i;
					System.out.println("highest " + highest + " " + num);
				}
				continue;
			}
			
			++num;
			i = 1;
		}
		
		System.out.println(num);
	}	
}
