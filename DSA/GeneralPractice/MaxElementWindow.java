import java.util.*;

public class MaxElementWindow {
    public static void main(String[] args) {
        // Your code starts here
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int left=0;left<=n-k;left++){
            int right=left+k-1;
            int max=arr[left];
            for(int i=left;i<=right;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            System.out.print(max);
            if(left != n-k) {
                System.out.print(" ");
            }
            right++;
        }
    }
}