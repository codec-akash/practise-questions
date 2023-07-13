import java.util.*;

class reverse_word {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reverseStr = "";

        String[] wordList = str.trim().split(" ");

        for (int i = wordList.length-1; i >=0 ; i--) {
            if(wordList[i].isEmpty() == false){

                reverseStr = reverseStr.concat(wordList[i]);
                if(i>0){
                    reverseStr = reverseStr.concat(" ");
                }
            }
        }

        System.out.print("lets this check us -"+reverseStr);
        scanner.close();
    }
}