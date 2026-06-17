
import java.util.*;
class Solution {
    public int majorityElement(int[] a) {
        //int n=a.length;
        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i:a){
            m.put(i,m.getOrDefault(i,0)+1);
            if(m.get(i)>a.length/2)    return i;// instead of using n i used a,length
        }
        return -1;
    }
}
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {2,2,1,1,1,2,2};
        int result = sol.majorityElement(a);
        System.out.println(result); // Output: 2
    }
}
