package order;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(longestPalindrome("cbbd"));

	}
	
	public static String longestPalindrome(String s) {
		String output = "";
		if(s.length() == 1){
			return s;
		}
		
		for(int i = 0; i < s.length(); i++){
			String temp = "";
			
			temp = helper(i, i, s);
			if(temp.length() > output.length()){
				output = temp;
			}
			
			temp = helper(i, i + 1, s);
			if(temp.length() > output.length()){
				output = temp;
			}
		}
		
		return output;
    }
	public static String helper(int begin, int end, String s){
		while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)){
			begin--;
			end++;			
		}
		return s.substring(begin + 1, end);
	}

}
