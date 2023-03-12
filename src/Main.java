public class Main {
    public static void main(String[] args) {
        int amountTicket = 28365;
        int amountRuble = 20;

        int amountMiles = (amountTicket / amountRuble);

        System.out.println("Бонусные мили: " + amountMiles);
    }
}
