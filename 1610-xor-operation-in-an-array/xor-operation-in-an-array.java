class Solution {
    public int xorOperation(int n, int start) {
        int c=1;
        int xor=start;
        while(c!=n)
        {
            start=start+2;
            xor=xor ^ start;
            c++;

        }
                    return xor;

    }
}