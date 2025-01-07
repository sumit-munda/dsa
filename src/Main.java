import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // util package

        System.out.println("Hello World"); // lang package
//        System.out.println(Integer.SIZE);
//        System.out.println(Integer.BYTES);

//        int code = 'a'; // ascii value
//        System.out.println(code);

//        char ch = 101; // typecast but only below 65535 - 2^16 - 1
//        System.out.println(ch);

//        char ch2 = (char) 75536; // 75536 % 65536 = 1000
//        System.out.println(ch2); // 1000 ascii value

//        Integer n = -1000;
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(n.getClass());

//        note
//        System.out.println(2/ 5); // int by int - float
//        System.out.println(2/ 5.0); // int by float - float
//        System.out.println(2.0/ 5.0f); // float by float - float

//        int c = 'a';
//        System.out.println(c);
//
//        byte b = 100;
//        int i1 = b * 2;
//        b = (byte) i1;
//        System.out.println(b); // 200 % 256 = -56

//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("Entered values: " + a + b);

//       char ch = in.next().charAt(10);
//        System.out.println((int)(ch));

//        int n1 = in.nextInt();
//        int n2 = in.nextInt();
//        int n3 = in.nextInt();
//
//        if (n1 > n2) {
//            if (n1 > n3) System.out.println(n1 + " is Greatest!");
//            else System.out.println(n3 + " is Greatest!");
//        } else {
//            if (n2 > n3) System.out.println(n2 + " is Greatest!");
//            else System.out.println(n3 + " is Greatest!");
//        }

//        System.out.println(prime(173));

//        String Interpolation // formatted strings // %s %d (format specifiers)
        // printf - pretty printing...
//        String name = "Kunal";
//        int age = 24;
//        System.out.println(String.format("Hello, I am %s and my age is %d", name, age));
//        System.out.println(("Hello, I am %s and my age is %d").formatted(name, age));
//        System.out.printf("Hello, I am %s and my age is %d", name, age);

        // Patterns
        // Pattern 1
//        int i = 1;
//        while (i <= 5) {
//            int j = 1;
//            while (j <= 5) {
//                System.out.print(i);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 2
//        int i = 1;
//        while(i <= 5) {
//            int j = 1;
//            while(j <= 5) {
//                System.out.print(j);
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 3
//        int i = 1;
//        while (i <= 5) {
//            int j = 5;
//            while(j >= 1) {
//                System.out.print(j);
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 3
//        System.out.print("Enter no of rows: ");
//        int n = in.nextInt();
//        int i = 1;
//        int c = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(c);
//                c++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 3 alter

//        System.out.print("Enter no of rows: ");
//        int n = in.nextInt();
//        int i = 1;
//        int c = 1;
//        while (i <= n*n) {
//            if(c % n == 1) {
//                System.out.println();
//            }
//            System.out.print(c + " ");
//            c++;
//            i++;
//        }
//                   |\
        // Pattern 4 |_\
        System.out.print("Enter no of rows: ");
        int n = in.nextInt();
