
        class Solution {
    public int findComplement(int num) {
        int n = num;
        int c = 0;
        
        while (n != 0) {
            c++;
            n /= 2;
        }
        
       
        int m = (1 << c) - 1;
        

        return num ^m ;
    }
}