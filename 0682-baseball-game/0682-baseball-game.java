class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack();
        for(String s:operations){
            if(s.equals("C")) {
                stack.pop();
            }
            else if(s.equals("D")){
                stack.push(stack.peek()*2);
            }
            else if(s.equals("+")){
                int pop1=stack.pop();
                int pop2=stack.pop();
                int sum=pop1+pop2;
                stack.push(pop2);
                stack.push(pop1);
                stack.push(sum);
            }
            else{
                int num=Integer.parseInt(s);
                stack.push(num);
            }
        }
        int tot=0;
        while(!stack.isEmpty()){
            tot=tot+stack.pop();

        }
        return tot;



        
    }
}