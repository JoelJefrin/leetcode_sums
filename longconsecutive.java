import java.util.*;
class Solution {
    public int longestConsecutive(int[] a) {
        HashSet<Integer> s=new HashSet<>();
        for(int n:a)    s.add(n);
        int maxLen=0;
        for(int n:s){
            if(!s.contains(n-1)){
                int curNum=n;
                int len=1;
                while(s.contains(curNum+1)){
                    curNum++;
                    len++;
                }
                maxLen=Math.max(len,maxLen);
            }
        }
        return maxLen;
    }
}
class Main1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {100, 4, 200, 1, 3, 2};
        int result = sol.longestConsecutive(a);
        System.out.println(result); // Output: 4
    }
}
