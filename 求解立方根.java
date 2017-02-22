import java.awt.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double n=input.nextDouble();
        double e=0.0001;
        double t=n;
        while(Math.abs(t*t*t-n)>e){
            t=t-(t*t*t-n)*1.0/(3*t*t);
        }
        System.out.print(String.format("%.1f",t));
    }

}


/*
链接：https://www.nowcoder.com/questionTerminal/caf35ae421194a1090c22fe223357dca?toCommentId=82708
来源：牛客网

牛顿迭代法。设f(x)=x3-y, 求f(x)=0时的解x，即为y的立方根。
根据牛顿迭代思想，xn+1=xn-f(xn)/f'(xn)即x=x-(x3-y)/(3*x2)=(2*x+y/x/x)/3;
 */