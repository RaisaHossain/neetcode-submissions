class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> notation = new Stack<>();
        int result = 0;
        for(String c: tokens)
        {
            if(c.equals("+"))
            {
                notation.push(notation.pop() + notation.pop());
            }
            else if(c.equals("*"))
            {
                notation.push(notation.pop() * notation.pop());
            }
            else if(c.equals("-"))
            {
                int a = notation.pop();
                int b = notation.pop();
                notation.push(b - a);
            }
            else if(c.equals("/"))
            {
                int a = notation.pop();
                int b = notation.pop();
                notation.push(b / a);
            }
            else {
                notation.push(Integer.parseInt(c));
            }
        }
        result = notation.pop();
        return result;
    }
}
