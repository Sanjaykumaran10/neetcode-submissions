class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> o=new ArrayList<>();
        int top =0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(top<=bottom && left<=right){
//go right first row
            for(int i=left;i<=right;i++){
                o.add(matrix[top][i]);

            }
            top++;
//go down right column
            for(int i=top;i<=bottom;i++){
                o.add(matrix[i][right]);
            }
            right--;
//go left on bottom
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    o.add(matrix[bottom][i]);
                }
                bottom--;
            }
//go up on top
            if(left<=right){
                for(int i=bottom ;i>=top ;i--){
                    o.add(matrix[i][left]);
                }
                left++;
            }

        }
        return o;

    }
}
