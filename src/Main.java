import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,c,b,vEnd;

        Scanner scan = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        a = scan.nextInt();
        b=a+1;



        System.out.print("son sayıyı giriniz: ");
        vEnd = scan.nextInt();

        for (int i=a; i<vEnd;a++){
            System.out.print(i+ " ");
            c=i+b;
            i=b;
            b=c;
        }

    }
}
