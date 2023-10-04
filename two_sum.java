import java.util.*;

class TwoSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target");
        int target = sc.nextInt();
        System.out.println("Enter the length");
        int length = sc.nextInt();
        int numbers[] = new int[length];
        for(int i=0; i< length;i++){
            numbers[i] = sc.nextInt();
        }
        // * o(n^2) solution....
        // for(int i = 0; i< length;i++){
        //     for(int j = length-1; j>i;j-- ){
        //         System.out.println("value of i= "+numbers[i]+" value of j= "+numbers[j]);
        //         if(numbers[i]+numbers[j] == target){
        //             System.out.println("numbers are "+i+" "+j);
        //             return;
        //         }
        //     }
        // }
        // * Solution with hashmap....
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = new int[2];
        for(int i = 0; i< length;i++){
            if(map.containsKey(target-numbers[i])){
                res[0] = i;
                res[1] = map.get(target-numbers[i]);
                System.out.println("numbers are "+res[0]+" "+res[1]);
                return;
            }
            map.put(numbers[i], i);
        }
        System.out.println("target not found");
        sc.close();

// testing push

    }
}