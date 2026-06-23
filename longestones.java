public class longestones  {
    public int longestOnes(int[] a, int k) {
        int zeros = 0;
        int i = 0;
        int maxC = 0;
        for (int j=0;j<a.length;j++){
            if(a[j]==0)  zeros++;
            while(zeros>k){
                if(a[i]==0) zeros--;
                i++;
            }
            maxC=Math.max(j-i+1,maxC);
        }
        return maxC;
        
    }
}
    
class Main {
    public static void main(String[] args) {
        longestones sol = new longestones();
        int[] a = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        int result = sol.longestOnes(a, k);
        System.out.println(result); // Output: 6
    }
}
