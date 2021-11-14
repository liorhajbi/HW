import java.util.Scanner;

public class Q5 {

    public static double salary1(int typeWorker, int hourWork, int dailyGoal) {
        double salary;

        if (typeWorker == 0) {
            salary = 50 * hourWork + 250 * dailyGoal;
        } else {
            salary = 200 * hourWork + 250 * dailyGoal;

        }

        return salary;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeWorker, worker2;
        do {
            System.out.println("enter 0 for junior or 1 for senior");
            typeWorker = scanner.nextInt();
        }
        while (typeWorker < 0 || typeWorker > 1);
        System.out.println("enter the number of hours you worked this month");
        int hourWork = scanner.nextInt();



        System.out.println("enter the number of days you reached the daily goal ");
        int dailyGoal = scanner.nextInt();
        System.out.println("your salary this month is" + salary1(typeWorker, hourWork, dailyGoal));

        do {
            System.out.println("to continue with another worker press 5");
            worker2 = scanner.nextInt();
        }
        while (worker2!=5);
        System.out.println("the salary of worker2 is"+salary1(typeWorker,hourWork,dailyGoal));
        }

    }
