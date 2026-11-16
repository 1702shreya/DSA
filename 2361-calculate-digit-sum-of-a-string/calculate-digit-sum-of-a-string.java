class Solution {
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            s = rec(s, k); 
        }
        return s;
    }

    public String rec(String s, int k) {
        StringBuilder p = new StringBuilder();
      
        for (int i = 0; i < s.length(); i += k) {
            int sum = 0;
            int end = Math.min(i + k, s.length());
            
            for (int j = i; j < end; j++) {
                sum += s.charAt(j) - '0'; 
            }
            
            p.append(sum); 
        }
        
        return p.toString();
    }
}