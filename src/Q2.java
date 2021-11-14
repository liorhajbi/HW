import java.util.Scanner;
public class Q2 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int firstNum= scanner.nextInt();
        System.out.println("enter second number");
        int secondNum= scanner.nextInt();
        int sum=firstNum+secondNum;
        if(sum%2==0){
            System.out.println("the sum is even");}
            else{
                System.out.println("the sum is odd");

            }


    }
}
