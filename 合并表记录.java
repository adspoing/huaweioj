import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int[] temp=new int[1001];
        for(int i=0;i<n;i++){
            int tm=input.nextInt();
            if(temp[tm]!=0){
                temp[tm]+=input.nextInt();
            }
            else
                temp[tm]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(temp[i]>0){
                System.out.println(i);
                System.out.println(temp[i]);
            }
        }
    }

}


