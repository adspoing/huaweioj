//import java.lang.reflect.Array;
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String key=in.nextLine();
//        String data=in.nextLine();
//        System.out.println(encrypt(key,data));
//    }
//    public static String encrypt(String key,String data){
//        String[] tmp=key.toUpperCase().split("");
//        ArrayList<String> resKey=new ArrayList<String>();
//        for(int i=0;i<tmp.length;i++){
//            if(resKey.contains(tmp[i])==false)
//            resKey.add(tmp[i]);
//        }
//        ArrayList<String>resArr=new ArrayList<String>();
//        for(int i=0;i<resKey.size();i++){
//            resArr.add(resKey.get(i));
//        }
//        int k=0;
//        for(int i=0;i<26-resKey.size();i++){
//            char tmpchar=((char)('A'+k));
//            String tmpStr=String.valueOf(tmpchar);
//            while(resArr.contains(tmpStr)==true){
//                k++;
//                tmpchar=((char)('A'+k));
//                tmpStr=String.valueOf(tmpchar);
//            }
//            resArr.add(tmpStr);
//            k++;
//        }
//        String res="";
////        String[] Data=data.split("");
//        for(int i=0;i<data.length();i++){
//            char c=data.charAt(i);
//            int re=0;
//            int acs=c;
//            if(c>'a'&&c<'z'||c>'A'&&c<'Z') {
//                if (Character.isUpperCase(c) == true) {
//                    re = c - 'A';
//                    res += resArr.get(re);
//                } else {
//                    re = c - 'a';
//                    res += resArr.get(re).toLowerCase();
//                }
//            }
//            else
//                res+=String.valueOf(c);
//        }
//
//        return res;
//    }
//
//}
//
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = sc.nextLine();//key
            String str2 = sc.nextLine();
            System.out.println(Encrypt(str1, str2));
        }
    }

    public static String Encrypt(String str1, String str2) {
        char[] chs = str1.toCharArray();
        StringBuilder sb = new StringBuilder();//获取key对应的字母表
        for (int i = 0; i < chs.length; i++) {
            if (sb.toString().indexOf(chs[i]) == -1) {
                sb.append(chs[i]);
            }
        }
        for (int i = 0; i < 26; i++) {
            if (sb.toString().toUpperCase().indexOf((char) ('A' + i)) == -1) {
                sb.append((char) ('A' + i));
            }
        }
        //System.out.println(sb.toString());
        char[] zero = sb.toString().toCharArray();
        char[] chs2 = str2.toCharArray();
        StringBuilder sb2 = new StringBuilder();//获取加密后的字符串
        for (int i = 0; i < chs2.length; i++) {
            if (chs2[i] >= 'A' && chs2[i] <= 'Z') {
                sb2.append(String.valueOf(zero[chs2[i] - 'A']).toUpperCase());
            } else if (chs2[i] >= 'a' && chs2[i] <= 'z') {
                sb2.append(String.valueOf(zero[chs2[i] - 'a']).toLowerCase());
            } else {
                sb2.append(chs2[i]);
            }
        }

        return sb2.toString();

    }
}