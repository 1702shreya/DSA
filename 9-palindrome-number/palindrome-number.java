class Solution {
    public boolean isPalindrome(int x) {
        String n=String.valueOf(x);
        String rev=new StringBuilder(n).reverse().toString();
        return rev.equals(n);
        
    }
}