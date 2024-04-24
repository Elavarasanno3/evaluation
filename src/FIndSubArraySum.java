public class FIndSubArraySum {
    public static void main(String[] args) {
        int[] arr = {2,7,5,-1,-3,2,9,7};
        int[]arr2 = {3,-1,6,1,-5,1,3,-8};
        findSum(arr2);
    }
    public static void findSum(int [] arr){
        int maxi = 0;
        int sum = 0;
        int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > 0){
                sum = sum + arr[i];
            }else{
                if(sum > maxi){
                    maxi = sum;
                    sum = 0;
                    index = i;
                }
                sum = 0;
            }
        }
        if(sum > maxi){
            maxi = sum;
            sum = 0;
            index = arr.length;
        }

        System.out.println("maxi : " +  maxi);
        System.out.print("index : ");
        for(int i = index-1; i >= 0;i--){
            if(arr[i] < 0){
                break;
            }
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }

}
