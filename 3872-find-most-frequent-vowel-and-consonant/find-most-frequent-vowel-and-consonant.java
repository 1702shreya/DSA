class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0)+1);
        }
        int v=0;
        int b=0;
        for(char c:h.keySet())
        {
            int f=h.get(c);
            if(c=='a' || c=='e' || c=='i'||c=='o' ||c=='u' )
            {
                v=Math.max(v,f);
            }
            else
             b=Math.max(b,f);
        }
        return v+b;
    }
}