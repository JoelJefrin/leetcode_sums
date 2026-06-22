class Solution {
    public double findMaxAverage(int[] a, int k) {
        int sum = 0;
        for (int i=0;i<k;i++){
            sum = sum + a[i];
        }
        int maxS = sum;
        for(int j=k ;j<a.length;j++){
            sum = sum - a[j-k] + a[j];
            maxS = Math.max(sum,maxS);
        }
        return (double)maxS/k;

        
    }
}

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] a = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = sol.findMaxAverage(a, k);
        System.out.println(result); // Output: 12.75
    }
}
