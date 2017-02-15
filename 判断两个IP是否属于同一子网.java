import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String mask,ip1,ip2;
        mask=input.next();
        ip1=input.next();
        ip2=input.next();
        System.out.println(checkNetSegment(mask,ip1,ip2));
    }
    public static int checkNetSegment(String mask, String ip1, String ip2)
    {
        String[] ipp1=ip1.split("\\.");
        String[] ipp2=ip2.split("\\.");
        String[] msk=mask.split("\\.");

        for(int i=0;i<ipp1.length;i++){
            if(Integer.valueOf(ipp1[i])>255){
                return 1;
            }
        }
        for(int i=0;i<ipp2.length;i++){
            if(Integer.valueOf(ipp2[i])>255){
                return 1;
            }
        }
        for(int i=0;i<msk.length;i++){
            if(Integer.valueOf(msk[i])>255){
                return 1;
            }
        }
        String ippp1="";
        for(int i=0;i<ipp1.length;i++) {
            String binStr=Integer.toBinaryString(Integer.valueOf(ipp1[i]));
            int len=binStr.length();
            for(int j=0;j<8-len;j++){
                binStr='0'+binStr;
            }
            ippp1+=binStr;
        }
        String ippp2="";
        for(int i=0;i<ipp2.length;i++) {
            String binStr=Integer.toBinaryString(Integer.valueOf(ipp2[i]));
            int len=binStr.length();
            for(int j=0;j<8-len;j++){
                binStr='0'+binStr;
            }
            ippp2+=binStr;
        }
        String msk2="";
        for(int i=0;i<msk.length;i++) {
            String binStr=Integer.toBinaryString(Integer.valueOf(msk[i]));
            int len=binStr.length();
            for(int j=0;j<8-len;j++){
                binStr='0'+binStr;
            }
            msk2+=binStr;
        }
        if(andOp(ippp1,msk2).equals(andOp(ippp2,msk2))==true){
            return 0;
        }else
        {
            return 2;
        }
    }
    private static  String andOp(String str1,String str2)
    {
        String res="";
        for(int i=0;i<str1.length();i++){
            if((str1.charAt(i)=='1'&&str2.charAt(i)=='1')){
                res+='1';
            }else
            {
                res+='0';
            }
        }
        return res;
    }
}
