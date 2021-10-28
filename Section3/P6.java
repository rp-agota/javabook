import java.util.Scanner;
public class P6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,h;
        System.out.print("Joutei=");   a=sc.nextInt();
        System.out.print("Katei=");    b=sc.nextInt();
        System.out.print("High=");   h=sc.nextInt();
        System.out.println("S="+((double)(a+b)*h)/2.0);
        sc.close();
    }
}