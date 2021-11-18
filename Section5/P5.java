import java.util.Scanner;
public class P5{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("n=");     n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        sc.close();
    }
}