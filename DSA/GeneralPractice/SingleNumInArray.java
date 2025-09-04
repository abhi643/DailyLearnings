public class SingleNumInArray{
    public static int SingleNums(int[] arr){
        int result =0;
        for(int nums : arr){
            result ^= nums;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
        System.out.println(SingleNums(arr));
    }
}