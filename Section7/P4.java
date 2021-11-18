import java.util.Scanner;
public class P4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("x=");
        int x=sc.nextInt();
        int wa=0,i=1;
        while(x>=wa){
            wa+=i;
            i++;
        }
        System.out.println("ans="+i);
    }
}