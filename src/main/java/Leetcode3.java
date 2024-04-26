import java.util.HashMap;
import java.util.Map;

public class Leetcode3 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int max = 0 ;

        int start = 0;
        Map<Character,Integer> count = new HashMap<Character,Integer>();
        for(int end = 0;end<n;end++){
            char cur = s.charAt(end);
            if(count.containsKey(cur)){
                max = Math.max(max,end-start);
                count.clear();
                start = end;
            }else{
                count.put(cur,1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Leetcode3 leetcode3 = new Leetcode3();
        int i = leetcode3.lengthOfLongestSubstring("bbbbb");
        System.out.println(i);
        String ss = "    ";
        System.out.println(ss.length());

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();

        characterIntegerHashMap.put(' ',1);
        System.out.println(characterIntegerHashMap);
        System.out.println(characterIntegerHashMap.keySet());
        System.out.println(String.class.getClassLoader());
        System.out.println(Leetcode3.class.getClassLoader());
    }
}
