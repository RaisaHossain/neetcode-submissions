class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1_array = new int[26];
        int[] s2_array = new int[26];
        int matches = 0;
        if(s1.length() > s2.length())
        {
            return false;
        }

        for(int i = 0; i < s1.length(); i++)
        {
            s1_array[s1.charAt(i) - 'a']++;
            s2_array[s2.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++)
        {
             if(s1_array[i] == s2_array[i])
            {
                matches++;
            }    
        }
        int left = 0;
        for(int r = s1.length(); r < s2.length(); r++)
        {
            if (matches == 26) 
            {
                return true;
            }  
            int index = s2.charAt(r) - 'a';
            s2_array[index]++;
            if(s1_array[index] == s2_array[index])
            {
                matches++;
            } else if(s1_array[index] + 1 == s2_array[index])
            {
                matches--;
            }
            index = s2.charAt(left) - 'a';
            s2_array[index]--;
            if(s1_array[index] == s2_array[index])
            {
                matches++;
            } else if(s1_array[index] - 1 == s2_array[index])
            {
                matches--;
            }
            left++;
        }
        return matches == 26;
    }
}
