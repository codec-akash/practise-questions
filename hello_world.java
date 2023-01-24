import java.util.*;

class Abc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int alice = sc.nextInt();

            int bob = sc.nextInt();
            int sum = alice + bob;
            int ctr = 0;
            for (int i = 1; i <= Math.floor(sum / 2); i++) {
                if (sum % i == 0) {

                    ctr++;
                }
            }
            if (ctr == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
        sc.close();
    }
}