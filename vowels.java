public class vowels {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abciiidef";
        int k = 3;
        int result = sol.maxVowels(s, k);
        System.out.println(result); // Output: 3
    }
    
}
class Solution {
    public boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i=0; i<k;i++){
            if (isVowel(s.charAt(i))) count++;
        }
        int maxC = count;
        for (int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))) count--;
            if (isVowel(s.charAt(i))) count++;
            maxC= Math.max(maxC,count);
        }
        return maxC;
        
    }
}
