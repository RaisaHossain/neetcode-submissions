
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_str = s.toCharArray();
        char[] t_str = t.toCharArray();
        Arrays.sort(s_str);
        Arrays.sort(t_str);
        return (Arrays.equals(s_str, t_str));
    }
}
