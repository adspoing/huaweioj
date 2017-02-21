import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print(LIS(arr));
    }
    public static int LIS(int[] arr){
        int len=arr.length;
        int[] dp = new int[len];
        int lis=0;
        for(int i=0;i<len;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]&&dp[i]<dp[j]+1){
                    dp[i]=dp[i]+1;
                    if(dp[i]>lis){
                        lis=dp[i];
                    }
                }
            }
        }
        return lis;
    }
}



