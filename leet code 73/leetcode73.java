
public class leetcode73 {
    public void setZeroes(int[][] matrix) {
        // Method 1 : using extra space
        // Set<Integer> rowSet = new HashSet<>();
        // Set<Integer> colSet = new HashSet<>();

        // int m = matrix.length, n = matrix[0].length;

        // for(int i=0; i<m; i++){
        //     for(int j=0; j<n; j++){
        //         if(matrix[i][j] == 0){  
        //             rowSet.add(i);
        //             colSet.add(j);
        //         }
        //     }
        // }

        // for(int i: rowSet){
        //     for(int j=0; j<n; j++){
        //         matrix[i][j] = 0;
        //     }
        // }

        // for(int j: colSet){
        //     for(int i=0; i<m; i++){
        //         matrix[i][j] = 0;
        //     }
        // }

        // Method 2: without using extra space
        int m = matrix.length, n = matrix[0].length;
        boolean row = false, col = false;

        // we are taking first row and first column as dummy array for remaining 2D matrix
        
        // we are checking whether the dummy row has zero or not
        // if it has zero than we have to make entire row to zero
        for(int j=0; j<n; j++){
            if(matrix[0][j] == 0) row = true;
        }
        
        // we are checking whether the dummy col has zero or not
        // if it has zero than we have to make entire col to zero
        for(int i=0; i<m; i++){
            if(matrix[i][0] == 0) col = true;
        }

        // now itrate through remaining 2D array
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] == 0){
                    // mark the position of row and col in dummy array
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // now making the row and col of inner matrix as zero
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0) matrix[i][j] = 0;
            }
        }

        // now fill the approprite elements in dummy array
        if(row){
            for(int j=0; j<n; j++) matrix[0][j] = 0;
        }

        if(col){
            for(int i=0; i<m; i++) matrix[i][0] = 0;
        }

    }
}