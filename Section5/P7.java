import java.util.Scanner;
public class P7{
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");     n=sc.nextInt();
        System.out.print("m=");     m=sc.nextInt();
        int ans=0;
        for(int i=1;i<=m*n;i++){
            if(i%m==0&&i%n==0){
                ans++;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}