package LeetCode001_100;

/**
 * 
 * @author Administrator
 * ��֮���δ�ӡ������z�δ�ӡ
 */
public class LeetCode006_ZigzagConversion {

	public static void main(String[] args) {
		String s = "leetcodeishiring";
		System.out.println(convert(s, 3));

		
	}
	
	public static String convert(String s, int numRows) {
		if (numRows<=1) return s;
		StringBuilder[] sb = new StringBuilder[numRows];
		//StringBuilder initial
		for (int i=0;i<sb.length;i++) {
			sb[i] = new StringBuilder("");
		}
		for(int i=0;i<s.length();i++) {
			int index = i%(2*numRows-2);
			index = index<numRows?index:2*numRows-index-2;
			sb[index].append(s.charAt(i));
		}
		for(int i=1;i<sb.length;i++) {
			sb[0].append(sb[i]);
			
		}
		return sb[0].toString();
	}

}
