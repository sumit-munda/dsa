import java.util.Scanner;

public class SwitchAndFuncitons {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // mini calculator
//        while (true) {
//            System.out.print("Enter Two Numbers: ");
//            int a = in.nextInt();
//            int b = in.nextInt();
//            System.out.print("Enter operator: ");
//            char op = in.next().charAt(0);
//            switch (op) {
//                case '+':
//                    System.out.println(a + b);
//                    break;
//                case '-':
//                    System.out.println(a - b);
//                    break;
//                case '/':
//                    if(b != 0) System.out.println(a/b);
//                    break;
//                case '*':
//                    System.out.println(a * b);
//                    break;
//                case '%':
//                    System.out.println(a % b);
//                    break;
//                case 'x':
//                    System.out.println("Exiting...");
//                    return;
//                default:
//                    System.out.println("invalid!");
//
//            }
//        }

        // denominations problem using only if
//        int amount = 1335;
//        while(amount > 0) {
//            if(amount >= 100) {
//                System.out.println("100notes " + amount / 100);
//                amount %= 100;
//            }
//            if(amount >= 50) {
//                System.out.println("50notes " + amount / 50);
//                amount %= 50;
//            }
//            if(amount >= 20) {
//                System.out.println("20notes " + amount / 20);
//                amount %= 20;
//            }
//            if(amount >= 10) {
//                System.out.println("10notes " + amount / 10);
//                amount %= 10;
//            }
//            if(amount >= 1) {
//                System.out.print("1notes " + amount / 1);
//                break;
//            }
//        }

        // denominations problem using switch
        int amount = 1330;
        int hundreds = 0, fifties = 0, twenties = 0, tens = 0, ones = 0;

        while (amount > 0) {
            switch (amount) {
                default:
                    hundreds = amount / 100;
                    amount %= 100;
                    fifties = amount / 50;
                    amount %= 50;
                    twenties = amount / 20;
                    amount %= 20;
                    tens = amount / 10;
                    amount %= 10;
                    ones = amount;
                    amount = 0;
                    break;
            }
        }

        System.out.println("100 notes: " + hundreds);
        System.out.println("50 notes: " + fifties);
        System.out.println("20 notes: " + twenties);
        System.out.println("10 notes: " + tens);
        System.out.println("1 notes: " + ones);

    }
}
