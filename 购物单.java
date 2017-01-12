import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] v=new int[n];
        int[] p=new int[n];
        int[] q=new int[n];
        int[] value=new int[n];
        for(int i=1;i<=m;i++){
            v[i]=in.nextInt();
            p[i]=in.nextInt();
            value[i]=p[i]*v[i];
            q[i]=in.nextInt();
        }
        System.out.println(res(v, value, q, n, m));
    }
    public static int res(int[] v, int[] value,int[] q, int money,int nums) {
        int[][] dp=new int[nums+1][money+1];
        for(int i=1;i<=nums;i++){
            for(int j=1;j<=money;j++){
                if(q[i]==0){
                    if(j>=v[i]){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-v[i]]+value[i]);
                    }
                }
                else
                {
                    if(j>=v[i]+v[q[i]]){
                        dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-v[i]]+value[i]);
                    }
                }
            }
        }
        return dp[nums][money];
    }
}


