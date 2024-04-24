import java.util.Scanner;

public class MatrixPrint {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        pattern(7);
    }
    public static void pattern(int n){
        int[][] matrix = new int[n][n];
        int left=0,right=n-1,top=0,bottom=n-1;
        int spiral=1;
        while(left<=right) {
            for(int i=left;i<=right;i++) {
                matrix[left][i]=spiral;
            }
            left++;
            for(int i=left;i<=bottom;i++) {
                matrix[i][bottom]=spiral;
            }
            bottom--;
            for(int i=bottom;i>=top;i--) {
                matrix[right][i]=spiral;
            }
            right--;
            for(int i=right;i>=left;i--) {
                matrix[i][top]=spiral;
            }
            top++;
            if(spiral==1)
                spiral=0;
            else
                spiral=1;
        }

        for(int[] i:matrix ) {
            for(int j:i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}