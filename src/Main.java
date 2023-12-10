public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        int priceOfitem = 23;
        int rate = 0;

        rate = (int) (priceOfitem * 0.05);
        System.out.println("The total sales tax for a purchase of $" + priceOfitem + " is $" + rate);
    }
}

