import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String ss=input.nextLine();
        System.out.print(reverse(ss));
    }
    /**
     * 反转句子
     *
     * @param sentence 原句子
     * @return 反转后的句子
     */
    public static String reverse(String sentence){
        String[] tm=sentence.split(" ");
        String res="";
        for(int i=tm.length-1;i>0;i--){
            res+=tm[i];
            res+=" ";
        }
        res+=tm[0];
        return res;
    }
}

