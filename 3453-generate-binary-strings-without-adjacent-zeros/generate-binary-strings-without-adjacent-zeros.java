import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        backtrack(n, "", result);
        return result;
    }
    
    private void backtrack(int n, String current, List<String> result) {
    
        if (current.length() == n) {
            result.add(current);
            return;
        }
        
        
        if (current.length() == 0 || current.charAt(current.length() - 1) == '1') {
            backtrack(n, current + "0", result);
        }
        
        backtrack(n, current + "1", result);
    }
}