import java.util.Scanner;

public class TwoNumbersNeverOccurToEachOther {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        int arrLength = input.nextInt();
        int[] numArray = new int[arrLength];
        for (int i = 0; i < numArray.length; i++) {
            int index = input.nextInt();
            numArray[i] = index;
        }

        int factor = input.nextInt();
        int factor2 = input.nextInt();
        boolean occur = true;
        for(int i = 0; i<numArray.length; i++){
            if (factor == numArray[i] || factor2 == numArray[i]) {
                if(i > 0 && (numArray[i - 1] == factor || numArray[i - 1] == factor2) && (numArray[i] == factor || numArray[i] == factor2)){
                    occur = false;
                    break;
                }
            }
        }
        System.out.println(occur);
    }
}
