public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 1) return;
        int slow =0;
        for(int fast =0; fast<nums.length; fast++){
            if(nums[fast] !=0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        for(int i = slow; i<nums.length; i++){
            nums[i] =0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
