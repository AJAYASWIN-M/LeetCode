class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack();
        for(char a:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(a);
            }
            else{
                if(stack.peek()==a){
                    stack.pop();
                }
                else{
                    stack.push(a);
                }

            }

        }
        String y="";
        while(!stack.isEmpty()){
            y=stack.pop()+y;

        }
        return y;
        
    }
}