package task;
import java.util.Scanner;
import java.lang.Math;

public class task {
    public static void main(String[] arg) {

        /* Напишете програма, която отпечатва боят на буквите на
        първото ви име, след това го отпечатайте веднъж само с главни
        букви, и веднъж само с малки.
         */
        Scanner name = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String myName = name.next();
        System.out.println("Your name contains\t"  + myName.length() + "\tletters" );

         /* Напишете програма, която да събира две числа и да отпечатва
         резултата в конзолата.
         */
        Scanner firstNumber = new Scanner(System.in);
        System.out.println("Please enter your first number");
        long a = firstNumber.nextLong();

        Scanner secondNumber = new Scanner(System.in);
        System.out.println("Please enter your second number");
        long b = secondNumber.nextLong();
        System.out.println("The sum of the two numbers is\n" + (a+b));


        /*
        Напишете програма, която да показва абсолютната стойност на
        числата: -147, 15, 0, 18, резултата да се отпечатват на един и
        съши ред, с разделение табулация.
         */

        int firstNum = Math.abs(-147);
        int secondNum= Math.abs(15);
        int thirdNum = 0;
        int fourthNum = Math.abs(15);
        int fifthNum = Math.abs(18);

        System.out.print("The absolute values are :\t" + fifthNum + "\t" + secondNum + "\t" + thirdNum + "\t" + fourthNum + "\t" + firstNum);

        /*
        Напишете програма, която изчислява корен квадратен на
        числата: 8, 353, 78, 3, -67, 723, 2000, -100, резултатите да се
        отпечатват на един и същи ред.
         */

        double squareRoot1 = Math.sqrt(8);
        double squareRoot2 = Math.sqrt(353);
        double squareRoot3 = Math.sqrt(78);
        double squareRoot4 = Math.sqrt(3);
        double squareRoot5 = Math.sqrt(-67);
        double squareRoot6 = Math.sqrt(723);
        double squareRoot7 = Math.sqrt(2000);
        double squareRoot8 = Math.sqrt(-100);


        System.out.print("\n" + "Тhe square root of the numbers are:\n" + squareRoot1+ "\t" + squareRoot2 + "\t" + "\t" +squareRoot3 +"\t" + squareRoot4 + "\t" + squareRoot5 + "\t" + squareRoot6 + "\t" + squareRoot7 + "\t" + squareRoot8 );

        /*
        Напишете програма, която повдига на степен 2-ра числата: -20,
        92, 638, 73, 200, -22, резултатите да се отпечатват на един и
        същи ред.
         */
        double number1 = Math.pow(-20,2);
        double number2= Math.pow(92,3);
        double number3 = Math.pow(638,2);
        double number4 = Math.pow(73,2);
        double number5 = Math.pow(200,2);
        double number6 = Math.pow(-22,2);

        System.out.print("\n" + "The numbers of the second degree are" +"\n" +number1 + "\t" + number2 + "\t" + number3 + "\t" + number4 + "\t" + number5 + "\t" + number6);
    }
}

