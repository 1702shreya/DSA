class Solution {
    public String truncateSentence(String s, int k) {
        int c=0;
       String a[]=s.trim().split(" ");
       String str="";
       while(c!=k)
       { if(c==0)
       {
        str+=a[c];
        
       }
       else
        str=str+ " " +a[c];
        c++;
       }
       return str;
    }
}