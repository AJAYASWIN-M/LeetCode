class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set <Integer> s1=new HashSet<>();
        Set <Integer> s2=new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            s2.add(nums2[i]);
        }

        s1.retainAll(s2);
        int[] res = new int[s1.size()];
        int j=0;
        for(int e:s1){
            res[j++]=e;
        }
        return res;
    }
}
