import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CandyFrequencyCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Integer> frequencyMap = new TreeMap<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int candyNumber = scanner.nextInt();
            frequencyMap.put(candyNumber, frequencyMap.getOrDefault(candyNumber, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}