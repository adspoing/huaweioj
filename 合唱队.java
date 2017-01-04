import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int input=in.nextInt();
            int []height=new int[input];
            for(int i=0;i<input;i++){
                height[i]=in.nextInt();
            }
            System.out.println(dp(height,input));
        }

    }
    public static int dp(int[] height,int len){
        int res=0;
        int []left=new int[len];
        int []right=new int[len];
        left[0]=right[len-1]=1;
        for(int i=0;i<len;i++){
            left[i]=1;
            for(int k=0;k<i;k++){
                if(height[i]>height[k]){
                    left[i]=Math.max(left[i],left[k]+1);
                }
            }
        }
        for(int i=len-2;i>=0;i--){
            right[i]=1;
            for(int k=len-1;k>i;k--){
                if(height[i]>height[k]){
                    right[i]=Math.max(right[i],right[k]+1);
                }
            }
        }
        for(int i=0;i<len;i++){
            if(left[i]+right[i]-1>res){
                res=left[i]+right[i]-1;
            }
        }
        return len-res;
    }
}

