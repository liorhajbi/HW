import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {

        boolean isRemainder = false;
        int newPositive = positiveNum();
        primeNum(newPositive);
        for (int i = 2; i < newPositive; i++) {
            boolean isPrime = primeNum(i);
            if (isPrime ==true){
                System.out.print(i + " ");
            }



        }
    }


    public static boolean noRemainder(int num1, int num2) {
        boolean isRemainder;
        if (num1 % num2 == 0) {
            isRemainder = true;
        } else {
            isRemainder = false;
        }
        return isRemainder;
    }

    public static boolean primeNum(int num) {


        boolean isPrime=true;
        for (int i = 2; i < num; i++) {
            noRemainder(num, i);
            if (noRemainder(num,i)== true) {
                isPrime = false;
            }
        }
        return isPrime;
    }


        public static int positiveNum () {
            Scanner scanner = new Scanner(System.in);
            int positive = 0;
            do {
                System.out.println("enter a positive number");
                positive = scanner.nextInt();
            }
            while (positive < 0);


            return positive;
        }
    }







