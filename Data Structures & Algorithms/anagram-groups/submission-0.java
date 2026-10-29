class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap to store lists of anagrams
        Map<String, List<String>> anagramMap = new HashMap<>();
        
        for (String str : strs) {
            // Convert string to char array, sort it, then convert back to string
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            
            // Add the original string to the corresponding list in the HashMap
            anagramMap.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }
        
        // Collect the lists of anagrams from the HashMap
        return new ArrayList<>(anagramMap.values());
    }
}
