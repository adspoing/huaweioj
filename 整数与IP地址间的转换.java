import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ip=input.nextLine();
        int ipp=Integer.valueOf(input.nextLine());
        String[] ss=ip.split("\\.");
        String res="";
        for(int i=0;i<ss.length;i++){
            res+=getBinary(ss[i]);
        }
        System.out.println(Integer.valueOf(res,2));
        String re="";
        for(int i=0;i<4;i++){
            int tmp=ipp/(int)Math.pow(2,8*(3-i));
            ipp=ipp%(int)Math.pow(2,8*(3-i));
//            System.out.println();
            re+=String.valueOf(tmp);
            if(i!=3){
                re+='.';
            }
        }
        System.out.println(re);

    }
    public static String getBinary(String tm){
        String rr=Integer.toBinaryString(Integer.valueOf(tm));
        String res="";
        for(int i=0;i<8-rr.length();i++){
            res+='0';
        }
        return res+rr;
    }

}


