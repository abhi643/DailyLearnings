import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapOperations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        Map<String, Integer> studentMarks = new HashMap<>();

        for (int i = 0; i < q; i++) {
            String command = scanner.next();

            switch (command) {
                case "add":
                    String nameAdd = scanner.next();
                    int marks = scanner.nextInt();
                    studentMarks.put(nameAdd, marks);
                    break;

                case "erase":
                    String nameErase = scanner.next();
                    studentMarks.remove(nameErase);
                    break;

                case "print":
                    String namePrint = scanner.next();
                    System.out.println(studentMarks.getOrDefault(namePrint, 0));
                    break;
            }
        }

        scanner.close();
    }
}