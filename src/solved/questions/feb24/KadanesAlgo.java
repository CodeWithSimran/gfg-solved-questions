package solved.questions.feb24;

public class KadanesAlgo {

    public static void main(String[] args){
        System.out.println(maxSubarraySum(new int[]{1, 2, 3, -2, 5},5));
    }

    static long maxSubarraySum(int arr[], int n){
        long max_sum = 0;
        long max_reach = Long.MIN_VALUE;
        for(int i=0;i<n;i++){
            max_sum = max_sum + arr[i];
            if(max_sum>max_reach)
                max_reach=max_sum;
            if(max_sum<0)
                max_sum=0;
            }
        return max_reach;
        }
}
