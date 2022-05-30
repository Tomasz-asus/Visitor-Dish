public class Client {
    private String name;
    private String dish;
    private int phoneNumber;
    private boolean isVegan;
    private boolean isVip;

    public boolean isVip() {
        return isVip;
    }

    public Client(String name, String dish, int phoneNumber, boolean isVegan, boolean isVip) {
        this.name = name;
        this.dish = dish;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
        this.isVip = isVip;
    }

    public String getName() {
        return name;
    }

    public String getDish() {
        return dish;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void displayQuestInformation(){
        System.out.println("Name: "+ name);
        System.out.println("Dish: " + dish);
        System.out.println("Phone number: "+ phoneNumber);
        String isVeganString = isVegan ? "yes" : "no";
        System.out.println("Vegan?: " + isVeganString);
        String isViPString = isVip ? "yes" : "no";
        System.out.println("ViP?: " + isViPString);
    }

}
