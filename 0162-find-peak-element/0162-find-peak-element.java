class Solution {
    public int findPeakElement(int[] num) {
        int left = 0;
        int right = num.length -1;
        while(left < right){
            int mid = left+(right - left)/2;
            if(num[mid] > num[mid + 1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }
}