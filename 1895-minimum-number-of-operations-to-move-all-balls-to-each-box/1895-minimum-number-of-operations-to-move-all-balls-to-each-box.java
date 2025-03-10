class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int [] distance = new int[n];

        int prefixCount=0;
        int prefixSum = 0;

        for(int i=0;i<n;++i){
            distance[i] = prefixCount *i-prefixSum;
            if(boxes.charAt(i)=='1'){
                ++prefixCount;
                prefixSum += i;
            }
        }
        int suffixCount = 0;
        int suffixSum = 0;

        for(int i=n-1;i>=0;--i){
            distance[i] += suffixSum - suffixCount *i;
            if(boxes.charAt(i)=='1'){
                ++suffixCount;
                suffixSum += i;
            }
        }
        return distance;
    }
}