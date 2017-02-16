import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String str1,str2;
        str1=input.next();
        str2=input.next();
        char[] strOutput=new char[str1.length()+str2.length()];
        System.out.print(ProcessString(str1,str2));
    }
    private static String ProcessString(String str1,String str2){
        String tmp=str1+str2;
        char[] tm=tmp.toCharArray();
        for(int i=0;i<tm.length;i+=2){
            for(int j=0;j<tm.length-2-i;j+=2){
                if(tm[j]>tm[j+2]){
                    char temp=tm[j+2];
                    tm[j+2]=tm[j];
                    tm[j]=temp;
                }
            }
        }
        for(int i=1;i<tm.length;i+=2){
            for(int j=1;j<=tm.length-2-i;j+=2){
                if(tm[j]>tm[j+2]){
                    char temp=tm[j+2];
                    tm[j+2]=tm[j];
                    tm[j]=temp;
                }
            }
        }
        String sortStr=String.valueOf(tm);
        sortStr=sortStr.toLowerCase();
        char[] ss=sortStr.toCharArray();
        String res="";
        for(int i=0;i<ss.length;i++){
            if(ss[i]>='0'&&ss[i]<='9'){
                String bin=getBinary(ss[i]-'0');
                bin=new StringBuilder(bin).reverse().toString();
//                System.out.println((bin));
//                System.out.println(Integer.toHexString(Integer.valueOf(bin,2)));
                res+=Integer.toHexString(Integer.valueOf(bin,2));
            }
            else if(ss[i]>='a'&&ss[i]<='f'){
                String bin=getBinary(ss[i]-'a'+10);
                bin=new StringBuilder(bin).reverse().toString();
                res+=Integer.toHexString(Integer.valueOf(bin,2));
            }
        }
        return  res.toUpperCase();

    }
    private static String getBinary(int c){
        String bn=Integer.toBinaryString(c);
        String res="";
        for(int i=0;i<4-bn.length();i++){
            res+="0";
        }
        res+=bn;
        return res;
    }
}

