import java.util.Scanner;

class BinaryBattle{
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int num = sc.nextInt();
            int matchTime = sc.nextInt();
            int breakTime = sc.nextInt();
            int numberOfRounds = 0;
            while(num >= 2){
                num = num/2;
                numberOfRounds++;
            }
            int totalTime = (numberOfRounds*matchTime)+ ((numberOfRounds-1)*breakTime);
            System.out.println(totalTime);
        }
        sc.close();
    }
}