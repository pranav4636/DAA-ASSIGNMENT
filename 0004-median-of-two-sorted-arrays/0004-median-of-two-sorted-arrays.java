class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        if(num1.length > num2.length){
            return findMedianSortedArrays(num2,num1);
        }

        int m = num1.length;
        int n = num2.length;

        int left = 0;
        int right = m;

        while(left <= right){
            
            int partitionX = (left + right) / 2;
            int partitionY = (m + n + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE :num1[partitionX - 1];
            int minRightX = (partitionX == m) ? Integer.MAX_VALUE : num1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE :num2[partitionY - 1];
            int minRightY = (partitionY == n) ? Integer.MAX_VALUE : num2[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){

                if((m + n) % 2 == 0){
                    return(Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2.0;
                }  else{
                    return Math.max(maxLeftX, maxLeftY);
                }          
                }else if(maxLeftX > minRightY){
                    right = partitionX -1;
                }else{
                    left = partitionX + 1;
                }
        }
        return 0.0;
    }
}