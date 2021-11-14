import java.util.Scanner;
public class Q7 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the day you can come");
        int days = scanner.nextInt();
        switch (days) {
            case 1:
            case 2:
            case 4:
            case 5:
                System.out.println("enter the most early hour you can come");
                int  mostEarly = scanner.nextInt();
                System.out.println("enter the most late hour you can come");
                int  mostLate = scanner.nextInt();
                if(mostEarly<0||mostLate>23)
                    System.out.println("the hour you entered doest exist");
                else if(mostEarly<9||mostLate>17)
                    System.out.println("the office is working in those hours:9-17");
                if(mostEarly>8&&mostLate<12) {
                    if(mostEarly>mostLate)
                        System.out.println("the hours you entered are incorrect");
                    else
                        System.out.println("your meeting is booked");

                }
                break;
            case 3:
                System.out.println("enter the most early hour you can come");
                  mostEarly = scanner.nextInt();
                System.out.println("enter the most late hour you can come");
                  mostLate = scanner.nextInt();
                if(mostEarly<0||mostLate>23)
                    System.out.println("the hour you entered doest exist");
                if(mostEarly<8||mostLate>12)
                    System.out.println("the office is working in those hours:8-12");
                if(mostEarly>8&&mostLate<12) {
                    if(mostEarly>mostLate)
                        System.out.println("the hours you entered are incorrect");
                    else
                        System.out.println("your meeting is booked");
                    //break;
                }

                break;
            case 6:
            case 7:
                System.out.println("the office is closed");
                break;
            default:
                System.out.println("the day you entered doest exist");
                break;
        }



            }



            }


