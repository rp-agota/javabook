import java.util.Scanner;
public class P5{
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("x=");    x=sc.nextInt();
        System.out.print("y=");    y=sc.nextInt();
        System.out.print("z=");    z=sc.nextInt();
        int S1=x*y;
        int S2=x*z;
        int S3=y*z;
        int S=(S1*2)+(S2*2)+(S3*2);
        System.out.println("S="+S);
        sc.close();
    }
}