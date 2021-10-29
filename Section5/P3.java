import java.util.Scanner;
public class P3{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");    n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        System.out.println("ans="+ans);
        sc.close();
    }
}