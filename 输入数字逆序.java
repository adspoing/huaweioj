import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String ss=String.valueOf(n);
        StringBuilder sb=new StringBuilder(ss);
        System.out.print(sb.reverse());
    }

}

