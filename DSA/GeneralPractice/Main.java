import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of days
        int n = scanner.nextInt();
        int[] prices = new int[n];

        // Read the stock prices for each day
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        // Your code starts here
        if (n < 2) {
            // Not possible to buy and sell with less than 2 days
            System.out.print(0);
            return;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int currentPrice : prices) {
            // If we find a new, lower price to buy, update our minimum
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } 
            // Otherwise, check if selling today gives a better profit than we've seen before
            else if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }
        }

        System.out.print(maxProfit);
    }
}
