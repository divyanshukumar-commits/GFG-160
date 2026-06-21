/*class Solution {                YE WALA GALAT H !!!
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] >= arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 3)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1, 3, 2, 1, 1 };
        Solution obj = new Solution();
        obj.findMajority(arr);
    }
}*/

// Correct Code

import java.util.ArrayList;

class Solution {

    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;

        ArrayList<Integer> ans = new ArrayList<>();

        // Sorting
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Counting Frequencies
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 3 && !ans.contains(arr[i])) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1, 3, 2, 1, 1 };

        Solution obj = new Solution();
        ArrayList<Integer> ans = obj.findMajority(arr);

        System.out.println(ans);
    }
}
