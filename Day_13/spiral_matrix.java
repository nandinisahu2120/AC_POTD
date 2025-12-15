class spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows=matrix.length,column=matrix[0].length;
        int c=rows*column;
        List<Integer> li=new ArrayList<>();
        int top=0,right=column-1,left=0,bottom=rows-1;
        while(c>0){
            for(int i=left;i<=right;i++){
                if(c<=0)
                break;
                li.add(matrix[top][i]);  
                c--;  
            }
            top++;
            for(int i=top;i<=bottom;i++){
                if(c<=0)
                break;
                li.add(matrix[i][right]);
                c--;
            }
            right--;
            for(int i=right;i>=left;i--){
                if(c<=0)
                break;
                li.add(matrix[bottom][i]);
                c--;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                if(c<=0)
                break;
                li.add(matrix[i][left]);
                c--;
            }
            left++;
            
        }
        return li;

    }
}