import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        Scanner scan = new Scanner(System.in);

        int totalNums = 7;
        int[] userNums = new int[totalNums];
        int[] secretNums = new int[totalNums];

        for(int i = 0; i < totalNums; i++){
            secretNums[i] = r.nextInt(6);

        }
        System.out.println("Try to remember the following numbers. The numbers will be shown for 5 seconds.");
        for (int num : secretNums) {
            System.out.print(num + " ");
        }

        try {
            Thread.sleep(5000);
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }for (int i = 0; i < 20; ++i) {//dont know how to clean
            System.out.println();
        }
         for (int i = 0; i < totalNums; i++){
             System.out.println("Type number "+ (i + 1) + " :");
             userNums[i] = scan.nextInt(6);
         }

        int correctCount = 0;
         for (int i = 0; i < totalNums; i++){
             if(secretNums[i] == userNums[i]){
                 correctCount++;
             }
         }

        double percentage = ((double) correctCount / totalNums) * 100;

        System.out.println("\nThe numbers were:");
        for (int num : secretNums) {
            System.out.print(num + " ");
        }

        System.out.println("\nYour numbers were:");
        for (int num : userNums) {
            System.out.print(num + " ");
        }

        System.out.println("");
        System.out.println("You got " + correctCount + " out of " + totalNums + " correct!");
        System.out.println();

        scan.close();

    }
}