import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String  input=in.nextLine();
        String res="";
        char[] origin=input.toCharArray();
        for(int i=0;i<origin.length;i++){
            if(origin[i]>='A'&&origin[i]<='Z'){
                if(origin[i]=='Z')
                    res+='a';
                else {
                    char tmp=(char)(origin[i] + 1);
                    res += String.valueOf(tmp).toLowerCase();
                }
            }
            else
                if (origin[i] >= 'a' && origin[i] <= 'z') {
                    int m;
                    if (origin[i] - 'a' <= 14)
                        m = (origin[i] - 'a') / 3 + 2;
                    else if (origin[i] - 'a' <= 18 && origin[i] - 'a' > 14) {
                        m = 7;
                    } else if (origin[i] - 'a' > 18 && origin[i] - 'a' <= 21) {
                        m = 8;
                    } else
                        m = 9;
                    res += m;
                }
            else{
                    res+=origin[i];
                }
        }
        System.out.println(res);
    }

}

