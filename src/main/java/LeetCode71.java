

import lombok.extern.slf4j.Slf4j;

import java.util.Deque;
import java.util.LinkedList;

@Slf4j
public class LeetCode71 {


    static class Solution {
        public static String simplifyPath(String path) {

            log.info("path:{}",path);
            String[] split = path.split("/");

            Deque<String> st = new LinkedList<>();

            for(String cur : split){
                if(cur.equals("..")){
                    st.removeLast();
                    continue;
                }
                if(!cur.equals(".") && !cur.isEmpty()){
                    st.addLast(cur);
                }
            }

            StringBuilder rs = new StringBuilder();
            rs.append("/");
            while(!st.isEmpty()){
                String cur = st.removeFirst();
                rs.append(cur);
                rs.append("/");
            }
            String r = rs.toString();
            return r.substring(0,r.length()-1);
        }

    }

    public static void main(String[] args) {

        LeetCode71 leetCode71 = new LeetCode71();
        String s = Solution.simplifyPath("/a/./b/../../c/");
        System.out.println(s);
    }
}
