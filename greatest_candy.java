import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greatest_candy {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] candies = new int[] {4,5,6,3,5};

        Boolean[] candiesExtra = new Boolean[candies.length];

        int extra = 3;

        int max = 0;

        for(int i = 0; i < candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if((candies[i]+extra) > max){
                candiesExtra[i] = true;
            }else {
                candiesExtra[i] = false;
            }
        }

        for (int i = 0; i < candiesExtra.length; i++) {
            System.out.println(candiesExtra[i]);
        }

    }    
}
