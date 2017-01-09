import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input=in.next();
        int[] hash=new int[26];
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            hash[c-'a']++;
        }
        int min=0x7fffffff;
        for(int i=0;i<26;i++){
            if(min>hash[i]&&hash[i]!=0){
                min=hash[i];
            }
        }
        String res="";
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(hash[c-'a']==min){
                continue;
            }
            else
                res+=input.charAt(i);
        }
        System.out.println(res);
    }
}

