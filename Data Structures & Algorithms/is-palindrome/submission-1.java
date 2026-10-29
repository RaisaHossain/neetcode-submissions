class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(result);
        String reverse_sb = sb.reverse().toString();
        return result.equals(reverse_sb);
    }
}
