import java.util.*;
public class LotteryTicket {
    public static void main(String[] args) {
        System.out.println("Application started...");

        Random random = new Random();

        int numberOfNumbersGenerated = 0;
        int total = 5;

        while(numberOfNumbersGenerated < total) {

            int randomNumber = random.nextInt(30);
            System.out.println(randomNumber);
            numberOfNumbersGenerated = numberOfNumbersGenerated + 1;
        }
    }
}
