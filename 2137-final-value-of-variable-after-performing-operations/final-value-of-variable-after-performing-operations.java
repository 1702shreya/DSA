class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c=0;
        for(int i=0;i<operations.length;i++)
        {
            String op=operations[i];
            if(op.contains("++"))
                c++;
            else
                c--;
        }
        return c;
    }
}