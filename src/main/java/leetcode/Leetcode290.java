//import com.sun.org.apache.xpath.internal.operations.String;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Leetcode290 {
//    class Solution {
//        public boolean wordPattern(String pattern, String s) {
//
//            String[] ch = s.split(" ");
//            Map<Character,String> map1 = new HashMap<Character,String>();
//            Map<String,Character> map2 = new HashMap<String,Character>();
//
//
//            for(int i=0;i<pattern.length();i++){
//                char cur1 = s.charAt(i);
//                String cur2 = ch[i];
//                if((map1.containsKey(cur1) && !map1.get(cur1).equals(cur2))||(map2.containsKey(cur2) && map2.get(cur2)!=cur1)){
//                    return false;
//                }
//                map1.put(cur1,cur2);
//                map2.put(cur2,cur1);
//            }
//            return true;
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Solution solution = new Leetcode290().new Solution();
//
//        System.out.println(solution.wordPattern("abba","dog cat cat dog"));
//    }
//}
