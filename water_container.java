import java.util.*;

class WaterContainer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int area = 0;
        int maxArea = 0;

        System.out.print("Enter the length : ");
        
        int numberOfHeight = sc.nextInt();
        int[] arr = new int[numberOfHeight];

        for (int i = 0; i < numberOfHeight; i++) {
            arr[i] = sc.nextInt();
        }

        // * O(n^2) solution

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                area = Math.min(arr[i], arr[j])* (j-i);
                if(maxArea <= area){
                    maxArea = area;
                }
            }
        }

        System.out.println("Maximum area is : "+maxArea);

        sc.close();
    }
}