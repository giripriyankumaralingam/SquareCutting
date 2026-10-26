import java.util.Scanner;

public class SquareCutting {

    public int SquareCutting(int a, int b) {
        if (a== 0 || b == 0) {
            return 0;
        }else if (a > b) {
            a = a - b;
            return 1 + SquareCutting(a, b);
        }else if (b > a){
            b = b - a;
            return 1 + SquareCutting(a, b);
        }else{
            return 1;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SquareCutting square = new SquareCutting();
        int a = 0;
        int b = 0;

        System.out.println("Wie lang ist die Seite a?");
        while (!sc.hasNextInt()) {
            System.out.println("Geben Sie für die Seite a eine Zahl!");
            sc.next();
        }
        a = sc.nextInt();
        if (a < 0) {
            a = a * (-1);
        }

        System.out.println("Wie lang ist die Seite b?");
        while (!sc.hasNextInt()) {
            System.out.println("Geben Sie für die Seite b eine Zahl!");
            sc.next();
        }
        b = sc.nextInt();
        if (b < 0) {
            b = b * (-1);
        }

        sc.close();

        System.out.println("Die Anzahl der Quadrate sind: " + square.SquareCutting(a, b));

    }
}
