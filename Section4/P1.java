import java.util.Scanner;
public class P1{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");   n=sc.nextInt();
        if(n<0){
            System.out.println("n is lower than 0");
        }else{
            System.out.println("n is higher than 0");
        }
        sc.close();
    }
}