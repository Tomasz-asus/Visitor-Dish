import java.util.*;

public class Event {
    private List<Client> clients = new ArrayList<>();
    private Set<String> dish = new HashSet<>();
    private Map<Integer, Client> phoneToClient = new HashMap<>();
    Scanner scanner = new Scanner(System.in);

     public void addClients() {
         System.out.println("Give the client's name: ");
         String name = scanner.nextLine();

         System.out.println("State the preferred dish: ");
         String dish = scanner.nextLine();

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


         Client client =new Client(name, dish,phoneNumber,isVegan, isVip);

         this.dish.add(dish);
         phoneToClient.put(phoneNumber,client);
         clients.add(client);
     }

     public void displayDishs(){
         for (String dish: dish){
             System.out.println(dish);
         }
     }

     public void displayQuestByPhoneNumber(){
         System.out.println("Give phone number: ");
         Integer phoneNumber = Integer.valueOf(scanner.nextLine());
         Client quest = phoneToClient.get(phoneNumber);

         quest.displayQuestInformation();
     }

     public void displayClients() {
        for (Client quest : clients) {
            quest.displayQuestInformation();
            System.out.println();

        }
     }
}
