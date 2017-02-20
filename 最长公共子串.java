import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str1,str2;
        str1=input.next();
        str2=input.next();
        System.out.print(iQueryMaxCommString(str1,str2));

    }
    public static String iQueryMaxCommString(String stringA, String stringB)
    {
        int max=0;
        String res="";
        for(int i=0;i<stringA.length();i++){
            for(int j=i+1;j<=stringA.length();j++){
                if(stringB.contains(stringA.substring(i,j))&&j-i>max){
                    max=j-i;
                    res=stringA.substring(i,j);
                }
            }
        }
        return res;
    }
}


