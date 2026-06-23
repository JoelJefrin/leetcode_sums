public class maxconsec {
    public int f(String s, int k,char ch){
        int i=0;
        int count=0;
        int maxL=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)==ch) count++;
            while(count>k){
                if(s.charAt(i)==ch) count--;
                i++;
            }
            maxL=Math.max(maxL,j-i+1);
        }
        return maxL;
    }
    public int maxConsecutiveAnswers(String s, int k) {
        return Math.max(f(s,k,'T'),f(s,k,'F'));
    }
}
    
class Main {
    public static void main(String[] args) {
        maxconsec sol = new maxconsec();
        String s = "TTFF";
        int k = 2;
        int result = sol.maxConsecutiveAnswers(s, k);
        System.out.println(result); // Output: 4
    }
}
