import java.util.*;

public class TopKFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.err.println("Enter the k range");

        int k = sc.nextInt();

        TopKFrequent topKFrequent = new TopKFrequent();
        int[] ans = topKFrequent.topKFrequent(numbers, k);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

        sc.close();
    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        List<List<Integer>> elementList = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            elementList.add(new ArrayList<>());
        }

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            elementList.get(entry.getValue()).add(entry.getKey());
        }

        int[] res = new int[k];

        int index = 0;

        for (int i = elementList.size() - 1; i >= 0 && index < k; i--) {
            for (int j = 0; j < elementList.get(i).size(); j++) {
                res[index++] = elementList.get(i).get(j);
                if (index == k) {
                    return res;
                }
            }
        }

        return res;
    }
}
