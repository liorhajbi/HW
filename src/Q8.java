import java.util.Scanner;
public class Q8 {

    public static int range() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter number between 5-20");
            num = scanner.nextInt();
        }
        while (num < 5 || num > 20);
        return num;
    }

    public static void printStars(int num) {

            for (int i = 0; i <= num; i++) {
                System.out.println(" ");
                for (int I = 0; I < i; I++) {
                    System.out.print("*");
                }
            }
            System.out.println(" ");
            return;

    }


     public static void main(String[] args) {
      int returnNum=range();
       printStars(returnNum);
    }


    }

