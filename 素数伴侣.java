import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int year=input.nextInt();
        int month=input.nextInt();
        int day=input.nextInt();
        int res=0;
        if(year%4==0){
            for(int i=0;i<month-1;i++){
                res+=b[i];
            }
        }else
        {
            for(int i=0;i<month-1;i++){
                res+=a[i];
            }
        }
        System.out.print(res+day);
    }
}