//        int i = 1;
//        while (i <= n ) {
//            int j = 1;
//            while(j <= i) {
//                System.out.print("* ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 5
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(i + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 6
//        int i = 1;
//        int c = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= i) {
//                System.out.print(c + " ");
//                c++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 6
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//                int c = i;
//            while (j <= i) {
//                System.out.print(c + " ");
//                c++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }
//

        // Pattern 6
//        int i = 1;
//        while (i <= n) {
//            int j = i;
//            while (j < i + i) {
//                System.out.print(j + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 7
//        int i = 1;
//        while (i <= n) {
//            int j = i;
//            while (j >= 1) {
//                System.out.print(j + " ");
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 8
//        int i = 1;
//        char c;
//        while (i <= n) {
//            int j = 1;
//            c = (char) ('A' + i - 1);
//            while (j <= n) {
//                System.out.print(c + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 9
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            char ch = 'a';
//            while (j <= n) {
//                System.out.print(ch + " ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }


        // Pattern 9
//        int i = 1;
//        char ch = 'a';
//        while (i <= n) {
//            int j = 1;
//            while (j <= n) {
//                System.out.print(ch + " ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 10
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            char ch  = (char)('a' + i - 1);
//            while (j <= n) {
//                System.out.print(ch + " ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 11
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            char ch  = (char)('a' + i - 1);
//            while (j <= i) {
//                System.out.print(ch + " ");
//                j++;
//            }
//            System.out.println();
//            i++;
//
        // Pattern 12
//        int i = 1;
//        while(i <= n) {
//            int j = i;
//            char ch = (char)('a' + i - 1);
//            while(j < i + i) {
//                System.out.print(ch + " ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 13
//        int i = 1;
//        while(i <= n) {
//            int j = 1;
//            char ch = (char)('A' + (n - i));
//            while (j <= i) {
//                System.out.print(ch + " ");
//                ch++;
//                j++;
//            }
//            System.out.println();
//            i++;
//        }

//                     /|
        // Pattern 14 /_|
//        int i = 1;
//        while(i <= n) {
//            int j = n;
//            while (j > i) {
//                System.out.print("  ");
//                j--;
//            }
//            int k = 1;
//            while (k <= i) {
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

//                    ___
//                    | /
        // Pattern 14 |/
//        int i = 1;
//        while (i <= n) {
//            int j = n;
//            while (j >= i) {
//                System.out.print("* ");
//                j--;
//            }
//            System.out.println();
//            i++;
//        }

//                   ___
//                   \ |
        // Pattern 15 \|
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j < i) {
//                System.out.print("  ");
//                j++;
//            }
//
//            int k = 1;
//            while (k <= n - i + 1) {
//                System.out.print("* ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
//                      ^
//                     / \
        // Pattern 16 /___\
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j <= n - i) {
//                System.out.print("  ");
//                j++;
//            }
//            int k = 1;
//            while (k <= i) {
//                System.out.print(k + " ");
//                k++;
//            }
//            int l  = i - 1;
//            while (l >= 1) {
//                System.out.print(l + " ");
//                l--;
//            }
//        System.out.println();
//        i++;
//    }

        // Pattern 15
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j < i) {
//                System.out.print("  ");
//                j++;
//            }
//
//            int k = i;
//            while (k <= n) {
//                System.out.print(i + " ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 16
//        int i = 1;
//        while (i <= n) {
//            int j = i;
//            while (j < n) {
//                System.out.print("  ");
//                j++;
//            }
//            int k = 1;
//            while (k <= i) {
//                System.out.print(i + " ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 16
//        int i = 1;
//        while (i <= n) {
//            int j = 1;
//            while (j < i) {
//                System.out.print("  ");
//                j++;
//            }
//            int k = i;
//            while (k <= n) {
//                System.out.print(k + " ");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 16
//        int i = 1;
//        int c = 1;
//        while (i <= n) {
//            int j = i;
//            while (j < n) {
//                System.out.print("  ");
//                j++;
//            }
//            int k = 1;
//            while (k <= i) {
//                System.out.print(c + " ");
//                c++;
//                k++;
//            }
//            System.out.println();
//            i++;
//        }

        // Pattern 17 Mega
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i + 2) {
                System.out.print(j);
                j++;
            }
            int k = 1;
            while (k < i) {
                System.out.print("**");
                k++;
            }
            int l = n - i + 2;
            while (l >= 1) {
                System.out.print(l);
                l--;
            }
            System.out.println();
            i++;

        }



}

public static boolean prime(int n) {
    if (n == 0 || n == 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;

    else {
        int i = 3;
        while (i <= n) {
            if (n % i * i == 0) {
                return false;
            } else i += 2;
        }
        return true;
    }
}
}

/*
Data Types - Primitives and Reference Types
Type - Size(bytes), (bits)
1. Primitives - stored directly in the stack
byte - 1, 8 - range -128 to 127
boolean - 1, 8
char - 2, 16
short - 2, 16 - range -32,768 to 32,767
int - 4, 32
float - 4, 32 - 2.44f
double - 8, 64 - 244 (default)
long - 8, 64 - 23241235452423545l

Type Conversion - implicit(type conversion), explicit(type casting)
1. implicit - char to int, long, float, double
2. explicit(data loss) -

String to a number using parse... eg. Float.parseFloat("1.23")

2. Reference Types - reference vars stored in stack pointing to objects in heap
Array -
String - for string interpolation - String.format("", a, b); or "".formatted(a, b);
Object -
Size depends on JVM and the underlying architecture.
32-bit JVM - 4 bytes
64-bit JVM - 8 bytes

Bits Representation of Numbers ---------
int - 32bits - 1 byte = 00000000 in binary 0 or 1
range - -2^31 to 2^31 - 1 // only one zero
+ve int = 1 at the beginning
-ve int = 0 at the beginning

-ve binary representation of numbers
1. 1's complement - complement of each digit
2. 2's complement - 1's complement + 1
for ex. 5 - 00000101
1's complement - 11111010
2's complement - 11111011 - (-5)

Conditionals -------------------
if-else
while loop


*/
