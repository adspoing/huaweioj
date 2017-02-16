import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.print(count);
    }
}

