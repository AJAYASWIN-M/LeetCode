class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        // Define vowels
        String vowels = "aeiou";
        
        int n = words.length;
        int[] prefix = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            String word = words[i];
            if (isVowel(word.charAt(0), vowels) && isVowel(word.charAt(word.length() - 1), vowels)) {
                prefix[i + 1] = prefix[i] + 1;
            } else {
                prefix[i + 1] = prefix[i];
            }
        }
        
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            result[i] = prefix[ri + 1] - prefix[li];
        }
        
        return result;
    }
    
    private boolean isVowel(char c, String vowels) {
        return vowels.indexOf(c) != -1;
    }
}
