import java.util.*;

public class MaxSubArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        int sumOfMax=0;
        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int max = arr[i];
                for(int k=i;k<=j;k++){
                    if(arr[k]>max){
                        max = arr[k];
                    }
                }
                sumOfMax+=max;
            }
        }
        System.out.println(sumOfMax);
    }
}