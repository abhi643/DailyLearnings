import java.util.*;

public class BestTimeToSellStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        if (n < 2) {
            System.out.print(0);
            return;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int currentPrice : prices) {
            if (currentPrice < minPrice) {
                minPrice = currentPrice;
            } 
            else if (currentPrice - minPrice > maxProfit) {
                maxProfit = currentPrice - minPrice;
            }
        }

        System.out.print(maxProfit);
    }
}