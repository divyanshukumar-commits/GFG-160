import java.util.ArrayList;
import java.util.Collections;

public class MajorityElement2 {
    public ArrayList<Integer> findMajority(int[] arr) {
        int n = arr.length;
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;

        // Find candidates
        for (int num : arr) {
            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1++;
            } else if (count2 == 0) {
                candidate2 = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        // Verify Candidates
        count1 = 0;
        count2 = 0;

        for (int num : arr) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;
        }

        ArrayList<Integer> ans = new ArrayList<>();

        if (count1 > n / 3)
            ans.add(candidate1);
        if (count2 > n / 3)
            ans.add(candidate2);

        Collections.sort(ans);

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 2, 3, 1, 3, 2, 1, 1 };

        MajorityElement2 obj = new MajorityElement2();
        ArrayList<Integer> ans = obj.findMajority(arr);

        System.out.println(ans);
    }
}
