class Solution {
    public int countSegments(String s) {
      if(s.length()==0|| s.trim().isEmpty()) return 0;
   
        // Splits by one or more whitespace characters
        return s.trim().split("\\s+").length;
    }
}
