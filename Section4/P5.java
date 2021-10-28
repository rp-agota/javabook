import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");     a=sc.nextInt();
        System.out.print("b=");     b=sc.nextInt();

        if(a<b){
            System.out.println(b);
        }
        else if(a==b){
            System.out.println("equal");
        }else{
            System.out.println(a);
        }
        sc.close();
    }
}