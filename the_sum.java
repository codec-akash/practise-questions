import java.util.*;

class ThreeSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length");
        int len = sc.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the target");
        int target = sc.nextInt();

        // * a+b+c = target; b+c = target-a;
        target -= numbers[0];

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[] res = new int[3];
        res[0]= 1;

        for(int i = 1;i<len;i++){
            if(map.containsKey(target-numbers[i])){
                res[1]=i;
                res[2] = map.get(target-numbers[i]);
                System.out.println("Numbers are "+res[0]+" "+res[1]+" "+res[2]);
                return;
            }
            map.put(numbers[i], i);
        }
        System.out.println("Numbers are "+res[0]+" "+res[1]+" "+res[2]);



        sc.close();
    }
}