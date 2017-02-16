import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        char[] str=input.nextLine().toCharArray();
        int count=0;
        Set set=new HashSet<>();
        for(int i=0;i<str.length;i++){
            if(str[i]>=0&&str[i]<=127){
                set.add(str[i]);
            }
        }
        System.out.print(set.size());
    }
}

