import java.util.Scanner;
public class Q6 {

    public static void printSeries(int firstNum, int difference, int amountNum) {

        int[] a = new int[amountNum];

        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.println(firstNum);
            } else {
                System.out.println(firstNum + i * difference);
            }
        }



    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int firstNum = scanner.nextInt();
        System.out.println("enter the difference");
        int difference = scanner.nextInt();
        System.out.println("enter the amountNum");
        int amountNum = scanner.nextInt();
        printSeries(firstNum, difference, amountNum);
    }
    }

