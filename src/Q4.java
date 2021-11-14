import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inSqrt,sqrt,x1,x2;
        System.out.println("enter first number");
        int a=scanner.nextInt();
        System.out.println("enter second number");
        int b=scanner.nextInt();
        System.out.println("enter third number");
        int c=scanner.nextInt();

         inSqrt=b*b-4*a*c;
         sqrt=Math.sqrt(inSqrt);
         x1=(-b+sqrt)/2*a;
        x2=(-b-sqrt)/2*a;

        if(inSqrt>0){
            System.out.println("there are 2 answers:"+ x1 +""+x2);}
        else if(inSqrt==0){
            System.out.println("there is 1 answer:"+x1 ) ;}

        else{
            System.out.println("there is no answer");
        }


        }

        }










