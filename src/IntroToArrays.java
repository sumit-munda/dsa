import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntroToArrays {
    public static void main(String[] args) {

//        int n = 25;
//        int[] arr = new int[10];
//        for(int i = 0; i < 10; i++) {
//            arr[i] = n;
//        }
//        System.out.println(Arrays.toString(arr));

//In Java, all object references are passed by value.
// This means that when you pass an object to a method,
// you are passing a copy of the reference to that object,
// not the actual object itself. However, because the reference
// points to the same object in memory, any modifications made to
// the object through that reference will affect the original object.

//        int[] arr = new int[5];
//        int size = 0;
//        for (int i = 0; i < 5; i++) {
//            size = size + Integer.SIZE; // Integer.Byte = 20, .SIZE = 120
//        }
//        System.out.println(size);

//        int[] arr = {2, 12, 5, 24 ,3, 6, 8, 10};
//        int key = 24;
//        System.out.println(linSearch(arr, key));

//        revArray(arr);
//        System.out.println(Arrays.toString(arr));

//        swapAlt(arr);
//        System.out.println(Arrays.toString(arr));

//        int[] a = {1, 2, 3, 4};
//        int[] b = {3, 4, 5, 6};
//        System.out.println(arrIntersection(a, b));

//        int[] arr = {1, 1, 2, 5, 5, 5};
//        System.out.println(uniqueSearch(arr.length, arr));

//       int[] arr = {1,3,4,2,2};
//        int[] arr = {3, 3, 3, 3, 3};
//        System.out.println(findDuplicate(arr));

        int[] arr = {1, 4, 5, 3, 2, 7};
        int key = 5;

        ArrayList<int[]> result = pairSum(arr, key);

        // Print the pairs
        for (int[] pair : result) {
            System.out.println("[" + pair[0] + ", " + pair[1] + "]");
        }

    }

    // Linear Search
    public static String linSearch(int[] arr, int key) {
        int i = 0;
        while (i < arr.length) {
            if (key == arr[i]) {
                return "Found at " + i;
            }
            i++;
        }
        return "Not Found";
    }

    // Two Pointer Approach in 1
    public static void revArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void swapAlt(int[] arr) {
        int i = 0;
        int j = 1;
        while (j < arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 2;
            j += 2;
        }
    }

    public static ArrayList<Integer> arrIntersection(int[] a, int[] b) {
        ArrayList<Integer> ansList = new ArrayList<>();
//        int j = 0;
        // Math.max returns type based on type of values
        for (int i = 0; i < Math.max(a.length, b.length); i++) {
            for (int k = 0; k < Math.max(a.length, b.length); k++) {
                if (a[i] == b[k]) {
                    ansList.add(a[i]);
                    break;
                }
            }
        }
        return ansList;
    }

    // Single Among Doubles
    public static boolean uniqueSearch(int n, int[] arr) {
        ArrayList<Integer> counts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (!counts.contains(count)) {
                counts.add(count);
            } else {
                return false;
            }
        }
        return true; // if all counts in the list are unique...

    }

    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1]) return nums[i];
        return -1;
    }

    public static int[] twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    int[] ansList = {i, j};
                    return ansList;
                }
            }
        }
        return new int[]{};
    }

    public static ArrayList<int[]> pairSum(int[] arr, int key) {
        ArrayList<int[]> ansList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    ansList.add(new int[]{arr[i], arr[j]});
                }
            }
        }
        return ansList;
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ansList = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    ansList.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ansList;

    }


    public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int i = 0;

        while (i <= high) {
            if (nums[i] == 0) {
                swap(nums, i, low);
                low++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, high);
                high--;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }


}
