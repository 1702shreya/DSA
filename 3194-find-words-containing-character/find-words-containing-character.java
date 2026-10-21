class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> l = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            // Check if the word contains the character x
            if (words[i].indexOf(x) != -1) {
                l.add(i); // Add the word's index, not the character index 'j'
            }
        }
        
        return l;
    }
}