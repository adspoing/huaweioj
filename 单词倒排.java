import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String src = sc.nextLine();
        String result = "";
        StringBuffer sb = new StringBuffer();
        String[] strs = src.split("\\W{1,}");// 非单词字符，可能出现一个或者多个
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        result = sb.toString();
        System.out.println(result);
    }
}

