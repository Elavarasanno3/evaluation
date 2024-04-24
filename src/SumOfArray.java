import java.util.Arrays;

public class SumOfArray {
    public static void main(String[] args) {
//        int[]arr1 = {9,2,8};//,1,3,5,6,7,3,1,1,6};
//        int[]arr2 = {7,8,4};//,6,2,1,9,9,7};
        int[] arr1 = {9,9,8,7,2,3,1,4,2};
        int[] arr2 = {8,9,1,9,9,8};
        int n = Math.max(arr1.length,arr2.length);
        int[]ans = new int[n+1];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int bal = 0;
        while(i != -1 && j != -1){
            int sum = arr1[i] + arr2[j] + bal;
            if(sum > 9){
                ans[n--] = sum%10;
                bal = 1;
            }else{
                ans[n--] = sum;
                bal = 0;
            }
            i--;
            j--;
        }
        while(i != -1){
            ans[n--] = bal + arr1[i];
            i--;
            bal = 0;
        }
        while(j != -1){
            ans[n--] = bal + arr2[j];
            j--;
            bal = 0;
        }
        if(bal == 1){
            ans[0] = 1;
        }
        for(int k = 0;k<ans.length;k++){
            if(k == 0 && ans[k] == 0){

            }else{
                System.out.print(ans[k]);
                System.out.print(" ");
            }
        }
    }
}
