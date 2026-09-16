class Solution {
    public String toHex(int num) {
        if(num == 0) 
            return "0";
            
        String s = "";
        
        // Convert to a positive long to handle two's complement for negative numbers
        long val = num & 0xFFFFFFFFL; 
        
        while(val > 0) {
            long rem = val % 16;
            if(rem < 10) {
                s = rem + s;
            } else {
                s = (char)('a' + (rem - 10)) + s;
            }
            val /= 16;
        }
        
        return s;
    }
}