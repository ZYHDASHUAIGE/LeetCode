package LeetCode301_400;

public class LeetCode344_ReverseStr {

	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		reverseString(s);
		for(char a:s) {
			System.out.println(a);
		}
	}
	
	public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        
        while(i<=j) {
        	exchange(s, i, j);
        	i++;
        	j--;
        }
        
        
    }
	
	public static void exchange(char[] s,int i,int j) {
		char cur ;
		cur = s[i];
		s[i]=s[j];
		s[j] = cur;
	}
}
