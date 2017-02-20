import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        System.out.print(count(m, n));
    }
    public static int count(int m,int n){
        if((m==1&&n==0)||(m==0&&n==1)){
            return 1;
        }
        if(m==0){
            return count(m,n-1);
        }
        if(n==0){
            return count(m-1,n);
        }
        if(m>0&&n>0){
            return count(m-1,n)+count(m,n-1);
        }
        return 0;
    }
}


