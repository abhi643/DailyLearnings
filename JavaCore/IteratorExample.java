import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry"); 
        list.add("Date");
        list.add("Elderberry");

        System.out.println("Original List: " + list);

        Iterator<String> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            if (fruit.equals("Cherry")) {
                iterator.remove(); // Remove "Cherry" from the list
            }
        }

        System.out.println("List after removal: " + list);
    }
}