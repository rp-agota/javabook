import java.util.Scanner;
public class P4{
    public static void main(String[] args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");     a=sc.nextInt();
        System.out.print("b=");     b=sc.nextInt();
        if(a%b==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}