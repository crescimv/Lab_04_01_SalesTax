public class Main
{
    public static void main(String[] args)
    {
        //declarations
        double purchasePrice = 10.50;
        double percentTax = 0.05;

        double salesTax = purchasePrice * percentTax;
        double totalCost = purchasePrice + salesTax;

        System.out.println("Your sales tax is " + salesTax + " and your total is " + totalCost);
    }
}