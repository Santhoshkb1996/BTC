package practicebtc;

public class Problem19 {
	public static void main(String[] args) {
		String[] str = { "2AA", "12", "A2C", "C5a" };
		getSum(str);
	}

	public static void getSum(String[] str) {
		int sum = 0;
		for (int i = 0; i < str.length; i++)
		{
			for (int j = 0; j < str[i].length(); j++) {
				char ch = str[i].charAt(j);
				if (Character.isDigit(ch)) {
					String s = String.valueOf(ch);
					int n = Integer.parseInt(s);
					sum = sum + n;
				}
			}
		}
		System.out.println("Total="+sum);
	}
}
