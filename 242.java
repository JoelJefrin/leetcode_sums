import java.util.*;
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(m.get(s.charAt(i))==1) return i;
        }
        return -1;

        
    }
}
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "loveleetcode";
        int result = sol.firstUniqChar(s);
        System.out.println(result); // Output: 0
    }
}