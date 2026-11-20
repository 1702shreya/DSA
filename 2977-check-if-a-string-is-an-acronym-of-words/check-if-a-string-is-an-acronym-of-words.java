class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if (words.size() != s.length()) {
            return false;
        }
        int j=0;
        for(int i=0;i<words.size();i++)
        {
            String n=words.get(i);
            if(n.charAt(0)==s.charAt(j))
            {
                j++;
            }
            else
             return false;


        }
        return true;
    }
}