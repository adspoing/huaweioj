import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        char[] word=scanner.next().toCharArray();
        ArrayList<String> wordlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            String temp=scanner.next();
            wordlist.add(temp);
        }
        ArrayList<String>result=new ArrayList<>();
        permutation(word,0,word.length,result);
        int k=scanner.nextInt();
        int count=0;
        String res="";
        for(String ss:result){
            for(String tm:wordlist){
                if(tm.equals(ss)&&ss.equals(String.valueOf(word))==false){
                    count++;
                    if(count==k){
                        res=tm;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(res);
    }
    public static void permutation(char[] word,int start,int end,ArrayList<String> result){
        if(start==end){
            result.add(String.valueOf(word));
            return;
        }

        else{
            for(int i=start;i<end;i++){
                swap(word,start,i);
                permutation(word,start+1,end,result);
                swap(word,start,i);
            }
        }
    }
    public static void swap(char[] word,int i,int j){
        char t=word[i];
        word[i]=word[j];
        word[j]=t;
    }
}
