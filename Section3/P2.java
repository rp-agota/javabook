import java.util.Scanner;
public class P2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high,width;
        System.out.print("High...");        high=sc.nextInt();
        System.out.print("Width...");       width=sc.nextInt();
        System.out.println("S="+(high*width));
        sc.close();
    }
}