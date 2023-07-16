import java.util.*;

public class Container_volume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        Container_volume container_volume = new Container_volume();

        int maxArea = container_volume.maxArea(arr);

        System.out.println(maxArea);

    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;

        while (left<right) {
            int area = (right-left)*(Integer.min(height[left], height[right]));
            if(area > max){
                max = area;
            }
            if(height[left] >= height[right]){
                right--;
            }else {
                left++;
            }
        }
        return max;
    }
}