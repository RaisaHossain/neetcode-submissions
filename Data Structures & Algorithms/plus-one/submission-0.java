class Solution {
    public int[] plusOne(int[] digits) {
        int last = digits.length;
        int carry = 1;
        for(int i = last - 1; i >= 0; i-- )
        {    
            if(digits[i] < 9)
            {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[last + 1];  
        newDigits[0] = 1;
        return newDigits;
    }
}
