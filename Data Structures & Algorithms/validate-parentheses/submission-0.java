class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketLookup = new HashMap<>(3);
        bracketLookup.put(')', '(');
        bracketLookup.put('}', '{');
        bracketLookup.put(']', '[');
        char[] str = s.toCharArray();
        for(char c: str)
        {
            if(bracketLookup.containsKey(c)){
                if(!stack.isEmpty() && bracketLookup.get(c).equals(stack.peek()))
                {
                    stack.pop();
                } else
                {
                    return false;
                }
            }
            else{
                    stack.push(c);
                }
        }
        return stack.isEmpty();
    }
}
