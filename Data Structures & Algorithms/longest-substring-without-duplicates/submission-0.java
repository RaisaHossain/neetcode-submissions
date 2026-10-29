class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int right = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length())
        {
            char c = s.charAt(right);
            if(!set.contains(c))
            {
                set.add(c);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
                
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
            
        }
        return maxLength;
    }
}
