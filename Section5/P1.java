import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");     n=sc.nextInt();
        System.out.print("m=");     m=sc.nextInt();

        int ans=1;
        for(int i=0;i<m;i++){
            ans*=n;
        }
        System.out.println("ans="+ans);
        sc.close();
    }
}