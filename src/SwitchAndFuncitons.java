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
//        int amount = 1330;
//        int hundreds = 0, fifties = 0, twenties = 0, tens = 0, ones = 0;
//
//        while (amount > 0) {
//            switch (amount) {
//                default:
//                    hundreds = amount / 100;
//                    amount %= 100;
//                    fifties = amount / 50;
//                    amount %= 50;
//                    twenties = amount / 20;
//                    amount %= 20;
//                    tens = amount / 10;
//                    amount %= 10;
//                    ones = amount;
//                    amount = 0;
//                    break;
//            }
//        }
//
//        System.out.println("100 notes: " + hundreds);
//        System.out.println("50 notes: " + fifties);
//        System.out.println("20 notes: " + twenties);
//        System.out.println("10 notes: " + tens);
//        System.out.println("1 notes: " + ones);

        // nCr
//        int n = 5;
//        int r = 3;
//        int fn = factorial(n);
//        int fr = factorial(r);
//        int fnr = factorial(n - r);
//        System.out.println("nCr "+ fn/(fr*fnr));

        // First 10 prime no;
//        int count = 0;
//        int i = 2;
//        while (count < 10) {
//            if(isPrime(i)) {
//                System.out.println(i);
//                count++;
//            }
//            i++;
//        }


//        System.out.println(AP(3)); // AP
//        System.out.println(nthFibo(5)); // nthFibo
//        System.out.println(setBits(5)); // setBits
//        System.out.println(aAndb(5, 8)); // totalSetBits


//        In Java, you cannot define a function inside the main method
//        or any other method. Java does not support nested functions.

        // Pass By Value
//        int a = 10;
//        update(a);
//        System.out.println(a);

//        int a = 15;
//        update2(a);
//        System.out.println(a);

//        int a = 14;
//        a = update3(a);
//        System.out.println(a);


    }

    // Functions

    //   nCr / Factorial
    public static int factorial(int n) {
        int i = 1;
        int f = 1;
        while (i <= n) {
            f = f * i;
            i++;
        }
        return f;
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int i = 3;
        while (i * i <= n) {
            if (n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static int AP(int n) {
        return 3 * n + 7;
    }

    public static int nthFibo(int n) {
        int t1 = 0;
        int t2 = 1;
        int i = 2;
        while (i <= n) {
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            i++;
        }
        return t1;
    }

    public static int aAndb(int a, int b) {
        return setBits(a) + setBits(b);
    }

    public static int setBits(int a) {
        int count = 0;
        while (a != 0) {
            int rem  = a & 1;
            if(rem == 1) count++;
            a = a >> 1;
        }
        return count;
    }
    public static void update(int a){
        a = a / 2;
    }

    public static int update2(int a) {
        a -= 5;
        return a;
    }
public static int update3(int a) {
       int ans = a * a;
        return ans;
    }
}
