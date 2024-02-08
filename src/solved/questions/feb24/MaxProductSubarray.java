package solved.questions.feb24;

public class MaxProductSubarray {
    
    public static void main(String [] args){
        int[] arr = new int[]{3, 12, 15, 23, 33, -35, 30, -40, -30, -30, -30, 26, 28};
        int n=13;
        System.out.println(maxProduct(arr,n));
    }

    static long maxProduct(int[] arr, int n) {
        long leftProduct = 1;
        long rightProduct = 1;
        long ans = arr[0];
        for(int i=0;i<n;i++){
            leftProduct = leftProduct==0?1:leftProduct;
            rightProduct = rightProduct==0?1:rightProduct;
            leftProduct *= arr[i];
            rightProduct *= arr[n-1-i];
            ans = Math.max(ans, Math.max(leftProduct,rightProduct));
        }
        return ans;
    }
}
