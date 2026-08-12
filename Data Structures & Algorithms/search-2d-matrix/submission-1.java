class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length, col=matrix[0].length;
        int lo=0, hi=row*col-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
           int rowmid=mid/col;
           int colmid=mid%col;
            if(matrix[rowmid][colmid]==target) return true;
            else if(matrix[rowmid][colmid]>target) hi=mid-1;
            else lo=mid+1;
        }
        return false;
    }
}
