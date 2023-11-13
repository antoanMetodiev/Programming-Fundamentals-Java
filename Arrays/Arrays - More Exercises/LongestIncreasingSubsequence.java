import java.util.ArrayList;
import java.util.Scanner;
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        ArrayList<Integer> lis = findLIS(nums);
        for (int num : lis) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> findLIS(int[] nums) {
        int n = nums.length;
        int[] len = new int[n];
        int[] prev = new int[n];
        int maxLen = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            len[i] = 1;
            prev[i] = -1;

            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && len[i] < len[j] + 1) {
                    len[i] = len[j] + 1;
                    prev[i] = j;
                }
            }

            if (len[i] > maxLen) {
                maxLen = len[i];
                maxIndex = i;
            }
        }

        ArrayList<Integer> lis = new ArrayList<>();
        while (maxIndex != -1) {
            lis.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }

        ArrayList<Integer> reversedLis = new ArrayList<>();
        for (int i = lis.size() - 1; i >= 0; i--) {
            reversedLis.add(lis.get(i));
        }
        return reversedLis;
    }
}
