import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");     n=sc.nextInt();
        if(n<0){
            System.out.println(n*(-1));
        }else{
            System.out.println(n);
        }
        sc.close();
    }
}