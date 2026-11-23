class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String c="";
        for(int i=0;i<word1.length;i++)
        {
            c=c+word1[i];
        }
        String p="";
        for(int j=0;j<word2.length;j++)
        {
                p=p+word2[j];
        }
        if(p.equals(c))
        {
            return true;
        }
        return false;
    }
}