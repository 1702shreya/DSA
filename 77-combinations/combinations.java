class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> l = new ArrayList<>();
        
        solve(n, k, 1, new ArrayList<>(), l);
        
        return l;
    }

    private void solve(int n, int k, int start, List<Integer> list, List<List<Integer>> l) {
      
        if (k == 0) {
            l.add(new ArrayList<>(list)); 
            return;
        }

        for (int i = start; i <= n; i++) {
            
            
            list.add(i);
            
            solve(n, k - 1, i + 1, list, l);
            
            list.remove(list.size() - 1);
        }
    }
}