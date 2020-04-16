package LeetCode101_200;

public class LeetCode125_ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {
		String lowStr = s.toLowerCase();
        int i=0;
        int j = lowStr.length()-1;
        while(i<=j) {
        	if(lowStr.charAt(i)==lowStr.charAt(j)) {
        		i++;
        		j--;
        	}else {
        		if(!((lowStr.charAt(i)>='a'&&lowStr.charAt(i)<='z')||(lowStr.charAt(i)>='0'&&lowStr.charAt(i)<='9'))) {
        			i++;
        		}
                else if(!((lowStr.charAt(j)>='a'&&lowStr.charAt(j)<='z')||(lowStr.charAt(j)>='0'&&lowStr.charAt(j)<='9'))) {
        			j--;
        		}else {
        			return false;
        		}
        	}
        }
		return true;
        
    }
}
