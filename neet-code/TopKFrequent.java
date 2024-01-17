
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TopKFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the freq");

        int k = sc.nextInt();

        TopKFrequent topKFrequent = new TopKFrequent();

        int[] res = topKFrequent.topKFrequent(arr, k);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        sc.close();

    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqCtn = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!freqCtn.containsKey(nums[i])) {
                freqCtn.put(nums[i], 1);
            } else {
                freqCtn.put(nums[i], freqCtn.get(nums[i]) + 1);
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(freqCtn.keySet());
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < keys.size(); i++) {
            if (freqCtn.get(keys.get(i)) >= k) {
                result.add(keys.get(i));
            }
        }

        if (result.isEmpty()) {
            return nums;
        }

        int[] res = new int[result.size()];

        for (int i = 0; i < res.length; i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
