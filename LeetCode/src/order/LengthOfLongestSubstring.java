package order;

import java.util.HashSet;

/**
 * 3
 * @author Ximin She
 *
 */
public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("aab"));
	}
	public static int lengthOfLongestSubstring(String s) {
		HashSet<Character> set = new HashSet<>();
        int max = 0;
        int j = 0;
        int i = 0;
        while(i < s.length()){
            if(!set.contains(s.charAt(i))){
            	set.add(s.charAt(i++));
                max = Math.max(set.size(), max);
            } else {
                set.remove(s.charAt(j++)); 
            }
        }
        return max;
    }
//	public static int lengthOfLongestSubstring(String s) {
//		HashSet<Character> repeat = new HashSet<>();
//		int length = 0;
//		int longest = 0;
//		for(int i = 0; i < s.length(); i++){
//			repeat.add(s.charAt(i));
//			if(length > longest){
//				longest = length;
//				length = 1;
//			} else {
//				length = 1;
//			}
//			for(int j = i + 1; j < s.length(); j++){
//				boolean checkRepeat = repeat.add(s.charAt(j));
//				if(!checkRepeat){
//					repeat.clear();
//					break;
//				} else {
//					length++;
//				}
//			}
//		}
//		if(length > longest){
//			return length;
//		}
//		return longest;
//    }
}
