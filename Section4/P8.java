import java.util.Scanner;
public class P8{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");    n=sc.nextInt();
        if(n%6==0){
            System.out.println("6の倍数です");
        }else{
            if(n%2==0){
                System.out.println("2の倍数ですが3の倍数ではありません");
            }
            else if(n%3==0){
                System.out.println("3の倍数ですが2の倍数ではありません");
            }else{
                System.out.println("3の倍数でも2の倍数でもありません");
            }
        }
        sc.close();
    }
}