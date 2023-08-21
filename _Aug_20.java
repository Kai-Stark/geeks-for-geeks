package geeks_for_geeks;

public class _Aug_20 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 0},
                {1, 1, 0},
                {0, 1, 0}};
        int ans = count(matrix);
        System.out.println(ans);
    }

    public static int  count(int[][] matrix)
    {
        int cnt=0;
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){
                    int count=0;
                    if(i-1>=0&&j-1>=0){
                        if(matrix[i-1][j-1]==0) count++;
                    }
                    if(i-1>=0){
                        if(matrix[i-1][j]==0) count++;
                    }
                    if(i-1>=0&&j+1<n){
                        if(matrix[i-1][j+1]==0) count++;
                    }
                    if(j-1>=0){
                        if(matrix[i][j-1]==0) count++;
                    }
                    if(j+1<n){
                        if(matrix[i][j+1]==0) count++;
                    }
                    if(i+1<m&&j-1>=0){
                        if(matrix[i+1][j-1]==0) count++;
                    }
                    if(i+1<m){
                        if(matrix[i+1][j]==0) count++;
                    }
                    if(i+1<m&&j+1<n){
                        if(matrix[i+1][j+1]==0) count++;
                    }
                    if(count!=0&&count%2==0) cnt++;
                }
            }
        }
        return cnt;
    }
}
