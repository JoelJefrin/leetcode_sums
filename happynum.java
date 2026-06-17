import java.util.*;
class Solution {
    public int sumOfSq(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem);
            n=n/10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(n!=1){
            if(s.contains(n))   return false;
            s.add(n);
            n=sumOfSq(n);
        }
        return true;
    }
}
class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 19;
        boolean result = sol.isHappy(n);
        System.out.println(result); // Output: true
    }
}