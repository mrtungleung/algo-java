import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
    
        //解法1
        int[] indexs = new int[2];
        // 建立k-v 一一对应的哈希表
        Map<Integer, Integer> hash = new HashMap<>();
        //优化自动拆装箱
        Integer targer = Integer.valueOf(target);
        for (int i = 0; i < nums.length; i++) {
            Integer number = Integer.valueOf(nums[i]);
            if (hash.containsKey(number)) {
                indexs[0] = i;
                indexs[1] = hash.get(number);
                return indexs;
            }
            //将数组元素的补数作为key存入hash
            hash.put((target - number), i);
        }
        return indexs;
        
        
        //解法2：2个for循环，nums[i] + nums[j] = target
        
        //解法3：HashMap可以改成ArrayList
    }
}
