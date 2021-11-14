import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, mid, max;
        System.out.println("enter first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        System.out.println("enter third number");
        int num3 = scanner.nextInt();

        if (num1 < num2 && num1 < num3) {
            min = num1;
            if (num2 < num3) {
                mid = num2;
                max = num3;
            } else {
                mid = num3;
                max = num2;
            }

        }else if (num2 < num1 && num2 < num3) {
                min = num2;
                if (num1 < num3) {
                    mid = num1;
                    max = num3;
                } else {
                    mid = num3;
                    max = num1;
                }
            }

            else{
                min = num3;
                if (num1 < num2) {
                    mid = num1;
                    max = num2;
                }else {
                    mid = num2;
                    max = num1;
                }


                }
        System.out.println(min+""+mid+""+max);
            }

        }









