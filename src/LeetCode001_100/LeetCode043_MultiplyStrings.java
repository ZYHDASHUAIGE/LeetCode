package LeetCode001_100;

public class LeetCode043_MultiplyStrings {

	public static void main(String[] args) {
		String num1 = "2";
		String num2 = "3";
		System.out.println(multiply2(num1, num2));

	}

	public static String multiply(String num1, String num2) {
		if (num1.charAt(0) == '0' || num2.charAt(0) == '0')
			return "0";
		int a = Integer.parseInt(num1);
		int b = Integer.parseInt(num2);
		int res = a * b;
		return Integer.toString(res);

	}

	public static String multiply2(String num1, String num2) {
		char[] value = new char[num1.length() + num2.length()];
		for (int i = num1.length() - 1; i >= 0; i--) {
			for (int j = num2.length() - 1; j >= 0; j--) {
				value[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}
		// 处理进位
		int carry = 0;
		for (int i = value.length - 1; i >= 0; i--) {
			value[i] += carry;
			carry = value[i] / 10;
			value[i] %= 10;
		}
		int beginIndex = 0;
		//从第一个不为0的数开始
		while (beginIndex < value.length - 1 && value[beginIndex] == 0) {
			beginIndex++;
		}
		for (int i = beginIndex; i < value.length; i++) {
			value[i] += '0';
		}
		return new String(value, beginIndex, value.length - beginIndex);
	}

}
