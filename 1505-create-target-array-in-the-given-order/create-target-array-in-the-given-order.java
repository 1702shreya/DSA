import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> targetList = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }
        
        // Convert the List back to a primitive int[] array to return
        int[] result = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            result[i] = targetList.get(i);
        }
        
        return result;
    }
}