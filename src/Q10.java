import java.util.Random;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNum = random.nextInt(1000);
        int cnt1 = 0;
        int cnt2 = 0;
        int player = 0;
        boolean isOver = false;


        while (isOver == false) {

            if (player == 0) {
                cnt1++;
                System.out.println("user 1 enter your guess");
                int guess = scanner.nextInt();
                isOver = play(guess, randomNum, cnt1);
                player = 1;
            }
            else {
                cnt2++;
                System.out.println("user 2 enter your guess");
                int guess = scanner.nextInt();
                isOver = play(guess, randomNum, cnt2);
                player = 0;
            }
        }
    }

    public static boolean play(int guess, int randomNum, int cnt) {
        if (randomNum < guess) {
            System.out.println("the secret number is smaller than your guess");
        } else if (randomNum > guess) {
            System.out.println("the secret number is bigger than your guess");
        } else {
           System.out.println("you won after guesses" + cnt);
           return true;
        }
        return false;
    }


    }












