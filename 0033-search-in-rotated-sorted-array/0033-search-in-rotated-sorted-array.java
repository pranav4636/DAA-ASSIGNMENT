class Solution {
    public int search(int[] num, int target) {
        int left = 0;
        int right = num.length -1;
        while(left <= right){
            int mid = left +(right - left)/2;
            if(num[mid] == target){
                return mid;
            }
            if(num[left]<= num[mid]){
                if(target >= num[left] && target < num[mid]){
                    right = mid -1;
                }else{
                    left = mid + 1;
                }
            }
            else{
                if(target > num[mid] && target <= num[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}