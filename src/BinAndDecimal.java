public class BinAndDecimal {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(5));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(decToBin2(Integer.MAX_VALUE)); // only works till +999

//        System.out.println(Integer.toBinaryString(~(-6)));
//        System.out.println(decToBinNeg(-6));
//        System.out.println(binToDec(1010));
        System.out.println(bitwiseComplement(1010));
    }

    // Decimal to Binary
    public static int decToBin(int n) {
        int ans = 0;
        int i = 0;
        while (n > 0) {
            int rem = n % 2;
            ans = rem * (int) (Math.pow(10, i)) + ans;
            n /= 2;
            i++;
        }
        return ans;
    }

    public static int decToBin2(int n) {
        int ans = 0;
        int i = 0;
        while (n > 0) {
            int rem = n & 1; // bitwise AND // returns remainder
            ans = rem * (int) (Math.pow(10, i)) + ans;
            n = n >> 1; // divides by 10 but in int
            i++;
        }
        return ans;
    }

    public static int decToBinNeg(int n) {
        int ans = 0;
        int i = 0;
        int num = ~n;
        while (num > 0) {
            int rem = num & 1;
            ans = rem * (int) (Math.pow(10, i)) + ans;
            num = num >> 1;
            i++;
        }
        return ans;
    }

    public static int binToDec(int n) {
        int i = 0;
        int ans = 0;
        while (n != 0) {
//            int rem = n & 1;
            int rem = n % 10;
            if (rem == 1) {
                ans = ans + rem * (int) (Math.pow(2, i));
            }
            n = n / 10;
            i++;
        }
        return ans;
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int rem = x % 10;
            if (ans < Integer.MIN_VALUE / 10 || ans > Integer.MAX_VALUE / 10) {
                return 0;
            }
            ans = ans * 10 + rem;
            x /= 10;
        }
        return ans;

    }

    public static int bitwiseComplement(int n) {
        int m = n;
        int mask = 0;
        if (n == 0) {
            return 1;
        }
        while (m != 0) {
            mask = (mask << 1) | 1; // (mask)-1111 & 0101 =
            m = m >> 1;
        }
        int ans = (~n) & mask; // 0101 & 1111
        return ans;
    }

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

        public boolean isPowerOfTwo2(int n) {
          int ans = 1;
          for(int i = 0; i <= 30; i++) {
              if(ans == n) {
                  return true;
              }
              if(ans < Integer.MAX_VALUE/2) {
                  ans = ans * 2;
              }
          }
          return false;
    }



}
