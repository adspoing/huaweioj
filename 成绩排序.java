import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static class Stu{
        String name;
        int score;
        public Stu(String name,int score){
            this.name=name;
            this.score=score;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        final int range=input.nextInt();
        Stu[] stu=new Stu[n];
        for(int i=0;i<n;i++){
            String name=input.next();
            int score=input.nextInt();
            stu[i]=new Stu(name,score);
        }
        Arrays.sort(stu, new Comparator<Stu>() {
            @Override
            public int compare(Stu o1, Stu o2) {
                if(range==0){
                    return o2.score-o1.score;
                }else
                    return o1.score-o2.score;
            }
        });
        for(Stu tmp:stu){
            System.out.println(tmp.name+" "+tmp.score);
        }
    }
}


