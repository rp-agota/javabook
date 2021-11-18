import java.util.Scanner;
public class P2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int cnt=0;
        System.out.print("x=");
        int x=sc.nextInt();
        while(x!=0){
            x/=10;
            cnt++;
        }
        System.out.println("cnt="+cnt);
    }
}