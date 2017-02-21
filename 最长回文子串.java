import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String ss = input.next();
        System.out.print(longestPalindrome(ss));
    }
    public static int longestPalindrome(String s){
        int n=s.length();
        boolean[][] pal=new boolean[n][n];
        int maxlen=0;
        for(int i=0;i<n;i++){
            int j=i;
            while (j >= 0) {
                if(s.charAt(i)==s.charAt(j)&&(i-j<2||pal[j+1][i-1])){
                    pal[j][i]=true;
                    maxlen=Math.max(maxlen,i-j+1);
                }
                j--;
            }
        }
        return maxlen;
    }
}



