import java.util.HashMap;
import java.util.List;

public class Main {
  public static List<Integer> twoSum(Integer[] nums, Integer target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for (int i = 0 ; i < nums.length ; i++) {
        int complement = target - nums[i];
        if (map.containsKey(complement)) {
            return List.of(map.get(complement), i);
        }
        map.put(nums[i], i);
    }

    return List.of();
  }
  
  public static void main(String[] args) {
    Integer[] nums = {2, 7, 11, 15};
    System.out.println(twoSum(nums, 9));
  }
}
