import java.util.*;

public class ContainerWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ContainerWater containerWater = new ContainerWater();

        int ans = containerWater.maxArea(arr);

        System.out.println(ans);

        sc.close();
    }

    public int maxArea(int[] heights) {
        int res = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            res = Math.max(area, res);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}

// [1,7,2,5,4,7,3,6]
// [2,2,2]
