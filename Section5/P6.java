import java.util.Scanner;
public class P6{
    public static void main(String[] args){
        int n,m;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");    n=sc.nextInt();
        System.out.print("m=");    m=sc.nextInt();
        int ans=0;
        for(int i=1;i<=m;i++){
            if(m%i==0&&n%i==0){
                ans++;
            }
        }
        System.out.println("ans="+ans);
        sc.close();
    }
}