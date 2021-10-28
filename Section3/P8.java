import java.util.Scanner;
public class P8{
    public static void main(String[] args){
        int in;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input=");     in=sc.nextInt();
        int c500=in/500;
        in-=c500*500;
        int c100=in/100;
        in-=c100*100;
        int c50=in/50;
        in-=c50*50;
        int c10=in/10;
        in-=c10*10;
        int c5=in/5;
        in-=c5*5;
        int c1=in/1;

        System.out.println("500 yen..."+c500);
        System.out.println("100 yen..."+c100);
        System.out.println("50 yen..."+c50);
        System.out.println("10 yen..."+c10);
        System.out.println("5 yen..."+c5);
        System.out.println("1 yen..."+c1);
        sc.close();
    }
}