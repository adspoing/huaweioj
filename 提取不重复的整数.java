import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        char[] str=String.valueOf(n).toCharArray();
        String res="";
        Set<String> set=new HashSet<>();
        if(n==0){
            System.out.print(n);
        }else {
            for (int i = str.length - 1; i >= 0; i--) {
                if (res.equals("") && str[i] == '0') {
                    set.add("0");
                    continue;
                } else {
                    if (set.contains(String.valueOf(str[i])) == false) {
                        set.add(String.valueOf(str[i]));
                        res += str[i];
                    }
                }
            }
            System.out.print(res);
        }
    }

}

