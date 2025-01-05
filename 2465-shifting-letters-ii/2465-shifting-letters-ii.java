class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int[] shiftArr=new int[n+1];

        for(int[] shift:shifts){
            int start=shift[0];
            int end=shift[1];
            int dir=shift[2];

            if(dir==1){
                shiftArr[start] += 1;
                shiftArr[end+1] -= 1;

            }
            else{
                shiftArr[start] -= 1;
                shiftArr[end+1] += 1;
            }
        }
        int cushift=0;
        int[] effshift = new int[n];
        for (int i=0;i<n;i++){
            cushift += shiftArr[i];
            effshift[i]=cushift;
        }
        char[] res=s.toCharArray();
        for(int i=0;i<n;i++){
            int shift=effshift[i]%26;
            if(shift<0){
                shift+=26;
            }
            res[i]=(char) ((res[i] -'a'+ shift)% 26 +'a');
        }
        return new String(res);


    }
}