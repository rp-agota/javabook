import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("x=");
        int x=sc.nextInt();
        System.out.print("y=");
        int y=sc.nextInt();
        while(x>=y){
            x-=y;
        }
        System.out.println("x%y="+x);
    }
}