import java.util.Scanner;
public class P3{
    public static void main(String[] args) {
        int r;
        Scanner sc = new Scanner(System.in);
        System.out.print("2R=");    r=sc.nextInt();
        System.out.println("2R*pi="+(r*3.14));
        sc.close();
    }
}