import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str1,str2;
        str1=input.next();
        str2=input.next();
        char[] aucPassword=str1.toCharArray();
        char[] aucResult=new char[aucPassword.length];
        char[] result=str2.toCharArray();
        char[] password=new char[result.length];
        Encrypt(aucPassword,aucResult);
        unEncrypt(result,password);
        System.out.println(String.valueOf(aucResult));
        System.out.println(String.valueOf(password));
    }
    private static void Encrypt (char aucPassword[], char aucResult[]){
        for(int i=0;i<aucPassword.length;i++){
            if(Character.isLetter(aucPassword[i])){
                if(Character.isLowerCase(aucPassword[i])){
                    if(aucPassword[i]=='z'){
                        aucResult[i]='A';
                    }else
                    {
                        aucResult[i]=(char)('A'+aucPassword[i]-'a'+1);
                    }
                }
                else
                {
                    if(aucPassword[i]=='Z'){
                        aucResult[i]='a';
                    }else{
                        aucResult[i]=(char)('a'+aucPassword[i]-'A'+1);
                    }
                }
            }
            else if(Character.isDigit(aucPassword[i])){
                if(aucPassword[i]=='9'){
                    aucResult[i]='0';
                }else{
                    aucResult[i]=(char)(aucPassword[i]+1);
                }
            }
            else{
                aucResult[i]=aucPassword[i];
            }
        }
    }
    private static void unEncrypt (char result[], char password[]){
        for(int i=0;i<result.length;i++){
            if(Character.isLetter(result[i])){
                if(Character.isLowerCase(result[i])){
                    if(result[i]=='a'){
                        password[i]='Z';
                    }else
                    {
                        password[i]=(char)('A'+result[i]-'a'-1);
                    }
                }
                else
                {
                    if(result[i]=='A'){
                        password[i]='z';
                    }else{
                        password[i]=(char)('a'+result[i]-'A'-1);
                    }
                }
            }
            else if(Character.isDigit(result[i])){
                if(result[i]=='0'){
                    password[i]='9';
                }else{
                    password[i]=(char)(result[i]-1);
                }
            }
            else{
                password[i]=result[i];
            }
        }
    }
}
