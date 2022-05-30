import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Event party = new Event();

        while ( shouldContinue ) {
            System.out.println("Select options: ");
            System.out.println("1. Show clients");
            System.out.println("2. Add clients");
            System.out.println("3. Display dish");
            System.out.println("4. Display phone");
            System.out.println("5. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1 -> party.displayClients();
                case 2 -> party.addClients();
                case 3 -> party.displayDishs();
                case 4 -> party.displayQuestByPhoneNumber();
                case 5 -> shouldContinue = false;
            }
        }
    }
}