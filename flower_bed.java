import java.util.*;

class flowerbed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of flowers");
        int n = scanner.nextInt();
        int flowerbed[] = { 1, 0, 0, 0, 0, 1 };

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i + 1] == 0)
                    && (i == flowerbed.length || flowerbed[i - 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }

        if (n == 0) {
            System.out.println("True");
        } else {

            System.out.println("False");
        }

        scanner.close();
    }
}