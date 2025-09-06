import java.util.Set;
import java.util.HashSet;

public class ArraysIntersection {
    // public static int[] intersection (int[] nums1, int[] nums2){
    //     Set<Integer> uniqueSet = new HashSet<>();
    //     for(int i=0;i<nums1.length;i++){
    //         for(int j=0;j<nums2.length;j++){
    //             if(nums1[i] == nums2[j]){
    //                 uniqueSet.add(nums1[i]);
    //             }
    //         }
    //     }
    //     return uniqueSet.stream().mapToInt(Integer :: intValue).toArray();
    // }

    public static int[] intersection(int[] nums1, int[] nums2){
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        return resultSet.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] nums3=intersection(nums1, nums2);
        for(int num : nums3){
            System.out.print(num);
        }
    }
}
