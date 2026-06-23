public class minsubarray {
    public int minSubArrayLen(int target, int[] a) {
        int i = 0;
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        for(int j=0;j<a.length;j++){
            sum = sum +a[j];

            while(sum>= target){
                minlen= Math.min(minlen,j-i+1);
                sum = sum-a[i];
                i++;
            }
        }
        if (minlen==Integer.MAX_VALUE)  return 0;
        return minlen;
        
    }
}
    
class Main {
    public static void main(String[] args) {
        minsubarray sol = new minsubarray();
        int[] a = {2,3,1,2,4,3};
        int target = 7;
        int result = sol.minSubArrayLen(target, a);
        System.out.println(result); // Output: 2
    }
}
