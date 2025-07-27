import java.util.List;
import java.util.Arrays;

public class forEachMethod{

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        // Consumer<Integer> con=new Consumer<Integer>() {
   		//     public void accept(Integer n){
   		// 	    System.out.println(n);
   		//     }
   	    // };

        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));

        // nums.forEach(n -> {
        //     System.out.println("Number: " + n);
        //     if (n == 3) {
        //         System.out.println("Found 3");
        //         // return; // This will exit the lambda, not the forEach loop
        //         // break; // This will not work as expected, forEach does not support break
        //     }
        // });
    }

}