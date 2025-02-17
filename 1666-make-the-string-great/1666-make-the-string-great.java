class Solution {
    public String makeGood(String s) {

        Stack<Character> stack = new Stack();

        for(char a:s.toCharArray()){

            if(stack.isEmpty()){
                stack.push(a);
            }
            else if(stack.peek() -32==a || stack.peek() +32==a ){
                stack.pop();
                }
           
            else{
                stack.push(a);
            }
             
        }

        String y="";
        while(!stack.isEmpty()){
            y=stack.pop()+y;

        }
        return y;
        
    }
}