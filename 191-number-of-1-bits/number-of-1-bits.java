class Solution {
    public int hammingWeight(int n) {
        if (n==0) {
            return 0;
        }
        int out = hammingWeight(n/2) + (n % 2);        
        return out;
    }
}