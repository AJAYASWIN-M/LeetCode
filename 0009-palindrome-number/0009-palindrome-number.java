class Solution {
    public boolean isPalindrome(int x) {
      if(x<0 || x%10==0 & x!=0){
        return false;
      }  
      String str1=String.valueOf(x);
      int left=0;
      int right=str1.length()-1;
      while(left<right){
        if(str1.charAt(left)!=str1.charAt(right)){
            return false;
        }
        left++;
        right--;
      }
      return true;
    
}
}