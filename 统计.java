import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println(getEnglishCharCount(str));
        System.out.println(getBlankCharCount(str));
        System.out.println(getNumberCharCount(str));
        System.out.println(getOtherCharCount(str));
    }
    /**
     * 统计出英文字母字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getEnglishCharCount(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))==true){
                count++;
            }
        }
        return count;
    }

    /**
     * 统计出空格字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 空格的个数
     */
    public static int getBlankCharCount(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }

    /**
     * 统计出数字字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getNumberCharCount(String str)
    {
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))==true){
                count++;
            }
        }
        return count;    }

    /**
     * 统计出其它字符的个数。
     *
     * @param str 需要输入的字符串
     * @return 英文字母的个数
     */
    public static int getOtherCharCount(String str)
    {
        return str.length()-getEnglishCharCount(str)-getBlankCharCount(str)-getNumberCharCount(str);
    }
}
