import java.util.Scanner;
public class P4{
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("r=");    r=sc.nextInt();
        System.out.println("r^2*pi="+(r*r*3.14));
        sc.close();
    }
}