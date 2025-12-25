package arrays;

import java.util.Arrays;
import java.util.Random;

public class LottoTicket {
    private static final int LENGHT = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateTicket();
        printTicket(ticket);
    }

    public static int[] generateTicket() {
        int[] ticket = new int[LENGHT];
        Random random = new Random();

        for (int i = 0; i < LENGHT; i++) {
            int randomNumber;

            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER);
            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    public static boolean search(int[] array, int numberToSearchFor) {
        for (int value : array) {
            if (value == numberToSearchFor) return true;
        }
        return false;
    }

    public static void printTicket(int[] ticket) {
        Arrays.sort(ticket);
        for (int number : ticket) {
            System.out.print(number + " ");
        }
    }
}
