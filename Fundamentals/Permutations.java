import java.util.ArrayList;
import java.util.List;

/* Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order. */

public class Permutations {

  public List<List<Integer>> permute(int[] nums, int start) {
    List<List<Integer>> ans = new ArrayList<>();

    if (start == nums.length - 1) {
      List<Integer> l = new ArrayList<>();
      l.add(nums[start]);
      ans.add(l);
      return ans;
    } else {
      List<List<Integer>> x = permute(nums, start + 1);

      for (int i = 0; i < x.size(); i++) {
        List<Integer> z = new ArrayList(x.get(i));

        for (int j = 0; j <= z.size(); j++) {
          List<Integer> myList = new ArrayList(z);
          myList.add(j, nums[start]);
          ans.add(myList);
        }
      }
    }

    return ans;
  }

  public List<List<Integer>> permute(int[] nums) {
    return permute(nums, 0);
  }
}
