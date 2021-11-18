import java.util.Scanner;
public class P3{
    public static void main(String[] args){
        System.out.print("x=");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int ans=0,tmp;
        while(x!=0){
            tmp=x%10;
            x/=10;
            ans+=tmp;
        }
        System.out.println("ans="+ans);
    }
}