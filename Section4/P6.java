import java.util.Scanner;
public class P6{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("a=");     a=sc.nextInt();
        System.out.print("b=");     b=sc.nextInt();
        System.out.print("c=");     c=sc.nextInt();

        if(a<b){
            if(b<c){
                System.out.println(c);
            }else{
                System.out.println(b);
            }
        }else{
            if(a<c){
                System.out.println(c);
            }else{
                System.out.println(a);
            }
        }
        sc.close();
    }
}