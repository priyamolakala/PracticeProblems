package Debug;

public class Search_Array {

	public static void main(String[] args) {
		System.out.println(searchMatrix(new int[][] {{1}}, 1));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix[0].length == 0) return false;
        return binarySearch(matrix,target);
    }
    
    public static boolean binarySearch(int[][] matrix, int target){
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(target>matrix[i][matrix[i].length-1]) continue;
                int lo = 0; int hi = matrix[i].length-1;
                while(lo<=hi){
                   int mid = lo + (hi-lo)/2;
                    if(matrix[i][mid]<target){
                        lo = mid+1;
                    }
                    else if(matrix[i][mid]>target){
                        hi = mid-1;
                    }
                    else{
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
