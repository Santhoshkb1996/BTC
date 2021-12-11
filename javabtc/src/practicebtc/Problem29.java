package practicebtc;

public class Problem29 {
	public static void main(String[] args) {
		String str = "hello";
		int n = 2;
		System.out.println(formattingOfString(str, n));
	}

	public static String formattingOfString(String s1, int n) {
		String s2 = s1.substring(s1.length() - n, s1.length());
		StringBuffer str2 = new StringBuffer();
		for (int i = 0; i < n; i++)
			str2.append(s2);
		return str2.toString();
		//return s2;
	}
}
