import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("1. Sayı: ");
        int num1 = in.nextInt();
        System.out.print("2. Sayı: ");
        int num2 = in.nextInt();
        System.out.println();

        // EBOB
        int i = num1;

        while (num1 > 0) {
            if (num1 % i == 0) {
                if (num2 % i == 0) {
                    System.out.println("EBOB(" + num1 + ", " + num2 + ") = " + i);
                    break;
                }
            }
            i--;
        }

        //EKOK
        boolean h =true;
        int y = num1;
        int x = num2;

        while (h) {
            while (y <= x) {
                if (y == x) {
                    h =false;
                    System.out.println("EKOK("+num1+" ,"+num2+") = "+y);
                }
                y+=num1;
            }
            x+=num2;
        }
    }
}
