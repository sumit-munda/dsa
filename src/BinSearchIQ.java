public class BinSearchIQ {

    // find first and last occurrence
    public static int[] searchRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        while(s <= e) {
            int m = s + (e - s) / 2;
            if(nums[m] == target) {
                nums[0] = m;
                e = m - 1;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        if(nums[0] == -1) {
            return ans;
        }

        s = 0;
        e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if(nums[m] == target) {
                nums[1] = m;
            } else if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
         return ans;
    }

    // peak in a mountain array
        public int peakIndexInMountainArray(int[] arr) {
            int s = 0;
            int e = arr.length - 1;
            while(s < e) {
                int m = s + (e - s)/2;
                if(arr[m] < arr[m + 1]) {
                    s = m + 1;
                } else {
                    e = m;
                }
            }
           return s;
        }

        // peak 2
            public int peakIndexInMountainArray2(int[] arr) {
                for (int i = 1; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                        return i;
                    }
                }
                return -1;
            }

            // peak 3
            public int peakIndexInMountainArray3(int[] arr) {
                int s = 0;
                int e = arr.length - 1;
                while (s <= e) {
                    int m = s + (e - s) / 2;
                    if (arr[m] < arr[m + 1]) {
                        s = m + 1;
                    } else {
                        e = m;
                    }
                }
                return s;
            }
        }




