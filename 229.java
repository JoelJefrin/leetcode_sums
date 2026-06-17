
import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] a) {
        int n=a.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a)
            map.put(i,map.getOrDefault(i,0)+1);
        List<Integer> res=new ArrayList<>();
        for(Integer key:map.keySet()){
            if(map.get(key)>n/3)   res.add(key);
        }
        return res;
    }
}
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {3,2,3};
        List<Integer> result = sol.majorityElement(a);
        System.out.println(result); // Output: [3]
    }
}
