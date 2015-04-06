package euler;

public class Problem4
{

	public static void main(String[] args)
	{
		int largest = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				if (isPalindrome(i * j)) {
					System.out.println(i + " * " + j + " = " + i * j);
					if (i * j >= largest)
						largest = i * j;
				}
			}
		}
		
		System.out.println(largest);
	}	

	private static boolean isPalindrome(int i)
	{
		String s = "" + i;

		int left = 0;
		int right = s.length() - 1;

		while (left <= right) {
			if (s.charAt(left++) != s.charAt(right--))
				return false;
		}

		return true;
	}
}
