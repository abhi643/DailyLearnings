public class BinarySearch {
    // public int search(int[] arr, int target) {
    //     int left = 0, right = arr.length - 1;
    //     while (left <= right) {
    //         int mid = left + (right - left) / 2;
    //         if (arr[mid] == target) return mid;
    //         if (arr[mid] < target) left = mid + 1;
    //         else right = mid - 1;
    //     }
    //     return -1;
    // }

    public int search(int[] arr, int target, int left, int right){
        while(left<=right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) search(arr, target, mid+1, right);
            else search(arr, target, left, mid-1);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 3;
        System.out.println(solution.search(arr, target, 0, arr.length));
    }
}