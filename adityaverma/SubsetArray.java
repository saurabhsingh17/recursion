package adityaverma;

import java.util.ArrayList;
import java.util.List;

public class SubsetArray {
    static List<List<Integer>> result = new ArrayList<>();
    static List<List<Integer>> subset(int[] nums){
        return findSubsets(new ArrayList<>(), nums, 0);

    }
    static List<List<Integer>> findSubsets(ArrayList<Integer> out, int[] nums, int index){
        if (index == nums.length) {
            result.add(out);
            return result;
        }
        ArrayList<Integer> out2 = new ArrayList<>(out);
        out2.add(nums[index++]);
        findSubsets(out,nums,index);
        findSubsets(out2,nums,index);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(subset(arr));
    }
}
