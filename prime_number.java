import java.util.*;

public class prime_number {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Boolean isPrime = isPrimeNumber(number);

        if(isPrime == true){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }

    }

    public static Boolean isPrimeNumber(int num){
        int maxDivident = num/2;
        int ctr = 0;
        for(int i = 1; i< maxDivident;i++){
            if(num%i == 0){
                ctr++;
            }
        }
        if(ctr == 1){
            return true;
        }
        return false;
    }
}
