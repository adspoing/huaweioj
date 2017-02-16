import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String ss=input.nextLine();
        StringBuilder sb=new StringBuilder(ss);
        System.out.print(sb.reverse());
    }

}

