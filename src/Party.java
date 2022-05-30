import java.util.*;

public class Party {
    private List<Client> clients = new ArrayList<>();
    private Set<String> dish = new HashSet<>();
    private Map<Integer, Client> phoneToGuest = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

     public void addQuest () {
         System.out.println("Give the client's name: ");
         String name = scanner.nextLine();

         System.out.println("State the preferred meal: ");
         String meal = scanner.nextLine();

         System.out.println("Give the client phone number: ");
         int phoneNumber = Integer.valueOf(scanner.nextLine());

         System.out.println("is the client a vegetarian? (Y/N) ");
         String isVeganString = scanner.nextLine();

         boolean isVegan;

         if (isVeganString.equals("Y")){
             isVegan = true;
         } else{
             isVegan = false;
         }

         System.out.println("is the client a ViP ? (Y/N) ");
         String isVipString = scanner.nextLine();

         boolean isVip;

         if (isVipString.equals("Y")){
             isVip = true;
         } else {
             isVip = false;
         }


         Client client =new Client(name, meal,phoneNumber,isVegan, isVip);

         dish.add(meal);
         phoneToGuest.put(phoneNumber,client);
         clients.add(client);
     }

     public void displayMeals(){
         for (String meal: dish){
             System.out.println(meal);
         }
     }

     public void displayQuestByPhoneNumber(){
         System.out.println("Give phone number: ");
         Integer phoneNumber = Integer.valueOf(scanner.nextLine());
         Client quest = phoneToGuest.get(phoneNumber);

         quest.displayQuestInformation();
     }

     public void displayQuests() {
        for (Client quest : clients) {
            quest.displayQuestInformation();
            System.out.println();

        }
     }
}
