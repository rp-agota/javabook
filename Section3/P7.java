import java.util.Scanner;
public class P7{
    public static void main(String[] args){
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number=");    number=sc.nextInt();
        int ju=number/10;
        int ichi=number%10;
        System.out.println("10..."+ju+"\n1..."+ichi);
        sc.close();
    }
}